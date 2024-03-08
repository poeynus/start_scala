# start_scala
프로젝트 투입 전 scala 공부 - Programming in Scala 4판

- [1장](#1장)
  * [확장 가능한 언어](#확장-가능한-언어)
  * [새로운 제어 구조](#새로운-제어-구조)
- [2장,-3장](#2장-3장)
  * [변수 정의하기](#변수-정의하기)
  * [함수 정의하기](#함수-정의하기)
  * [Array, List, Tuple, Set, Map](#array-list-tuple-set-map)
  * [함수형 프로그래밍](#함수형-프로그래밍)
- [4장](#4장)
  * [클래스](#클래스)
  * [세미콜론 추론](#세미콜론-추론)
  * [싱글톤 객체](#싱글톤-객체)
  * [App 트레이트](#app-트레이트)
- [5장](#5장)
  * [타입](#타입)
  * [리터럴](#리터럴)
  * [문자열 인터폴레이션](#문자열-인터폴레이션)
  * [연산자는 메소드다.](#연산자는-메소드다.)
  * [산술 연산, 관계 연산, 논리 연산, 비트 연산, 객체 동일성](#산술-연산-관계-연산-논리-연산-비트-연산-객체-동일성)
  * [연산자 우선순위와 결합 법칙](#연산자-우선순위와-결합-법칙)
  * [풍부한 래퍼](#풍부한-래퍼)
- [6장](#6장)
  * [분수 클래스 명세](#분수-클래스-명세)
- [7장](#7장)
  * [if 표현식](#if-표현식)
  * [while 루프](#while-루프)
  * [for 표현식](#for-표현식)
- [8장](#8장)
  * [메소드](#메소드)
  * [지역 함수](#지역-함수)
  * [1급 계층 함수](#1급-계층-함수)
  * [간단한 형태의 함수 리터럴](#간단한-형태의-함수-리터럴)
  * [위치 표시자 문법](#위치-표시자-문법)
  * [부분 적용한 함수](#부분-적용한-함수)
  * [클로저](#클로저)
  * [특별한 형태의 함수 호출](#특별한-형태의-함수-호출)
  * [꼬리 재귀](#꼬리-재귀)
  * [꼬리 재귀의 한계](#꼬리-재귀의-한계)
- [9장](#9장)
  * [코드 중복 줄이기](#코드-중복-줄이기)
  * [클라이언트 코드 단순하게 만들기](#클라이언트-코드-단순하게-만들기)
  * [커링](#커링)
  * [새로운 제어 구조 작성](#새로운-제어-구조-작성)
  * [이름에 의한 호출 파라미터](#이름에-의한-호출-파라미터)
- [10장](#10장)
  * [2차원 레이아웃 라이브러리](#2차원-레이아웃-라이브러리)
  * [추상 클래스](#추상-클래스)
  * [파라미터 없는 메소드 정의](#파라미터-없는-메소드-정의)
  * [클래스 확장](#클래스-확장)
  * [메소드와 필드 오버라이드](#메소드와-필드-오버라이드)
  * [파라미터 필드 정의](#파라미터-필드-정의)
  * [슈퍼클래스의 생성자 호출](#슈퍼클래스의-생성자-호출)
  * [override 수식자 사용](#override-수식자-사용)
  * [다형성과 동적 바인딩](#다형성과-동적-바인딩)
  * [final 멤버 선언](#final-멤버-선언)
  * [상속과 구성 사용](#상속과-구성-사용)
  * [above, beside, toString 구현](#above-beside-toString-구현)
  * [팩토리 객체 정의](#팩토리-객체-정의)
- [11장](#11장)
  * [스칼라의 클래스 계층구조](#스칼라의-클래스-계층구조)
  * [바닥에 있는 타입](#바닥에-있는-타입)
  
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

```scala
// 클래스 ChecksumAccumulator 정의
class ChecksumAccumulator{
  private var sum = 0
  def add(b: Byte) = sum += b
  def checksum(): Int = return (sum & 0xFF)
}


// 싱글톤 객체 ChecksumAccumulator 정의
object ChecksumAccumulator extends App{
  private val cache = mutable.Map.empty[String, Int]
  def calculate(s: String) : Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator    // 여기서의 ChecksumAccumulator 는 class이다. new는 클래스를 인스턴스화 할 때만 사용한다.
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)          // 한번 계산한 checksum을 캐싱하기 위한 변경 가능한 맵
      cs
    }
}
```
> 싱글톤 객체는 아직 이해를 못했고, 일단 정리만 했다.

---

## App 트레이트

여러 클래스에서 공통으로 사용되는 메서드와 필드의 집합을 정의하는 방법

> 트레이트를 사용하기 위해서는 정의할 싱글톤 뒤에 extends App 이라고 선언한다.
 
> main 메소드를 선언하는 대신, main 메소드에 넣고 싶은 코드를 extends App와 같이 선언된 싱글톤 객체에 정의하면 된다.

```scala
import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring")) println(season + calculate(season))
}
```

---

# 5장

## 타입

자바의 기본 타입과 연산자가 스칼라에서도 정확히 일치한다.

기본 타입: String

값 타입:  Int, Long, Short, Byte, Float, Double, Char, Boolean

## 리터럴

기본 타입은 모두 리터럴로 적을 수 있다.

> 리터럴: 상숫값을 코드에 직접 적는것

> 스칼라는 8진 리터럴을 지원하지 않기에, 0으로 시작하는 031 같은 정수 리터럴은 컴파일 되지 않는다.

> 스칼라는 리터럴에 사용한 진법과 관계없이 항상 밑을 10으로 하는 정수를 출력한다.

> Int 리터럴을 Short나 Byte 변수에 할당하면, 그 리터럴의 값이 각 대상 타입의 범위 안에 있는 한 해당 타입으로 취급한다.

**정수 리터럴**

Int, Long, Short, Byte에 사용하며 10진, 16진 리터럴이 있다. 0 ~ 9, A ~ F 를 자리에 사용할 수 있다.

```scala
val dec1 = 31
val prog = 0XCAFEBABEL
val t = 30L
val lit: Short = 367
val a: Byte = 38
```

**부동 소수점 리터럴**

부동소수점 리터럴은 십진 숫자들로 이뤄진다. 소수점이 있을 수도 있고, 마지막에 E나 e 다음에 지수부분이 있을 수 있다.

f나 F로 끝나면 float이며, 그렇지 않으면 Double이다.

```scala
val a = 1.2345
val b = 1.2345e1
val c = 1.2345F
val d = 3e5f
val e = 3e5
val f = 3e5f
```

**문자 리터럴**

문자 리터럴은 작은 따옴표 안에 유니코드 문자를 넣어 만든다. 이스케이프 시퀀스도 표현 가능하다.

```scala
val a = 'A'
val b = '\u0041'
val c = '\\'
```

**문자열 리터럴**

문자열 리터럴은 큰따옴표 둘로 둘러싼 문자열로 이뤄진다. 방식은 문자 리터럴과 동일하다. 여러줄에 걸친 문자열인 경우 큰따옴표를 3개 사용한다.

```scala
val a = "asdasd"
val b =
  """|hi
     |im
     |happy""".stripMargin()
```
**심볼 리터럴**

심볼 리터럴은 ident 처럼 쓴다. 작은 따옴표 뒤에 오는 식별자 부분은 알파벳과 숫자를 혼합한 올바른 식별자라면 아무것이나 가능하다.

> 어디에 쓰이는지 모르겠다.

**불리언 리터럴**

Boolean 타입의 리터럴에는 true와 false가 있다.

```scala
val a = true
val b = false
```

## 문자열 인터폴레이션

문자열 리터럴 내부에 표현식을 내장시킬 수 있다. 

```scala
val a = "test"
println(s"Hello, $a!")
val b = f"${math.Pi}%.5f"
```

## 연산자는 메소드다.

기본 타입의 풍부한 연산자를 제공한다.

```scala
val a = 1.+(2)
println(a)

val b = "Hello world!"
println(b indexOf('o', 5)) // 5번째 문자부터 o 검색

// 전위 연산자
def main(args: Aarray[String]): Unit = {
  val test = new Test(5)
  println(+test)
  println(-test)
  println(*test)  // not found Error
}
class Test(val num: Int) {
  def unary_+(): Int = if(num > 0) num else -num
  def unary_-(): Int = if(num > 0) -num else num
  def unary_*(): Int = num * num
}
```

> 모든 메소드는 연산자가 될 수 잇다. 스칼라에서 연산자는 문법적으로 특별한 것이 아니다. 어떤 메소드든 연산자가 될 수 있다.

---

## 산술 연산, 관계 연산, 논리 연산, 비트 연산, 객체 동일성

모든 수 타입에 대해 더하기(+), 빼기(-), 곱하기(*), 나누기(/), 나머지(%)를 중위 연산자를 사용해 계산할 수 있다.

수 타입을 크다(>), 작다(<), 크거나 같다(>=), 작거나 같다(<=) 라는 관계 연산자를 사용해 비교 가능하다. 결과는 Boolean이다.

비트 연산자는 비트곱(&), 비트합(|), 비트 배타합(^)이 있다.

두 객체가 같은지 비교하려면 == 을 사용하고, 같지 않은지를 비교하려면 != 을 사용한다. 자동으로 null을 체크하기 때문에 직접 null 검사할 필요가 없다.

> 자바와 동일하니 예시는 pass

> &&, || 는 쇼트 서킷 연산이다. 

> 쇼트 서킷 연산 : 두 피연산자 중 어느 한쪽만 '참'이면은 우측 피연산자의 값은 평가하지 않고 바로 결과를 얻는 행위

## 연산자 우선순위와 결합 법칙

표현식에서 어떤 부분을 먼저 실행할지를 결정할 때 연산자 우선순위를 사용한다.

스칼라에서 연산자라는 개념은 홀로 존재하는 것이 아니고 메소드를 연산자 표기로 쓸 뿐이다.

> 2 + 2 * 7 == 2 + (2 * 7)

> a +++ b *** c == a +++ (b *** c) 

> 스칼라의 우선순위를 안다고 하더라도 명확히 표시하여 주는 것이 좋다.

## 풍부한 래퍼

스칼라 기본 타입에 더 유용한 메서드를 제공해주는 풍부한 래퍼 클래스로 변환하는 암시적 변환이 존재한다. 

[wrapper class - common types](https://www.baeldung.com/scala/rich-wrappers)

# 6장

## 분수 클래스 명세

분수는 분자와 분모를 가지고 있는 값이다. 우리는 분수의 일부 기능을 구현해야 한다. 그리고 Rational(만드는 것) 클래스를 통해 구현한다.

```scala
val oneHalf = new Rational(1, 2) // 2 분의 1
```

**Rational 생성**

클래스를 정의한다.

```scala
class Rational(n: Int, d: Int) {
  println("Created " + n + "/" + d)
}
```

**toString 다시 구현하기**

기본적으로 java.lang.Object의 toString을 물려받지만 이름,@,16진수로 나와 그다지 유용하지 않다. 오버라이드를 통해 재정의한다.

```scala
class Rational(n: Int, d: Int) {
  override def toString = s"$n/$d"
}
```

**선결 조건 확인**

위의 class에서 분모는 0이 될 수 없다. 그러니 조건을 걸어준다. 전달 받은 값이 참이 아니라면 IllegalArgumentException이 발생한다.

```scala
class Rational(n: Int, d: Int) {
  require(d != 0)
  override def toString = s"$n/$d"
}
```

**필드 추가**

본격적으로 덧셈 기능을 추가한다.

```scala
class Rational(n: Int, d: Int){
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = s"$n/$d"
  def add(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom, denom * that.denom
    )
  }
}
```

**자기 참조**

현재 실행 중인 메서드의 호출 대상 인스턴스에 대한 참조를 자기 참조라고 한다. 생성자 내부에서는 자기 참조가 생성 중인 객체의 인스턴스를 가리킨다.

```scala
def lessThan(that: Rational): Boolean = {
  // this 생략 가능
  this.numer * that.denom < that.numer * this.denom
}

def max(that: Rational): Rational = {
  // this.lessThan은 생략 가능 else this는 생략 불가
  if(this.lessThan(that)) that else this
}
```

**보조 생성자**

하나의 클래스에 여러 생성자가 필요한 경우 주 생성자가 아닌 다른 생성자를 보조 생성자라 부른다.

```scala
def this(n: Int) = {
  this(n, 1)
}

val y = new Rational(3) // 3/1
```

> 스칼라가 자바보다 생성자 관련 규칙이 엄격하다. 스칼라는 주 생성자만이 슈퍼클래스의 생성자를 호출할 수 있기 때문이다.

> 더 간결하고 단순하게 만드는 대신 유연성을 포기한 것이다.

**비공개 필드와 메서드**

66/42 같은 경우 11/7로 약분 가능한데 현재는 처리하지 않는다. 이를 비공개 필드와 메서드로 처리 한다.

```scala
val numer: Int = n
val denom: Int = d

private val g = gcd(n.abs, d.abs)

private def gcd(a: Int, b: Int): Int = {
  if (b == 0) a else gcd(b, a % b)
}

val y = new Rational(66, 42) // 11/7
```

**연산자 정의**

분수에서 add 함수를 계속 쓰는 것 보다는 + 와 같은 것으로 사용하는 것이 좋다.

```scala
def + (that: Rational): Rational = {
  new Rational(
    numer * that.denom + that.numer * denom, denom * that.denom
  )
}

def * (that: Rational): Rational = {
  new Rational(numer * that.numer, denom * that.denom)
}

x + y // 1/2 + 2+3 = 7/6
x.add(1, 2) // X
```

**메서드 오버로드**

오버라이드가 가능했던 것처럼, 오버로드 역시 가능하다. 따라서 다양한 연산을 진행할 수 있다. 

스칼라에서 오버로드 메서드를 처리하는 방법은 Java와 거의 유사하다. 오버로드한 메서드 중 인자의 정적인 타입과 가장 잘 일치하는 버전을 선택하여 실행된다.

# 7장

## if 표현식

스칼라의 if는 다른 언어와 마찬가지로 동작한다.

```scala
val filename =
  if(!args.isEmpty) args(0)
  else "default.txt"
```

## while 루프

while 루프 또한 동일하다.

```scala
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

// 재귀를 사용한 최대 공약수
def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(t, x % y)
```

> while과 do-while이 이루는 구조는 수행 결과가 관심을 가질만한 값이 아니기 때문에 표현식이 아닌 루프 라고 부른다.

## for 표현식

**컬렉션 이터레이션**

for 표현식은 반복 처리를 위한 만능 칼이라 할 수 있다. 그리고 가장 간단한 일은 컬렉션에 있는 모든 요소를 이터레이션 하는 것이다.

```scala
// 제네레이터를 사용한 이터레이션
val filesHere = (new java.io.file(".")).listFiles
for (file <- filesHere)
  println(file)
```

**필터링**

전체 컬렉션을 걸러내서 그 일부만 사용하고 싶은 경우 필터를 추가한다.

```scala
val filesHere = (new java.io.File(".")).listFiles()
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

// 명령형 프로그래밍 형태
for (file <- filesHere)
  if(file.getName.endsWith(".scala"))
    println(file)
    
// 여러 조건
for (file <- filesHere 
     if file.isFile 
     if file.getName.endsWith(".scala")) println(file)
```

**중첩 이터레이션**

여러개의 <- 절을 추가하면 중첩 루프를 작성할 수 있다.

```scala
def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines()toArray

def grep(pattern: String) =
  for(
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) println(s"$file: ${line.trim}")
grep(".*gcd.*")
```

**for 중에 변수 바인딩하기**

val, var 변수처럼 선언하고 사용하면 되는데, val이나 var 키워드를 사용하지는 않는다.

```scala
def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines()toArray

def grep(pattern: String) =
  for(
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    trimmed = line.trim // 변수 바인딩
    if trimmed.matches(pattern)
  ) println(s"$file: ${trimmed}")
grep(".*gcd.*")
```

**새로운 컬렉션 만들어내기**

yield를 사용하면 이터레이션의 매 반복 단계의 결과를 저장하기 위한 값을 만들 수 있다.

yield는 코드 블록의 마지막이 아니라 여는 중괄호 앞에 위치해야 한다.

```scala
def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

val numbers = List(1, 2, 3, 4, 5)
val squaredNumbers = for (num <- numbers) yield num * num
// squaredNumbers는 List(1, 4, 9, 16, 25)
```

**try 표현식으로 예외 다루기**

예외는 여타 언어와 유사하게 동작한다.

```scala
// 예외 발생시키기
throw new IllegalArgumentException

val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")
```

**발생한 예외 잡기**

스칼라의 중요한 부분인 패턴 매치와의 일관성을 유지하여 catch 절을 작성한다.

```scala
try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundException => // 파일 못찾는 경우
  case ex: IOException => // 그 밖의 오류
}
```

**finally 절**

표현식의 결과가 어떻든 특정 코드를 반드시 수행하고 싶은 경우 finally 절로 감싸준다.

```scala
val f = new FileReader("input.txt")
try {
  // 파일 사용
} finally {
  file.close()
}
```

**값 만들어내기**

try-catch-finally 도 결과는 값이다. finally 절에서는 값을 반환하지 않는 게 최선이다.

finally 절은 파일을 닫는 등의 정리 작업을 수행하므로, try절의 본문이나 catch 절의 결과를 수정하지 않아야 한다.

```scala
def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("google.com")
  }
  
// finally 값 반환 하지 말자.
try return 1 finally return 2 // 2 반환
try 1 finally 2 // 1 반환
```

**match 표현식**

스칼라의 match 표현식은 switch문과 유사하다. 여기서는 대안 중 하나를 고르는 방법을 설명한다.

java의 case는 enum, 정수, 문자열만 사용 가능하지만 scala는 어떤 종류의 상수라도 사용할 수 있다. 또 각 선택의 끝에 break 문을 쓸 필요 없다 암묵적으로 존재한다.

```scala
val firstArg = if(args.length > 0) args(0) else ""

firstArg match {
  case "salt" => println("pepper")
  case "eggs" => println("bacon")
  case _ => println("none")
}

// 값을 만들어 내는 match
val friend = 
  firstArg match {
  case "salt" => "pepper"
  case "eggs" => "bacon"
  case _ => "none"
}
```

**break, continue 없이 살기**

가장 간단한 접근법은 모든 continue를 if로, 모든 break를 불리언 변수로 대체하는 것이다.

```scala
var i = 0
var foundIt = false

while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if(args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}

// var를 사용해 루프 대신 재귀를 사용한 코드
def searchForm(i: Int): Int =
  if(i >= args.length) -1
  else if (args(i).startsWith("-")) searchForm(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchForm(i + 1)
  
val i = searchForm(0)
```

**변수 스코프**

변수 정의는 해당 변수를 사용할 수 있는 범위인 스코프를 갖는다. 중괄호를 사용하면 새로운 스코프가 생기고, 그 안에서 정의한 것은 중괄호를 닫으면 모두 사라진다.

스칼라에서는 내부 스코프에 동일한 이름의 변수를 정의해도 된다.

```scala
def printMultiTable() = {
  var i = 1 // 1만이스코프안에있다.
  while (i =< 10) {
    var j = 1 // 여기서는호와J가스코프안에있다. 
    while (j <= 10) {
      val prod = (i * j).tostring // i, j, prod가 스코프 안에 있다.
      var k = prod.length // i, j, prod, k가 모두 스코프 안에 있다.
      while (k < 4) {
        print(" ")
        k += 1
      }
      print(prod)
      j += 1
    }
    // i와J는여전히스코프안이지만, prod와K는스코프를벗어난다.
    printin()
    i += 1
  }
  // i는 여전히 스코프 안이지만, j, prod, k는스코프를벗어난다. 
}

// 컴파일 불가
val a = 1
val a = 2
println(a) 

// 컴파일 가능
val a = 1;
{
  val a = 2
  println(a)
}
println(a)
```

**명령형 스타일 코드 리팩토링**

함수형 스타일에 대한 이해를 위해 명령형 코드를 리팩토링 해본다. 해당 코드는 바로 위의 변수 스코프에서 작성한 코드 이다.

```scala
def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " "* (4 - prod.length)
    padding + prod
  }
def makeRow(row: Int) = makeRowSeq(row).mkString()

def multiTalbe() = {
  val tableSeq =
    for (row <- 1 to 10) 
    yield makeRow(row)
  tableSeq.mkString("\n")
}
```
# 8장

## 메소드

함수를 정의하는 가장 흔한 방법은 특정 객체의 멤버로 함수를 만드는 것이다. 객체의 멤버인 함수를 메소드라고 부른다.

```scala
object LongLines {
  def processFile(filename: String, width: Int) = {
    val source = Source.fromFile(fileName)
    for (line <- source.getLines()) {
      processLine(filename, width, line)
    }

    private def processLine(filename: String, width: Int, line: String) = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }
  }

  object FindLongLines {
    def main(args: Array[String]) = {
      val width = args(0).toInt
      for (arg <- args.drop(1))
        LongLines.processFile(arg, width)
    }
  }
}
```

## 지역 함수

잘 정의한 작업을 수행하는 다수의 작은 함수로 프로그램을 나누는 것은 함수형 프로그래밍의 중요한 설계 원칙이다.

이와 같은 방식은 유연하게 조립할 수 있는 빌딩 블록을 제공한다는 장점이 있다.

한가지 문제는 프로그램의 네임스페이스를 오염시킬 수 있다는 점이다. 재사용을 위해 함수를 클래스와 오브젝트로 패키징 하려면, 클래스를 사용하는 측에 대해 도우미 함수들을 감추는 것이 바람직하다.

자바에서는 주로 비공개 메서드를 이용해 이러한 목적을 달성했고, 스칼라도 동일하게 사용하지만 한가지 방법이 더 있다.

함수 안에 함수를 정의하여 사용하는 것이다.

```scala
// 위의 LongLines를 리팩토링 한 것, processLine을 processFile의 지역함수로 수정
def processFile(fileName: String, width: Int) = {
  def processLine(filename: String, width: Int, line: String) = {
    if(line.length > width)
      println(filename + ": " + line.trim)
  }
  val source = Source.fromFile(fileName)
  for(line <- source.getLines()) {
    processLine(filename, width, line)
  }
}
```

## 1급 계층 함수

스칼라는 1급 계층 함수를 제공한다. 함수를 정의하고 호출할 뿐만 아니라 이름 없이 리터럴로 표기해 값처럼 주고 받을 수 있다.

```scala
// 어떤 수에 1을 더하는 함수 리터럴
a = (x: Int) => {
  println(x)
  x + 1
}
a(10) // print(10), 11

// 리스트의 모든 요소 출력
n = List(1, 2, 3, 4)
n.forEach((x: Int) => println(x))

// filter
n.filter((x: Int) => x > 3)
```

## 간단한 형태의 함수 리터럴

함수 리터럴에서 정보의 중복을 제거하고 더 간략하게 작성할 수 있다. 간단하게 만드는 방법은 인자의 타입을 제거하는 것이다.

```scala
// x가 정수라는 사실을 아는데 이를 타깃 테이핑이라고 한다.
n = List(1, 2, 3, 4)
n.filter((x: Int) => x > 3)

// 타깃 테이핑으로 타입 추론이 이뤄진 인자를 둘러싸는 괄호를 제거한다.
n.filter(x => x > 3)
```

## 위치 표시자 문법

함수 리터럴을 더 간결하게 만들기 위해 밑줄을 하나 이상의 파라미터에 대한 위치 표시자로 사용할 수 있다. 단 각 인자는 한 번씩만 나타나야 한다.

```scala
n = List(1, 2, 3, 4)
n.filter(_ > 0) // n.filter(x => x > 3) 같음

// 때로는 인자의 타입 정보를 찾지 못할 경우가 있는데 이럴때는 타입을 명시한다.
val f = _ + _ // X
val d = (_: Int) + (_: Int) // O
```

## 부분 적용한 함수

이전의 예제에서 각 파라미터를 밑줄로 대처했지만, 전체 파라미터 목록을 밑줄로 바꿀 수 있다.

> 솔직히 이건 잘 못쓸 것 같다.

```scala
n = List(1, 2, 3, 4)
n.foreach(println _) // n.foreach(x => println(x)) 같음

def sum(a: Int, b: Int, c: Int) = a + b + c

val a = sum _
a(1, 2, 3)
a.apply(1, 2, 3)

val b = sum (1, _: Int, 3)
b(2) // sum (1, 2, 3)
b(5) // sum (1, 5, 3)
```

## 클로저

지금까지 모든 함수 리터럴 예지는 전달받은 인자만을 참조했는데, 다른 곳에서 정의한 변수를 참조할 수도 있다.

주어진 함수 리터럴로부터 실행 시점에 만들어낸 객체인 함숫값을 클로저라고 부른다.

```scala
// 열린 코드 조각: 자유 변수가 있는 함수 리터럴
var more = 1
val addMore = (x: Int) => x + more
addmore(10) // 10 + 1

// 닫힌 코드 조각: 자유 변수가 없는 함수 리터럴
(x: Int) => x + 1
```

**증가시키는 클로저**

프로그램을 수행할 때 다수의 복사본을 갖고 있는 변수를 클로저에서 접근할 경우

```scala
def makeIncreaser(more: Int) = (x: Int) => x + more

makeIncreaser(1) // 클로저가 하나 생기고 그 안에서 more를 1로 바인드 한다.
```

## 특별한 형태의 함수 호출

반복 파라미터, 이름 붙인 인자, 디폴트 인자에 해당하는 개념이다.

**반복 파라미터**

스칼라에서는 함수의 마지막 파라미터를 반복 가능하다고 지정할 수 있다. 이를 이용하면 길이가 변하는 인자 목록을 함수에 전달할 수 있다.

```scala
def echo(args: String*) =
  for (arg <- args) println(arg)

echo("1")
echo("1", "2")

// 배열을 반복 인자로 전달하는 예제: 콜론에 기호를 추가한다.
val Seq = Seq("a", "b", "c")
echo(seq: _*)
```

**이름 붙인 인자**

이름 붙인 인자는 파라미터 목록에 정해진 순서와 다른 순서로 함수에 인자를 전달하게 해준다. 

각 인자 앞에 이름과 등호 표시만 위치시키는 것이다.

```scala
def speed(distance: Float, time: Float): Float = distance / time

speed(distance = 100, time = 10)
speed(time = 10, distance = 100)
```

**디폴트 인잣값**

디폴트 값을 지정할 수 있는데, 지정한 파라미터가 있다면 함수 호출 시 해당 인자를 생략할 수 있다.

```scala
def printTime(out: java.io.PrintStream = Console.out, divisor: Int = 1) =
  out.println("time" + divisor)
printTime()
printTime(divisor = 10)
```

## 꼬리 재귀

var를 변경하는 while 루프를 val만 사용하는 더 함수형인 스타일로 바꾸려면 재귀를 사용하면 된다.

```scala
def approximate(guess: Double): Double =
  if (isGoodEnough(guess)) guess
  else approximate(improve(guess))
  
def approximateLoop(initialGuess: Double): Double = {
  var guess = initialGuess
  while (!isGoodEnough(guess))
    guess = improve(guess)
  guess
}

// 두 함수의 수행시간은 거의 동일하다. 하지만 위와 같은 근사치 추정 같은 경우 컴파일러의 최적화를 적용할 수 있다.
```

## 꼬리 재귀의 한계

스칼라는 동일한 함수를 직접 재귀 호출하는 경우에만 최적화를 수행한다. 2개의 함수를 번갈아 호출하거나, 마지막 호출이 함숫값을 호출하는 경우에도 꼬리 재귀 최적화는 일어나지 않는다.

```scala
// 최적화가 발생하지 않는 케이스들

def isEven(x: Int): Boolean = if (x == 0) true else isOdd(x - 1)
def isOdd(x: Int): Boolean = if (x == 0) false else isEven(x - 1)

val funValue = nestedFun _
def nestedFun(x: Int): Unit = {
  if(x != 0) {
    println(x)
    funValue(x - 1)
  }
}
```

# 9장

## 코드 중복 줄이기

모든 함수는 호출에 따라 달라지는 비공통 부분과 호출과 관계없이 일정한 공통 부분으로 나눠볼 수 있다.

함수를 인자로 받는 함수를 고차 함수라 한다. 이러한 고차 함수는 코드를 간단하게 압축할 수 있는 더 많은 기회를 제공한다.

```scala
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  def filesEnding(query: String) = {
    for (file <- filesHere
         if file.getName.endsWith(query)) yield file
  }
  def filesContainig(query: String) = {
    for(file <- filesHere
        if file.getName.contains(query)) yield file
  }
  
  // 위의 두 함수는 contains, endsWith만 다르지 나머지는 똑같다. 1급 계층 함수를 사용해 개선한 것이다.
  object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles
    private def filesMatching(matcher: String => Boolean) =
      for (file <- filesHere
           if matcher(file.getName)
           ) yield file

    def filesEnding(query: String) = filesMatching(_.endsWith(query))
    def filesContaining(query: String) = filesMatching(_.contains(query))
  }
}
```

## 클라이언트 코드 단순하게 만들기

고차 함수를 사용한다.

```scala
def containsNeg(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num < 0)
      exists = true
  exists
}
containsNeg(List(1, 2, 3, 4, 5))

// 개선
def newContainsNeg(nums: List[Int]) = nums.exists(_ < 0)
newContainsNeg(Nil)
newContainsNeg(List(1, 2, 3, 4))
```
## 커링

언어에서 지원하는 듯한 제어 추상화 구문을 이해하려면 처링을 이해해야 한다. 커링한 함수는 인자 목록이 하나아 아니고 여럿이다.

```scala
// 전형적인 형태 함수
def plainOldSum(x: Int, y: Int) = x + y
plainOldSum(1, 2)

// 커링한 함수 : 전형적인 함수를 2번 호출한 것과 같다.
def curriedSum(x: Int)(y: Int) = x + y
curriedSum(1)(2)

// 위치 표시자를 사용하여 부분적용 함수로 사용
val onePlus = curriedSum(1)_ // onePlus(2) => 3 
val twoPlus = curriedSum(2)_ // twoPlus(2) => 4 
```

## 새로운 제어 구조 작성

함수가 1급 계층인 언어에서는 언어의 문법이 고정되어 있더라도 새로운 제어구조를 작성할 수 있다. 함수를 인자로 받는 메서드만 작성하면 된다.

```scala
def twice(op: Double => Double, x: Double) = op(op(x))
twice(_ + 1, 5) // 7.0

// 빌려주기 패턴
println{"H"} // println("H") 
```

> 빌려주기 패턴: 제어 추상화를 하는 함수가 자원을 열어 특정 함수에게 해당 자원을 빌려주는 것

## 이름에 의한 호출 파라미터

if, while과 유사하게 중괄호 사이에 값을 전달하는 내용이 없는 형태로 구현하는 것

```scala
var assertionsEnabled = true
def myAssert(predicate: () => Boolean) = {
  if (assertionsEnabled && !predicate)
    throw new AssertionError
}
myAssert(() => 5 > 3)

// => 기호를 없애고 싶을 때
def byNameAssert(predicate: => Boolean) = {
  if(assertionsEnabled && !predicate)
    throw new AssertionError
}
byNameAssert(5 > 3)
```

# 10장

## 2차원 레이아웃 라이브러리

elem 이라는 팩토리 메서드를 사용하여 문자열로 채워진 사각형을 표현할 것이다.

특정 도메인의 요소를 결합해 새로운 요소를 만들어내는 것을 콤비네이터라고 부른다.

```scala
// 아래의 코드가 동작 되게끔 만들어 볼 것이다.
elem(s: String): Element

val column1 = elem("hello") above elem("***")
val column2 = elem("***") above elem("world")
column1 beside column2     
// hello ***
// *** world
```

## 추상 클래스

Element 타이블 정의한다. contents는 구현이 없는 메소드 선언이다.

contents는 Element의 추상 멤버이다.


```scala
abstract class Element {
  def contents: Array[String]
}
```

## 파라미터 없는 메소드 정의

Element에 너비와 높이를 알려주는 width와 height 메소드를 추가한다.

아래의 코드같은 형태를 파라미터 없는 메소드 라고 부른다. def width(): Int 이런 형태는 빈 괄호 메소드 라고 부른다.

어떤 메소드에 인자도 받지 않고 객체의 필드를 읽는 방식으로만 변경 가능한 상태에 접근하는 경우 사용한다.

```scala
abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}
```

> 필드나 메소드 중 어떤 방식으로 속성을 정의하더라도 클라이언트 코드에는 영향을 끼치지 말아야 한다는 단일 접근 원칙에 부합한다.

## 클래스 확장

어떤 요소의 인스턴스르 생성하려면 Element를 상속한 서브클래스에서 추상 메서드인 contents를 구현해야 한다.

```scala
class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}

val ae = new ArrayElement(Array("h", "w"))
ae.width
```

## 메소드와 필드 오버라이드

스칼라에서는 필드와 메소드가 같은 네임스페이스에 속한다. 이러한 특징으로 필드가 파라미터 없는 메소드를 오버라이드 할 수 있다.

```scala
// 파라미터 없는 메소드를 필드로 오버라이드
class ArrayElement(conts: Array[String]) extends Element {
  val contents: Array[String] = conts
}
```

## 파라미터 필드 정의

ArrayElement는 conts라는 파라미터가 있다. conts의 존재이유는 contents 필드로 복사하기 위한 것인데, 이름과 최대한 비슷하면서 충돌을 피하기 위해 정의한 것이다.

이는 불필요한 중복이나 반복이 코드에 있을지도 모름을 나타내는 코드 냄새다. 파라미터와 필드를 결합해 하나의 파라미터 필드로 정의하면 피할 수 있다.

```scala
// contents를 파라미터 필드로 정의하기
class ArrayElement(
  val contents: Array[String]
) extends Element
                  
// 위의 코드와 동일하게 동작한다.
class ArrayElement(x123: Array[String]) extends Element {
  val contents: Array[String] = x123
}

// 아래는 동일한 코드이다.
class Tiger(
 override val dangerous: Boolean,
 private var age: Int
) extends Cat
           
class Tiger(p1: Boolean, p2: Int) extends Cat {
  override val dangerous = p1
  private var age = p2
}
```

## 슈퍼클래스의 생성자 호출

위의 클래스에서 한 줄짜리 문자열로 이뤄진 레이아웃 원소를 표현하고 싶을 경우 서브 클래스를 생성하면 된다.

```scala
class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
}
```

## override 수식자 사용

width와 height에는 override 수식자가 붙어있다. 부모 클래스에 있는 구체적인 멤버를 오버라이드 하는 모든 멤버에 override 수식자를 붙여야 한다.

추상 멤버를 구현할 경우에는 override 수식자를 생략할 수 있다. 이러한 규치은 컴파일러가 발견하기 어려운 오류를 방지하고, 시스템을 안전하게 발전시킬 수 있게 한다.

## 다형성과 동적 바인딩

Element 타입의 변수가 ArrayElement 타입의 객체를 참조할 수 있는데, 이련 현상을 다형성이라고 한다.

Element는 ArrayElement나 LineElement등 여러 형태로 활용 가능하다. 또한 이럴 경우 변수나 표현식에 대한 메소드 호출을 동적으로 바인딩 한다.

```scala
abstract class Element {
  def demo() = {
    println("asd")
  }
}
class testElement extends Element

def invokeDemo(e: Element): Unit = {
  e.demo()
}

invokeDemo(new testElement) // override 하지 않았지만 정상 작동
```

## final 멤버 선언

상속 계층을 설계하다 보면 서브 클래스가 특정 멤버를 오버라이드 하지 못하게 막고 싶을 경우 final을 멤버에 붙인다.

```scala
final class ArrayElement extends Element {
  val contents: Array[String] = x123
}

class LineElement extends ArrayElement(Array(s)) { // 불가능
  override def width = s.length
  override def height = 1
}
```

## 상속과 구성 사용

상속과 구성은 이미 존재하는 클래스를 이용해 새로운 클래스를 정의하는 두 가지 방법이다. 코드 재사용을 추구하면 상속보다는 구성을 선호할 것이다.

상속 관계에서 스스로에게 물어봄 직한 질문 중 하나는 상속 관계가 is-a 관계를 모델리한 것인지 여부다

예를 들어 ArrayElement는 Element다(is-a) 라고 해도 합당하다.

## above, beside, toString 구현

Element의 above 메서드를 구현한다. 

```scala
abstract class Element {
  def contents: Array[String]

  def width: Int =
    if (height == 0) 0 else contents(0).length

  def height: Int = contents.length

  // 2개의 요소가 가진 내용을 이어붙인다는 뜻이다. ++ 연산은 두 배열을 이어붙인다.
  def above(that: Element): Element =
    new ArrayElement(this.contents + that.contents)

  // 2개의 요소를 서로 옆에 놓기 위해, 두 요소의 각 줄을 한 줄로 합친 결과가 새로운 요소의 각 줄이 되게 만드는 것
  def beside(that: Element): Element =
    new ArrayElement(
      for (
        (line1, line2) ‹- this.contents zip that.contents
      ) yield line1 + line2
  )
  // Array(1, 2, 3) zip Array("a", "b") => Array((1, "a"), (2, "b"))

  override def toString = contents mkString "\n"
}

// beside 축약 버전
new ArrayElement(
  for(
    (line1, line2) <- this.contents zip that.contents
  ) yield line1 + line2
)
```

## 팩토리 객체 정의

지금까지 클래스 계층을 갖추었다. 그대로 클라이언트에게 공개해서 사용하게 할 수도 있지만, 팩토리 객체 뒤로 감추고 제공하는 방법도 있다.

팩토리 객체는 다른 객체를 생성하는 메소드를 제공하는 객체다. 클라이언트는 new를 이용해 객체를 만들기보다는 팩토리 메서드로 객체를 생성할 것이다.

이점은 객체 생성 기능을 한곳에 모아서 제공하고 구체적인 내부 표현을 감출 수 있다는 것이다.

```scala
// 팩토리 메서드를 갖춘 객체
object Element {
  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
  def elem(chr: Char, width: Int, height: Int): Element =
    new UniformElement(chr, width, height)
  def elem(line: String): Element =
    new LineElement(line)
}

// 팩토리 메서드를 사용하도록 리팩토링한 Element 클래스
abstract class Element {
  def contents: Array[String]
  def width: Int = if (height == 0) 0 else contents(0).length
  def height: Int = contents.length
  def above(that: Element): Element =
    elem(this.contents ++ that.contents)
  def beside(that: Element): Element =
    elem(
      for(
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + yield line2
    )  
  override def toString = contets mkString "\n"
}

// 비공개 클래스로 구현 감추기
object Element {
  private class ArrayElement(
    val contents: Array[String] ) extends Element
  private class LineElement(s: String) extends Element {
    val contents = Array(s)
    override def width = s.length
    override def height = 1
  }
  private class UniformElement(ch: Char,
    override val width: Int,
    override val height: Int) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }
  def elem(contents: Array[String]): Element = new ArrayElement(contents)
  def elem(chr: Char, width: Int, height: Int): Element =
    new UniformElement(chr, width, height)
  def elem(line: String): Element = new LineElement(line)
}
```

# 11장

## 스칼라의 클래스 계층구조

계층의 최상위에는 Any 클래스가 있고 다음과 같은 메소드를 정의한다.

사진

모든 클래스가 Any를 상속하기에 모든 객체를 ==, !=, equals를 사용해 비교할 수 있고, toString을 사용해 서식화 할 수 있따.

==, !=은 final이라 override 할 수 없지만 equals는 가능하다.

AnyVal과 AnyRef는 Any의 서브클래스이다. AnyVal은 모든 스칼라 값 클래스의 부모 클래스이다.

AnyRef는 모든 참조클래스의 기반 클래스이다. java.lang.Object에 이름을 붙인 것에 지나지 않는다.

> 값 클래스: Byte, Short, Char, Int, Long, Float, Double, Boolean, Unit

## 바닥에 있는 타입

scala.Null 과 scala.Nothing을 볼 수 있는데, 특이한 경우를 처리하기 위한 특별한 타입이다.

Null 클래스는 null 참조의 타입이다. 이 클래스는 모든 참조 타입의 서브 클래스이다. Null은 값타입과는 호환성이 없다. null 을 정수 타입의 변수에 할당할 수 없다.

Nothing은 스칼라 클래스 계층의 맨 밑바닥에 존재한다. 이 타입은 다른 모든 타입의 서브타입이다. 비정상적 종료를 표시할 때 사용한다.