# start_scala
프로젝트 투입 전 scala 공부 - Programming in Scala 4판

- [1장](#1장)
    * [확장 가능한 언어](#확장-가능한-언어)
    * [새로운 제어 구조](#새로운-제어-구조)
- [2장, 3장](#2장--3장)
    * [변수 정의하기](#변수-정의하기)
    * [함수 정의하기](#함수-정의하기)
    * [Array, List, Tuple, Set, Map](#array--list--tuple--set--map)
    * [함수형 프로그래밍](#함수형-프로그래밍)
- [4장](#4장)
    * [클래스](#클래스)
    * [세미콜론 추론](#세미콜론-추론)
    * [싱글톤 객체](#싱글톤-객체)

# 1장

## 확장 가능한 언어

Scala는 확장 가능한(Scalable) 언어 라는 뜻이다.

스칼라는 사용자의 요구에 따라 확장이 얼마든지 가능한 언어이다.

기술적으로는 객체지향과 함수형 프로그래밍 개념을 합쳐놓은 정적 타입 언어이다.

> 함수형 프로그래밍 (자료 처리를 수학적 함수의 계산으로 취급하는 프로그래밍 패러다임)

> 특징: Side-Effect 발생하지 않음, 순수 함수, 불변 값 활용, 1급 객체, 참조 투명성

> 정적 타입 언어: 컴파일 시 변수의 타입이 결정되는 언어

## 새로운 제어 구조

스칼라는 확장성 원칙을 제어구조에 적용하는데, 이는 액터 기반 동시성 프로그래밍 이며, Akka에서 확인이 가능하다

다중 프로세서가 확산됨에 따라 병령성을 통한 유의미한 성능을 내는 것이 중요한데, Java에는 스레드 기반 동시성 라이브러리가 있다면 스칼라는 이를 활용할 수 있다.

> 액터: 스레드 위에 구현할 수 있는 동시성 수상화 요소. 서로 메시지를 송/수신하며 통신

---

# 2장, 3장

## 변수 정의하기

스칼라에서 변수를 정의하는 방법은 val, var 2가지 이다. 타입추론이 가능하므로 타입을 명시하지 않아도 된다.

스칼라에서는 var 보다는 val 사용을 권장한다.

> val: java의 final과 유사한, 초기화 후 재할당이 불가능한 변수

> var: 재할당이 가능한 변수

## 함수 정의하기

스칼라는 파라미터 타입을 추론하지 않기 때문에, 함수의 파라미터와 결과는 타입을 지정해야한다.

스칼라는 함수의 반환 값에 대해 명시적인 return을 사용하지 않아도 된다. 마지막 표현식이 함수의 반환 값이 된다.

또한 메소드의 파라미터는 val 이다. 파라미터로 받은 값을 수정할 수 없다.

```scala
// 리턴 값이 없으면 : Unit을 사용한다 - 다른 언어의 void와 유사함
def plusVal(a: Int, b: Int): Int = {
  a + b
}

def plusVal(a: Int, b: Int): Int = {
  a = 12 //  불가능
  a + b
}
```

## Array, List, Tuple, Set, Map

**Array**

원소에 접근하려면 []이 아닌 ()로 접근한다. 길이를 변경할 수 없지만, 원소는 변경할 수 있다.

스칼라는 1번의 예시 보다는 2번의 예시처럼 선언하는 것을 지향하고, 팩토리 메소드를 호출한다.

```scala
// 1
val arrayTest = new Array[String](2)
array(0) = "a"
array(1) = "b"

//2
val arrayTest = Array("a", "b")
```

> 팩토리 메소드: 인스턴스화하여 제공하는 메소드

**List**

List는 길이와 원소 둘 다 변경할 수 없다. 그리고 콘즈 (::) 라는 연산자를 사용한다.

빈 List를 Nil이라고 줄여 쓸 수 있다.

```scala
val listTest = List(1, 2, 3)
val consTest = 5 :: listTest // List(5, 1, 2, 3)
val nilTest = 1 :: 2 :: 3 :: Nil // Nil
```

**Tuple**

Tuple은 리스트와 동일하게 길이와 원소 둘 다 변경할 수 없지만, 다른 타입의 원소를 넣을 수 있다.

Tuple은 인덱스가 1부터 시작하며, 원소에 접근하려면 ._다음 인덱스를 적는다

```scala
val tupleTest = (1, "b", 3)
println(tupleTest._1)
println(tupleTest._2)
println(tupleTest._3)
```

**Set**

Set은 변경 불가능한 집합이다. 하지만 원소를 추가할 수는 있는데 이 경우 새로운 Set을 만들어서 반환한다.

```scala
var setTest = Set(1, 2)
setTest += 3
println(setTest.contains(3))
```

**Mutable Set**

Mutable Set은 변경 가능한 집합이다. 이 경우 collection 라이브러리를 추가해야 한다.

```scala
import scala.collection.mutable
var setTest = mutable.Set("a", "b")
setTest += "c"
```

**Map**

Map도 Set과 유사하게 변경가능한 것과 불가능 한 것이 존재한다.

```scala
// 변경 불가능
val map_test = Map(0 -> "c", 1 -> "a", 2 -> "b")
```

```scala
// 변경 가능
val map_test = mutable.Map[Int, String]()
map_test += (0 -> "c")
map_test += (1 -> "a")
map_test += (2 -> "b")
```

## 함수형 프로그래밍

var이나 부수효과가 없는 예시 코드이다.

```scala
// 명령형
var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}

// 함수형 1
for (arg <- args) {
  println(arg)
}
// 함수형 2
args.foreach(println)
```

---

# 4장

## 클래스

클래스는 객체에 대한 청사진이다. 자바와 비슷한 개념이다.아래의 코드를 보면 Test라는 class를 만들었다.

그리고 불변하는 값인 val로 선언을 하더라도 클래스의 내부의 값은 접근 후 수정이 가능하다.

하지만 다른 객체를 재할당 하는 것은 불가능 하다. 접근 제어자로는 public, protected, private이 있다.

public이 default이니 굳이 명시하지 않아도 된다.

```scala
class Test {
    var sum = 0

    // add 메소드는 sum의 값을 재할당하는 부수효과를 가지고 있다.  - 프로시저
    def add(b: Int): Unit = { sum += b } 
  }

  val a = new Test

  a.sum = 10

  a = new Test // val 불가능
```

> 프로시저: 부수효과만을 위해 실행되는 메소드

> 강건성: 컴퓨터 시스템이 실행 중 오류와 잘못된 입력에 대처하는 능력

> 캡슐화: 클래스 안에 있는 연관된 속성 및 행위를 하나의 캡슐로 만들어 외부로부터 보호

## 세미콜론 추론

스칼라는 세미콜론(;)을 생략할 수 있다. 덧셈과 같은 의도가 있다면, 연산자를 뒤에 적거나, 괄호() 로 감싸라

```scala
// 1
(x + y)

// 2
x +
y
```

## 싱글톤 객체

스칼라가 자바보다 객체지향인 이유 중 하나는 정적 멤버가 없다는 것이다. 대신에 싱글톤 객체를 제공한다.

클래스와 유사해보이지만 class 대신 object 키워드로 시작 된다. 싱글톤 객체 정의는 타입을 정의하지 않는다.

---

