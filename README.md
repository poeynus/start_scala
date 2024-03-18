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
- [12장](#12장)
  * [트레이트의 동작 원리](#트레이트의-동작-원리)
  * [간결한 인터페이스와 풍부한 인터페이스](#간결한-인터페이스와-풍부한-인터페이스)
  * [예제 직사각형 객체](#예제-직사각형-객체)
  * [Ordered 트레이트](#Ordered-트레이트)
  * [트레이트를 이용해 변경 쌓아 올리기](#트레이트를-이용해-변경-쌓아-올리기)
  * [왜 다중 상속은 안 되는가](#왜-다중-상속은-안-되는가)
  * [트레이트냐 아니냐, 이것이 문제로다](#트레이트냐-아니냐-이것이-문제로다)
- [13장](#13장)
  * [패키지 안에 코드 작성하기](#패키지-안에-코드-작성하기)
  * [관련 코드에 간결하게 접근하기](#관련-코드에-간결하게-접근하기)
  * [임포트](#임포트)
  * [암시적 임포트](#암시적-임포트)
  * [접근 수식자](#접근-수식자)
- [14장](#14장)
  * [단언문](#단언문)
  * [스칼라에서 테스트 하기](#스칼라에서-테스트-하기)
  * [명세로 테스트하기](#명세로-테스트하기)
  * [프로퍼티 기반 테스트](#프로퍼티-기반-테스트)
- [15장](#15장)
  * [케이스 클래스와 패턴 매치](#케이스-클래스와-패턴-매치)
  * [간단한 예](#간단한-예)
  * [패턴의 종류](#패턴의-종류)
  * [봉인된 클래스](#봉인된-클래스)
  * [Option 타입](#Option-타입)
  * [패턴은 어디에나](#패턴은-어디에나)
- [16장](#16장)
  * [리스트 리터럴](#리스트-리터럴)
  * [리스트 타입](#리스트-타입)
  * [리스트 생성](#리스트-생성)
  * [리스트 기본 연산](#리스트-기본-연산)
  * [리스트 패턴](#리스트-패턴)
  * [List 클래스의 1차 메소드](#List-클래스의-1차-메소드)
  * [List 클래스의 고차 메서드](#List-클래스의-고차-메서드)
  * [List 객체의 메소드](#List-객체의-메소드)
  * [여러 List를 함께 처리하기](#여러-List를-함께-처리하기)
  * [스칼라의 타입 추론 알고리즘 이해](#스칼라의-타입-추론-알고리즘-이해)
- [17장](#17장)
  * [컬렉션](#컬렉션)
  * [시퀀스](#시퀀스)
  * [집합과 맵](#집합과-맵)
  * [변경 가능 컬렉션과 변경 불가능 컬렉션](#변경-가능-컬렉션과-변경-불가능-컬렉션)
  * [컬렉션 초기화](#컬렉션-초기화)

# 1장

## 확장 가능한 언어

Scala는 확장 가능한(Scalable) 언어 라는 뜻이다.

스칼라는 <u>사용자의 요구에 따라 확장이 얼마든지 가능한 언어이다.</u>

기술적으로는 <u>객체지향과 함수형 프로그래밍 개념을 합쳐놓은 정적 타입 언어이다.</u>

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

스칼라에서 변수를 정의하는 방법은 val, var 2가지 이다. <u>타입추론이 가능하므로 타입을 명시하지 않아도 된다.</u>

스칼라에서는 <u>var 보다는 val 사용을 권장한다.</u>

> val: java의 final과 유사한, 초기화 후 재할당이 불가능한 변수

> var: 재할당이 가능한 변수

## 함수 정의하기

스칼라는 파라미터 타입을 추론하지 않기 때문에, <u>함수의 파라미터와 결과는 타입을 지정해야한다.</u>

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

<u>원소에 접근하려면 []이 아닌 ()로 접근한다. 길이를 변경할 수 없지만, 원소는 변경할 수 있다.</u>

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

그리고 불변하는 값인 <u>val로 선언을 하더라도 클래스의 내부의 값은 접근 후 수정이 가능하다.</u>

하지만 <u>다른 객체를 재할당 하는 것은 불가능 하다.</u> 접근 제어자로는 public, protected, private이 있다.

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

스칼라가 자바보다 객체지향인 이유 중 하나는 <u>정적 멤버가 없다는 것이다.</u> 대신에 싱글톤 객체를 제공한다.

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

<u>스칼라에서 연산자라는 개념은 홀로 존재하는 것이 아니고 메소드를 연산자 표기로 쓸 뿐이다.</u>

> 2 + 2 * 7 == 2 + (2 * 7)

> a +++ b *** c == a +++ (b *** c) 

> 스칼라의 우선순위를 안다고 하더라도 명확히 표시하여 주는 것이 좋다.

## 풍부한 래퍼

스칼라 기본 타입에 더 유용한 메서드를 제공해주는 풍부한 래퍼 클래스로 변환하는 <u>암시적 변환이 존재한다.</u> 

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

<u>현재 실행 중인 메서드의 호출 대상 인스턴스에 대한 참조를 자기 참조라고 한다.</u> 생성자 내부에서는 자기 참조가 생성 중인 객체의 인스턴스를 가리킨다.

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

하나의 클래스에 여러 생성자가 필요한 경우 <u>주 생성자가 아닌 다른 생성자를 보조 생성자라 부른다.</u>

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

스칼라에서 오버로드 메서드를 처리하는 방법은 Java와 거의 유사하다. <u>오버로드한 메서드 중 인자의 정적인 타입과 가장 잘 일치하는 버전을 선택하여 실행된다.</u>

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

val, var 변수처럼 선언하고 사용하면 되는데, <u>val이나 var 키워드를 사용하지는 않는다.</u>

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

<u>yield는 코드 블록의 마지막이 아니라 여는 중괄호 앞에 위치해야 한다.</u>

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

try-catch-finally 도 결과는 값이다. <u>finally 절에서는 값을 반환하지 않는 게 최선이다.</u>

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

java의 case는 enum, 정수, 문자열만 사용 가능하지만 scala는 어떤 종류의 상수라도 사용할 수 있다. 또 <u>각 선택의 끝에 break 문을 쓸 필요 없다 암묵적으로 존재한다.</u>

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

가장 간단한 접근법은 모든 continue를 if로, 모든 <u>break를 불리언 변수로 대체하는 것이다.</u>

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

변수 정의는 해당 변수를 사용할 수 있는 범위인 스코프를 갖는다. <u>중괄호를 사용하면 새로운 스코프가 생기고, 그 안에서 정의한 것은 중괄호를 닫으면 모두 사라진다.</u>

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

<u>함수를 정의하는 가장 흔한 방법은 특정 객체의 멤버로 함수를 만드는 것이다.</u> 객체의 멤버인 함수를 메소드라고 부른다.

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

<u>잘 정의한 작업을 수행하는 다수의 작은 함수로 프로그램을 나누는 것은 함수형 프로그래밍의 중요한 설계 원칙이다.</u>

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

스칼라는 1급 계층 함수를 제공한다. <u>함수를 정의하고 호출할 뿐만 아니라 이름 없이 리터럴로 표기해 값처럼 주고 받을 수 있다.</u>

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

함수 리터럴에서 정보의 중복을 제거하고 더 간략하게 작성할 수 있다. 간단하게 만드는 방법은 <u>인자의 타입을 제거하는 것이다.</u>

```scala
// x가 정수라는 사실을 아는데 이를 타깃 테이핑이라고 한다.
n = List(1, 2, 3, 4)
n.filter((x: Int) => x > 3)

// 타깃 테이핑으로 타입 추론이 이뤄진 인자를 둘러싸는 괄호를 제거한다.
n.filter(x => x > 3)
```

## 위치 표시자 문법

함수 리터럴을 더 간결하게 만들기 위해 밑줄을 하나 이상의 파라미터에 대한 위치 표시자로 사용할 수 있다. 단 <u>각 인자는 한 번씩만 나타나야 한다.</u>

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

지금까지 모든 함수 리터럴 예시는 전달받은 인자만을 참조했는데, 다른 곳에서 정의한 변수를 참조할 수도 있다.

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

스칼라는 동일한 함수를 직접 재귀 호출하는 경우에만 최적화를 수행한다. <u>2개의 함수를 번갈아 호출하거나, 마지막 호출이 함숫값을 호출하는 경우에도 꼬리 재귀 최적화는 일어나지 않는다.</u>

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

<u>함수를 인자로 받는 함수를 고차 함수라 한다.</u> 이러한 고차 함수는 코드를 간단하게 압축할 수 있는 더 많은 기회를 제공한다.

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

언어에서 지원하는 듯한 제어 추상화 구문을 이해하려면 처링을 이해해야 한다. <u>커링한 함수는 인자 목록이 하나아 아니고 여럿이다.</u>

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

아래의 코드같은 형태를 파라미터 없는 메소드 라고 부른다. <u>def width(): Int 이런 형태는 빈 괄호 메소드 라고 부른다.</u>

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

이는 불필요한 중복이나 반복이 코드에 있을지도 모름을 나타내는 코드 냄새다. <u>파라미터와 필드를 결합해 하나의 파라미터 필드로 정의하면 피할 수 있다.</u>

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

width와 height에는 override 수식자가 붙어있다. <u>부모 클래스에 있는 구체적인 멤버를 오버라이드 하는 모든 멤버에 override 수식자를 붙여야 한다.</u>

추상 멤버를 구현할 경우에는 override 수식자를 생략할 수 있다. 이러한 규치은 컴파일러가 발견하기 어려운 오류를 방지하고, 시스템을 안전하게 발전시킬 수 있게 한다.

## 다형성과 동적 바인딩

<u>Element 타입의 변수가 ArrayElement 타입의 객체를 참조할 수 있는데, 이련 현상을 다형성이라고 한다.</u>

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

<u>상속 관계에서 스스로에게 물어봄 직한 질문 중 하나는 상속 관계가 is-a 관계를 모델리한 것인지 여부다.</u>

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

# 12장

## 트레이트의 동작 원리

<u>트레이트는 코드 재사용의 근간을 이루는 단위다.</u> 트레이트로 메서드와 필드 정의를 캡슐화하면 트레이트를 조합한 클래스에서 그 메서드나 필드를 재사용할 수 있다.

트레이트의 정의는 trait 키워드를 사용한다는 점을 제외하면 클래스의 정의와 같다.

트레이트를 정의하고 나면 extends나 with 키워드를 사용해 클래스에 조합하여 사용할 수 있다. 상속보다는 믹스인을 사용하려는 경향이 강하다.

트레이트는 클래스 파라미터를 가질 수 없다.

```scala
trait Philosophical {
  def philosophize() = {
    println("test")
  }
}

// extends 사용하여 믹스인
class Frog extends Philosophical {
  override def toString = "green"
}

// with를 이용한 트레이트 믹스인
class Animal
class Frog extends Animal with Philosophical {
  override def toString = "red"
}

// 여러 트레이트의 믹스인
class Animal
trait HasLegs
class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "gas"
}

// 클래스 파라미터를 가질 수 없다. - 우회하는 방법이 있는데 20장에서 알아본다.
class Point(x: Int, y: Int) // 가능
trait Toint(x: Int, y: Int) // 불가능
```

## 간결한 인터페이스와 풍부한 인터페이스

트레이트의 주된 사용 방법 중 하나는 어떤 클래스에 그 클래스가 이미 갖고 있는 메소드를 기반으로 하는 새로운 메소드를 추가하는 것이다. 

<u>간결한 인터페이스를 풍부한 인터페이스로 만들 때 트레이트를 사용할 수 있다.</u> 

## 예제: 직사각형 객체

직사각형 객체를 편리하게 쓰려면, 너비, 높이, 좌측 위치 등 기하학적 속성을 조회할 수 있는 기능을 제공하면 좋을 것이다.

```scala
// 기본적인 기하 클래스
class Point(val x: Int, val y: Int)
class Rectangel(val topLeft: Point, val bottomRight: Point) {
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}

// 풍부한 트레이트 정의 및 믹스인 적용
trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}
class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular

// 사용
val rect = new Rectangel(newPoint(1, 1), newPoint(10, 10))
rect.left
rect.right
rect.width
```

## Ordered 트레이트

풍부한 인터페이스를 이용하면 편리해지는 영역으로 비교가 있다. 

```scala
// Ordered가 없을 때
class Rational(n: Int, d: Int) {
  def <(that: Rational) = this.numer * that.denom < that.numer * this.denom
  def >(that: Rational) = that < this
  def <=(that: Rational) = (this < that) || (this == that)
  def >=(that: Rational) = (this > that) || (this == that)
}
// Ordered를 적용한 코드
class Rational(n: Int, d: Int) extends Ordered[Rational] {
  def compare(that: Rational) = (this.numer * that.denom) - (that.numer * this.denom)
}

// 사용
val half = new Rational(1, 2)
val third = new Rational(1, 3)
half < third
half > third
```

> Ordered에서 equals는 정의하지 않는다. 타입 소거로 인해 객체 타입을 알 수 없기 때문이다 - 우회는 30장
 
## 트레이트를 이용해 변경 쌓아 올리기

트레이트의 두 번쨰 용도는 <u>클래스에 쌓을 수 있는 변경을 적용</u>할 수 있다. 클래스의 메서드를 변경할 수 있을 뿐만 아니라, 이런 변경 위에 다른 변경을 쌓을 수 있다.

```scala
// intQueue 추상 클래스
abstract class IntQueue {
  def get(): Int
  def put(x: Int): Unit
}

// BasicIntQueue
class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = { buf += x}
}

// 쌓을 수 있는 변경을 나타내는 Doubling 트레이트
trait Doubling extends IntQueue {
  abstract override def put(x: Int) = { super.put(2 * x) } // 트레이트는 super 호출이 가능하다. abs
}

class MyQueue extends BasicIntQueue with Doubling
val queue = new MyQueue
queue.put(10)
queue.get()

// new를 이용해 인스턴스를 생성하면서 트레이트 믹스인하기
val queue = new BasicIntQueue with Doubling 
queue.put(10)
queue.get()
```

## 왜 다중 상속은 안 되는가

트레이트는 여러 클래스 유사 구조를 상속받는 방법이지만, 많은 언어에서 볼 수 있는 다중 상속과는 차이가 있다. 특히 super의 해석이 중요하다.

트레이트를 사용할 때는 특정 클래스에 믹스인한 클래스와 트레이트를 선형화해서 어떤 메서드를 호출할지 결정한다. 이 차이로 쌓을 수 있는 변경이 가능하다.

## 트레이트냐 아니냐, 이것이 문제로다

재사용 가능한 행위를 구현할 때마다, 트레이트를 사용할지 추상 클래스를 사용할지 결정해야한다. 가이드라인은 아래와 같다.

> 1. 어떤 행위를 재사용하지 않을 거라면, 클래스로 만들어라.
> 2. 서로 관련이 없는 클래스에서 어떤 행위를 여러 번 재사용해야 한다면, 트레이트로 작성하라
> 3. 스칼라에서 정의한 내용을 자바코드에서 상속해야한다면, 추상 클래스를 사용하라.
> 4. 컴파일한 바이너리 형태로 배포할 예정이고, 배포한 내용을 누군가가 상속해 사용할 것 같다면, 추상 클래스를 더 많이 사용하게 될 것이다.
> 5. 모두 고려했음에도 판단이 서지 않는다면 보통 트레이트가 더 많은 가능성이 있다.

# 13장

## 패키지 안에 코드 작성하기

규모가 큰 프로그램을 작성할 때는 프로그램의 여러 부분이 <u>서로 의존하는 정도를 나타내는 커플링을 최소화 하는 것이 중요하다.</u>

```scala
// 모든 파일을 한 패키지 안에 넣기
package bobsrockets.navigation
class Navigator

// 간단판 패캐지 선언을 길게 쓴 형태
package bobsrockets.navigation {
  class Navigator
}

// 한 파일에 여러 패키지 넣기
package bobsrockets {
  package navigation {
    class Navigator
    package tests {
      class NavigatorSuite
    }
  }
}
```

## 관련 코드에 간결하게 접근하기

코드를 패키지 계층으로 나누는 이유는 사람들이 코드를 훑어볼 때 도움을 주기 위해서만은 아니다. <u>컴파일러도 같은 패키지 안에 코드가 서로 관련 있음을 알 수 있다.</u>

```scala
// 클래스와 패키지에 간결하게 접근하기
package bobsrockets {
  package navigation {
    class Navigator {
      val map = new StartMap
    }
    class starMap
  }
  class Ship {
    val nav = new navigation.Navigator
  }
  package fleets {
    class Fleet {
      def addShip() = { new Ship }
    }
  }
}

// 숨겨진 패키지 이름에 접근하기
package launch {
  class Booster3
}

package bobsrockets {
  package navigation {
    package launch {
      class Booster1
    }
    package launch {
      class Booster2
    }
    class MissionControl {
      val booster1 = new launch.Booster1
      val booster2 = new bobsrockets.launch.Booster2 // 
      val booster3 = new _root_.launch.Booster3 // 최상위 launch 패키지
    }
  }
}

```

## 임포트

스칼라에서 패키지와 멤버는 import절을 통해 불러올 수 있다.

```scala
// 임포트 준비가 된 밥의 과일 클래스
package bobsdelights

abstract class Fruit (
 val name: String,
 val color: String
)
object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
}

import bobsdelights.Fruit// Fruit에 간단히 접근 - 싱글 타입 임포트
import bobsdelights._ // bobsdelights 모든 멤버에 간단히 접근 - 주문식 임포트 (자바는 * 사용)
import bobsdelights.Fruits._ // Fruits 모든 멤버에 간단히 접근 - 정적 클래스 필드를 불러오는 임포트

// 싱글톤이 아닌 멤버 임포트
def showFruit(fruit: Fruit) = {
  import fruit._
  println(name + color)
}

// 패키지 이름 불러오기
import java.util.regex
class AStarB {
  val pat - regex.Pattern.compile("a*b")
}

import Fruits.{Apple, Orange} // Fruits에 Apple, Orange 호출
import Fruits.{Apple => McIntosh, Orange} // Fruits에 Apple을 McIntosh로 변경해서 호출, Orange 호출
import java.sql.{Date => SDate} // 원래이름을 새 이름으로 변경
import Fruits.{_} // Fruits 객체로부터 모든 멤버 호출
import Notebooks._
import Fruits.{Apple => _, _} // Notebooks의 모든 멤버와 Apple을 제외한 Fruits의 모든 멤버 조회
```

## 암시적 임포트

스칼라는 모든 프로그램에서 몇 가지 임포트를 항상 추가한다.

```scala
// 항상 추가하는 암시적 임포트
import java.lang._
import scala._
import Predef._
```

## 접근 수식자

패키지, 클래스, 객체 멤버 앞에 private와 protected 접근 수식자를 둘 수 있다.

**비공개 멤버**

비공개 멤버는 자바와 유사하다 private이 붙은 멤버는 오직 그 정의를 포함한 클래스나 객체 내부에서만 접근 할 수 있다. 일관성이 있으나 자바와는 다른다.

```scala
// 비공개 접근은 자바와 스칼라에서 어떻게 다른가
class Outer {
  class Inner {
    private def f() = {println("f")}
    class InnerMost {
      f() // 문제 없음
    }
  }
  (new Inner).f() // 불가능
}
```

**보호 멤버**

보호 멤버에 대한 접근은 자바보다 약간 더 제한적이다. 보호 멤버를 정의한 클래스의 서브클래스에서만 그 멤버에 접근할 수 있다.

```scala
// 보호 접근은 자바와 스칼라에서 어떻게 다른가
package p {
  class Super {
    protected def f() = {println("f")}
  }
  class sub extends Super {
    f()
  }
  class Other {
    (new Super).f() // 불가능
  }
}
```

**공개 멤버**

private나 protected가 없는 멤버는 모두 공개 멤버다. 공개 멤버를 위한 수식자는 없으며 어디에서나 접근 가능하다.

**보호 스코프**

스칼라에서는 접근 수식자의 의미를 지정자로 확장할 수 있다. 접근 지정자가 있는 수식자는 매우 세밀한 접근 제어를 가능케 한다.

단순 접근 수식자로 바로 표현할 수 없는 패키지 비공개, 패키지 보호, 가장 바깥쪽 클래스 외부로는 비공개 같은 자바 접근 제어도 지정자를 사용해 할 수 있다.

```scala
// 접근 지정자를 사용해 보호 스코프를 유연하게 설정하기
package bobsrockets 
package navigation {
  private[bobsrockets] class Navigator { // bobsrockets 패키지 내부에 있는 모든 객체와 클래스에서 Navigator 접근 가능
    protected[navigation] def useStarChart() = {} // 보호 접근
    class LegOfJourney {
      private[Navigator] val distance = 100
    }
    private[this] var speed = 200
  }
}

val other = new Navigator
oher.speed // 컴파일 불가 speed가 private[this] 이기에

package launch {
  import navigation._
  object Vehicle {
    private[launch] val guide = new Navigator // 패키지 비공개 접근
  }
}
```

**가시성과 동반 객체**

자바에서 정적 멤버와 인스턴스 멤버는 동일한 클래스에 속하고 접근 수식자를 그 멤버들에게 일률적으로 적용한다.

스칼라는 정적멤버가 없는데, 그 대신 여러 멤버를 포함하며 단 하나만 존재하는 동반 객체가 있다.

```scala
// 동반 클래스와 객체의 비공개 멤버 접근
// Rocket 객체는 Rocket 클래스의 동반 객체
class Rocket {
  import Rocket.fuel
  private def canGoHomeAgain = fuel > 20
}
object Rocket {
  private def fuel = 10
  def chooseStrategy(rocket: Rocket) = {
    if (rocket.canGoHomeAgain)
      goHome()
    else
      pickAStar()
  }
  def goHome() = {}
  def pickAStar() = {}
}
```

# 14장

## 단언문

스칼라에서는 assert 메소드를 호출하는 방식으로 단언문을 선언한다. 조건을 충족하지 않는 경우 AssertionError를 발생시킨다. 설명의 타입은 Any로 어떤 객체라도 넘길 수 있다.

```scala
// 단언문의 사용
def above(that: Element): Element = {
  val this1 = this widen that.width
  val this2 = that widen this.width
  assert(this1.width == that.width)
  elem(this1.contents ++ that1.contents)
}

// ensuring을 사용해 함수의 결과 확인하기
private def widen(w: Int): Element = {
  if (w <= width)
    this
  else {
    val left = elem(' ', (w - width) / 2, height)
    var right = elem(' ', w - width - left.width, height)
    left beside this beside right
  } ensuring(w <= _.width) // 암시적 변환, 어떤 결과 타입이든 적용 가능
}
```

> ensuring은 술어 함수를 인자로 받는다. 술어는 메소드 결과의 타입을 받아서 Boolean을 반환하는 함수다.
 
## 스칼라에서 테스트 하기

스칼라 테스트는 가장 유연한 스칼라 테스트 프레임워크로서, 다른 문제를 풀기 위해 쉽게 커스터마이즈 할 수 있다.

스칼라 테스트에서 중심적인 개념은 테스트 집합인 스위트다. 트레이트 Suite는 테스트들을 실행하기 위해 사전에 준비된 생명주기 메소드들을 선언하다.

다른 테스트 스타일을 지원하기 위해 Suite를 확장하고 생명 주기 메소드를 오버라이드 하는 스타일 트레이트를 지원한다. 또한 특별한 테스트 요구를 해결하기 위해 생명 주기 메서드를 오버라이드 하는 믹스인 트레이트도 지원한다.

```scala
// AnyFunSuite로 테스트 작성하기 - 테스트 클래스로 확장된 테스트 스타일
import org.sclatest.funsuite.AnyFunSuite
import Element.elem

class ElementSuite extends AnyFunSuite {
  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }
}
```

## 명세로 테스트하기

동작 주도 개발(BDD) 테스트 스타일은 기대하는 코드의 동작을 사람이 읽을 수 있는 명세로 작성하고, 코드가 작동하느지 확인하는데 중점을 둔다

명세 절을 사용해 테스트를 작성하며, 테스트할 주제에 대해 이름을 문자열로 적고, should | must | can 중 하나를 넣고, 해당 주제의 작동을 설명하는 문자열이 온 후, in이 따라온다. in 다음에는 중괄호 안에 지정한 동작을 테스트하는 코드를 작성한다.

```scala
// AnyFunSuite로 동작을 명세화하고 테스트하기
import org.sclatest.flatspec.AntFlatSpec
import org.scalatest.matchers.should.Matchers

class ElementSpec extends AnyFlatSpec with Matchers {
  "A UniformElement" should
    "have a width equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.wudth should be (2)
  }
  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.height should be (3)
  }
  it should "throw an IAE if passed a negative width" in {
    an [IllegalArgumentException] should be thrownBy {
      elem('x', 2, 3)
    }
  }
}

// 스펙스2 프레임워크로 동작을 명세화하고 테스트하기
import org.specs2._

object ElementSpecification extends Specification {
  "A UniformElement" should {
    "have a width equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.width must be_==(2)
    }
    "have a height equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.height must be_==(3)
    }
    "throw an AIE if passed a negative width" in {
      elem('X', -2, 3) must throwA[IllegalArgumentException]
    }
  }
}

// 개발 참여자 사이의 통신을 원활하게 하기 위해 테스트 사용하기
import org.scalatest._

class TVSetSpec extends AnyFeatureSpec with GivenWhenThen {
  Feature ("TV power button") {
    Scenario("User presses power button when VT is off") {
      Given("a VT set that is switched off") When ("the power button is pressed")
      Then("the TV should switch on") pending
    }
  }
```

## 프로퍼티 기반 테스트

리커드 닐슨이 작성한 오픈소스 프레임워크인 스칼라체크는 스칼라로 만들어진 또다른 테스트 도구다. 스칼라 체크는 테스트할 코드가 준수해야 하는 프로퍼티를 명시하게 해준다.

각 프로퍼티에 대해 테스트 데이터를 생성한 다음, 프로퍼티를 잘 지키는지 검사한다.

아래의 예시에서는 elem 팩토리가 지켜야 하는 한 가지 프로퍼티를 검사한다.

whenever 절은 왼쪽 편에 있는 식이 true일 때마다 오른쪽에 있는 식이 true가 되어야 함을 명시한다.

```scala
// 스칼라체크로 프로퍼티 기반 테스트 작성하기
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks
import org.scalatest.matchers.must.Matchers._
import Element.elem
class ElementSpec extends AnyWordSpec
        with ScalaCheckPropertyChecks {
  "elem result" must {
    "have passed width" in {
      forAll { (w: Int) =>
        whenever(w > 0) {
          elem('x', w % 100, 3).width must equal(w % 100)
        }
      }
    }
  }
}
```

# 15장

## 케이스 클래스와 패턴 매치

이들은 쌍둥이 구성요소로서, 일반적이고 캡슐화 되지 않은 데이터 구조를 작성할 떄 쓰인다. 트리 같은 재귀적 데이터에 유용하다.

함수형 언어로 프로그래밍을 경험해보았다면 패턴 매치에 대해 알 테지만, 케이스 클래스는 아주 많은 코드를 작성하지 않고도 객체에 대한 패턴 매치를 해주는 새로운 개념이다.

## 간단한 예

설계할 도메인 특화 언어에(DSL)에 산술 표현식을 다루는 라이브러리가 필요하다고 생각해보자.

이를 해결하기 위한 첫 단계는 입력 데이터를 정의하는 것이다. 아래의 예는 추상 기본 클래스 하나와 그 클래스를 상속한 4개의 서브 클래스로 구성 된다.

```scala
// 산술식을 계층 구조로 표현하기 - 변수와 숫자, 단항/이항 연산자만 다룬다.
abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(perator: String, left: Expr, right: Expr) extends Expr

```

**케이스 클래스**

각 서브클래스 앞에 case 라는 수식자가 있음을 주의깊게 보자. 이 수식자가 붙은 클래스를 케이스 클래스라고 한다.

컴파일러는 클래스 이름과 같은 이름의 팩토리 메서드를 추가한다. 
```scala
val nv = new Var("x") // 이렇게 안해도 됨
val v = Var("x") // new 생략 가능
```

케이스 클래스의 파라미터 목록에 있는 모든 인자에 암시적으로 val 접두사를 붙인다. 그래서 각 파라미터가 클래스의 필드도 된다.
```scala
val op = BinOp("+", Number(1), v) // BinOp = BinOp(+,Number(1.0), Var)
```

컴파일러는 케이스 클래스에 toString, hashCode, equals 메소드의 일반적인 구현을 추가한다. 

모든 인자를 하나의 온전한 트리로 보고, 그것을 문자열로 만들거나 해시를 계산하거나 비교한다.
```scala
v.name // String = x
op.left // Expr = Number(1.0)
```

컴파일러는 어떤 케이스 클래스에서 일부를 변경한 복사본을 생성하는 copy 메소드를 추가한다. 이 메소드는 기존의 인스턴스에서 하나 이상의 속성을 바꾼 새로운 인스턴스를 생성할 때 매우 유용하다.
```scala
println(op) // BinOp(+,Number(1,0),Var)
op.right == Var("x") // Boolean = true
op.copy(operator= "-") // BinOp = BinOp(-, Number(1.0), Var(x))
```

**패턴 매치**

패턴 매치에는 case 키워드로 시작하는 여러 대안이 들어간다. 각 대안은 패턴과 셀렉터가 일치했을 때 계산되는 하나 이상의 표현식을 포함한다. 화살표 =>는 패턴과 계산할 표현식을 분리한다.

"+"나 1 같은 상수 패턴은 == 연산자를 적용해서 매치 된다. e와 같이 변수만을 사용한 패턴은 모든 값과 매치할 수 있다.

와일드 카드 패턴(_)은 모든 값과 매치할 수 있다 

```scala
// 패턴 매치를 사용하는 simplifyTop 함수
def simplify(expr: Expr) = expr match {
  case UnOp("-", UnOp("-", e)) => e // 부호를 두 번 반전
  case BinOp("+", e, Number(0)) => e // 0을 더함
  case BinOp("*", e, Number(1)) => e // 1을 곱함
  case _ => expr
}
```

**switch와 match의 비교**

match 식은 자바 스타일 switch를 일반화한 것으로 볼 수 있고, 차이점이 세 가지 있다.

> 1. 스칼라의 match는 표현식이다. 따라서 결과값을 내놓는다.
> 2. 스칼라의 대안 표현식은 다음 케이스로 빠지지 않는다.
> 3. 매치에 성공하지 못하는 경우 MatchError 예외가 발생한다.

따라서 모든 가능한 경우를 처리하기 위해서는, 하는 일이 없더라고 디폴트 케이스를 반드시 추가해야 한다.

```scala
// 비어 있는 디폴트 케이스가 있는 패턴 매치
expr match {
  case BinOp(op, left, right) =>
    println(s"$expr")
  case _ =>
}
```
 
## 패턴의 종류

모든 패턴은 그에 상응하는 표현식과 비슷해 보인다. 패턴 문법은 너무나 명백하다. 따라서 어떤 종류의 패턴을 사용할 수 있는가에만 주의를 기울이면 된다.

**와일드카드 패턴**

와일드카드 패턴은 어떤 객체라도 매치할 수 있다. 
```scala
expr match {
  case BinOp(op, left, right) =>
    println(s"$expr")
  case _ => // 와일드카드 패턴
}
```

**상수 패턴**

상수 패턴은 자신과 똑같은 값과 매치 된다. 어떤 종류의 리터럴이든 상수로 사용할 수 있다.

```scala
// 상수 패턴을 사용한 패턴 매치
def describe(x: Any) = x match {
  case 5 => "five"
  case true => "truth"
  case "hello" => "hi"
  case Nil => "empty list"
  case _ => "none"
}
```

**변수 패턴**

변수 패턴은 와일드카드 처럼 어떤 객체와도 매치된다. 와일드카드와 다른 점은 변수에 객체를 바인딩한다는 사실이다.

```scala
// 변수 패턴을 사용한 패턴 매치
expr match {
  case 0 => "zero"
  case somthing => "not zero: " + somthing
}
```

**생성자 패턴**

생성자는 패턴 매치가 실제로 아주 큰 위력을 발휘할 수 있는 곳이다. 어떤 값이 해당 케이스 클래스의 멤버인지 검사한 다음, 객체의 생성자가 인자로 전달 받은 값들이 괄호 안의 패턴과 정확히 매치될 수 있는지 검사할 수 있다.

이렇게 추가적인 패턴이 있다는 건, 스칼라 패턴의 깊은 매치를 지원한다는 뜻이다. 즉, 어떤 패턴이 제공 받은 최상위 객체를 매치시킬 뿐만 아니라, 추가적인 패턴으로 객체의 내용에 대해서도 매치를 시도한다.

```scala
// 생성자 패턴을 사용한 패턴 매치
expr match {
  case BinOp("+", e, Number(0)) => println("deep match")
  case _ =>
}
```
**시퀀스 패턴**

배열이나 리스트 같은 시퀀스 타입에 대해서도 매치 시킬 수 있다.

```scala
// 길이가 정해진 시퀀스 패턴
expr match {
  case List(0, _, _) => println("found")
  case _ =>
}

// 길이와 관계없이 매치할 수 있는 시퀀스 패턴
expr match {
  case List(0, _*) => println("found")
  case _ =>
}
```

**튜플 패턴**

튜플 역시 매치 가능하다.

```scala
// 튜플 패턴을 사용하는 패턴 매치
def tupleDemo(expr: Any) =
  expr match {
    case (a, b, c) => println("match" + a + b + c)
    case _=>
  }
```

**타입 지정 패턴**

타입 검사나 타입 변환을 간편하게 하기 위해 타입 지정 패턴을 사용할 수 있다.

```scala
// 타입 지정 패턴을 사용한 패턴 매치
def generalSize(x: Any) = x match {
  case s: String => s.length
  case m: Map[_, _] => m.size
  case_ => -1
}
```

**타입 소거**

스칼라는 자바와 마찬가지로 제네릭에서 타입 소커 모델을 사용한다. 이는 실행 시점에 타입 인자에 대한 정보를 유지하지 않는다는 뜻이다.

결과적으로 실행 시에는 어떤 맵 객체가 두 Int 타입을 타입 인자로 받아서 생성한 것인지, 다른 타입들을 받아서 생성한 것인지 알 방법이 없다.

**변수 바인딩**

변수가 하나만 있는 패턴 말고, 다른 패턴에 변수를 추가할 수도 있다. 단순히 변수 이름 다음에 @ 기호를 넣고 패턴을 쓰면 된다.

```scala
// @ 기호를 사용한 변수 바인딩이 있는 패턴
expr match {
  case UnOp("abs", e @ UnOp("abs", _)) => e
  case _ =>
}
```

**패턴 가드**

때때로 문법적인 패턴 매치만으로는 부족한 경우 사용한다.

```scala
// 패턴 가드가 있는 match 표현식
def simplifyAdd(e: Expr) = e match {
  case BinOp("+", x, y) if x == y =>
    BinOp("*", x, Number)
  case _ => e
}
```

**패턴 겹침**

case의 순서가 중요하다.

```scala
// case의 순서가 중요함을 보여주는 match 표현의 
def simplifyAll(expr: Expr): Expr = expr match {
  case UnOp(*-", UnOp(*-", e)) =>
simplifyA11(e) // -를두번적용하는경우
  case BinOp("+", e, Number (0)) =>
    simplifyA11(e) // 0은 연산의 항등원 
  case BinOp("*", e, Number (1)) =>
    simplifyA11(e)  // 1은* 연산의 항등원 
  case UnOp(op, e) =>
    UnOp(op, simplifyAll(e))
  case BinOp(op, 1, r) =>
    BinOp(op, simplifyA11(1), simplifyA11(r))
  case _ => expr
}
```

## 봉인된 클래스

패턴 매치를 작성할 떄마다 모든 가능한 경우를 다 다뤘는지 확인할 필요가 있다. 디폴트 케이스를 추가해서 할 수 있지만, 이는 합적인 디폴트 동작이 있을때만 적용 가능하다.

대안은 케이스 클래스의 슈퍼클래스를 봉인된 클래스로 만드는 것이다. 봉인된 클래스는 그 클래스와 같은 파일이 아닌 다른 곳에서 새로운 서브클래스를 만들 수 없다.

패턴 매치를 위한 클래스 계층을 작성한다면, 그 계층에 속한 클래스를 봉인하는 것을 고려해야 한다. 단순히 sealed 키워드를 넣으면 된다.

```scala
// 봉인된 케이스 클래스 계층
sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

// 경고 발생 - match is not exhaustive
// BinOp, UnOp를 처리하지 않기에 경고 발생
def describe(e: Expr): String = e match {
  case Number(_) => "a number"
  case Var(_) => "a variable"
}

// 디폴트 케이스를 넣음으로써 해결 가능하지만, 이상적이지 않은 코드
def describe(e: Expr): String = e match {
  case Number(_) => "a number"
  case Var(_) => "a variable"
  case _ =>
}

// 그나마 나은 대안
def describe(e: Expr): String = (e @unchecked) match {
  case Number(_) => "a number"
  case Var(_) => "a variable"
}

```

## Option 타입

스칼라에는 Option 표준 타입이 있다. 이 타입은 선택적인 값을 표현하며, 두 가지 형태가 있다.

x가 실제 값이라면 Some(x)라는 형태로 값이 있음을 표현할 수 있고, 값이 없으면 None이라는 객체가 된다.

## 패턴은 어디에나

독립적인 match 표현식뿐 아니라, 스칼라의 여러 곳에서 패턴을 사용할 수 있다.

**변수 정의에서 패턴 사용하기**

val이나 var을 정의할 때 단순 식별자 대신 패턴을 사용할 수 있다.

```scala
// 할당문 하나로 여러 배열 정의하기
val myTuple = (12, "abc")
val (number, string) = myTuple

val exp = new BinOp("*", Number(5), Number(1))
val BinOp(op, left, right) = exp
```

**case를 나열해서 부분함수 만들기**

함수 리터럴이 쓰일 수 있는 곳이라면 중괄호 사이에 case를 나열한 표현식도 쓸 수 있다. 본질적으로 case의 나열도 함수 리터럴이다.

```scala
val withDefault: Option[Int] => Int = {
  case Some(x) => x
  case None => 0
}

withDefault(Some(10)) // 10
withDefault(None) // 0

// case를 나열해 액터의 receive 메소드 정의
var sum = 0
def receive = {
  case Data(byte) => sum += byte
  case GetCheckSum(requester) => 
    val checksum = ~(sum & 0xFF) + 1
    requester ! checksum
}

// 부분 함수 정의
// 경고 발생 - match is not exhaustive
val second: List[Int] => Int = {
  case x :: y :: _ => y
}
second(List(5,6,7)) // 정상
second(List()) // error

// 정수의 리스트를 받아 정수를 반환하는 부분 함수만을 포함하는 타입 PartialFunction[List[Int], Int]
val second: PartialFunction[List[Int], Int] = {
  case x :: y :: _ => y
}
//부분 함수가 어떤 값에 대해 결괏값을 정의하고 있는 지 알려주는 isDefinedAt
second.isDefinedAt(List(5,6,7)) // true
second.isDefinedAt(List()) // false
```

**for 표현식에서 패턴 사용하기**

for 표현식 안에 패턴을 사용할 수 있다. for 표현식은 capitals 맵에서 모든 키/값 쌍을 가져온.

```scala
// 튜플 패턴을 사용하는 for 표현식
for ((country, city) <- capitals)
  println(country + city)

// 패턴과 매치하는 리스트 원소 고르기
val results = List(Some("apple"), None, Some("orange"))
for (Some(fruit) <- results) println(fruit)
```

# 16장

## 리스트 리터럴

리스트는 배열과 꽤 비슷하지만 차이점이 두 가지 있다. 리스트는 변경이 불가능하고 원소를 할당문으로 변경할 수 없다. 리스트의 구조는 재귀적이지만, 배열은 평면적이다.

## 리스트 타입

배열과 마찬가지로 리스트도 동종 원소로 이뤄진다. 즉 리스트에 속한 원소의 타입은 모두 같다. 원소의 타입이 T인 리스트를 List[T]라 한다.

스칼라 리스트 타입은 공변적이다. 이는 S가 T의 서브 타입이면 List[S]도 List[T]의 서브 타입이라는 뜻이다.

## 리스트 생성

모든 리스트는 기본적으로 빌딩 블록인 Nil과 ::(콘즈)로 만들 수 있다. 중위 연산자 :: 는 리스트의 앞에 원소를 추가한다.

```scala
val nums = 1 :: 2 :: Nil
```

## 리스트 기본 연산

리스트의 모든 연산은 다음 세 가지를 가지고 표현할 수 있다. head와 tail은 비어있지 않은 리스트에서만 유효하다.

> 1. head는 어떤 리스트의 첫 번쨰 원소를 반환한다.
> 2. tail은 어떤 리스트의 첫 번째 원소를 제외한 나머지 원소로 이뤄진 리스트다.
> 3. isEmpty는 리스트가 비어 있다면 true를 반환한다.

## 리스트 패턴

리스트에 패턴 매치를 사용해 각 부분으로 나눌 수 있다. 리스트 패턴은 리스트 표현식과 일대일로 대응된다.

```scala
// 리스트 원소 패턴의 예
val List(a, b, c) = fruit
val a :: b :: rest = fruit

// 패턴 매치를 사용한 삽입 정렬
def isort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case x :: xs => insert(x, isort)
}
def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List
  case y :: ys => if (x <= y) x :: ys
                  else y :: insert(x, ys)
}
```

## List 클래스의 1차 메소드

어떤 메소드가 함수를 인자로 받지 않는다면, 그 메소드를 1차 메소드라 부른다. 

**두 리스트 연결하기**

::와 비슷한 연산자로 :::라는 리스트 연결 연산이 있다.

xs ::: ys ::: zs 이 식은 오른쪽으로 결합하기에 xs ::: (ys ::: zs) 이렇게 해석된다.

```scala
List(1, 2) ::: List(3, 4, 5) // List(1, 2, 3, 4, 5)
List(1, 2, 3) ::: List // List(1, 2, 3 
```

**분할 정복 원칙**

:::은 List 클래스 안에 구현되어 있는 메소드다. 하지만 리스트에 패턴 매치를 사용해 직접 구현할 수도 있다.

```scala
def append[T](xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }
```

> 위의 코드에서 두번째 case문이 분라 정복 원칙에서 정복 부분을 설명한다.

> 원하는 결과가 어떤 형태가 되어야 할 지 선택, 알고리즘을 적합한 부분에 재귀적으로 호출해서 계산, 구한 부분으로부터 결과 생성

**리스트 길이 구하기**

length 메소드를 사용한다.

```scala
List(1, 2, 3).length
```

**리스트 양 끝에 접근하기**

head는 첫 번쨰 원소를 반환하고, tail은 첫 번째 원소를 제외한 나머지 리스트를 반환 한다. 이 둘 모드 쌍대성 연산이 있다.

head의 쌍대성 연산인 last는 비어 있지 않은 리스트의 마지막 원소를 반환하며, tail의 쌍대성 연산인 init은 마지막 원소를 제외한 모든 리스트를 반환한다.

```scala
// 둘 다 빈 리스트에서 호출하면 에러가 발생한다.
val abcde = List(1, 2, 3, 4, 5)
abcde.last // 5
abcde.init // List(1, 2, 3, 4)
```

**리스트 뒤집기**

리스트 끝을 자주 참조하면, 리스트의 방향을 거꾸로 뒤집은 다음 결과를 가지고 작업하는 편이 때때로 더 낫다.


```scala
val abcde = List(1, 2, 3, 4, 5)
abcde.reverse // List(5, 4, 3, 2, 1)
```

**접두사와 접미사**

drop과 take 연산은 리스트에서 임의의 접두사나 접미사를 반환한다는 점에서 tail과 init을 일반화 한 것이다.

splitAt 연산은 주어진 인덱스 위치에서 리스트를 분할해서 두 리스트가 들어있는 순서쌍을 반환한다.

```scala
abcde take 2 // List(1, 2)
abcde drop 2 // List(3, 4, 5)
abcde splitAt 2 (List(1, 2), List(3, 4, 5))
```

**원소 선택하기**

임의의 원소를 선택하는 것은 apply 메소드를 통해 지원한다. 그러나 이 메소드는 배열에 비해 리스트에서는 자주 사용하지 않는다. indices 메소드는 리스트에서 유효한 모든 인덱스 리스트를 반환한다.

```scala
abcde apply 2 // 이렇게 사용하는 건 드물다 3
abcde(2) // 이거도 드물다 3
abcde.indices // Range(0, 1, 2, 3, 4)
```

**리스트의 리스트를 한 리스트로 반듯하게 만들기**

flattern 메소드는 리스트의 리스트를 인자로 받아서, 하나의 리스트로 반듯하게 펼친다. 리스트의 원소가 모두 리스트인 경우에만 적용할 수 있다.

```scala
List(List(1, 2), List(3), List(), List(4, 5)).flatten // List(1, 2, 3, 4, 5)
```

**두 리스트를 순서쌍으로 묶기**

zip 연산은 두 리스트를 인자로 받아서 순서쌍의 리스트를 만든다. 길이가 다르면 길이가 긴 쪽에 남는 원소는 버린다.

zipWithIndex는 리스트의 모든 원소와 그 원소의 위치를 묶는다.

모든 튜플 리스트는 unzip을 사용해 리스트의 튜플로 바꿀 수 있다.

```scala
a.indices zip b // Vector((0,a), (1,b))

abcde.zipWithIndex // List((1,0), (2,1) ...))

zipped.unzip // (List(1, 2, 3), List(1, 2, 3))
```

**리스트 출력하기**

toString 연산은 리스트에 대한 표준 문자열 표현을 반환한다. 다른 표현을 원한다면 mkString을 사용할 수 있다.

xs mkString(pre, sep, post), 피연산자가 4개이며 xs는 대상 리스트, 모든 원소 앞에 출력할 접두가 pre, 원소 사이에 출력할 분리 문자열, sep, 마지막 출력 post가 있다.

xs mkString sep == xs.mkString("", sep, "")

```scala
abcde.mkString("[", ",", "]") // [1,2,3,4,5]
abcde.mkString "" // abcde
```

**리스트 변환하기**

평면적인 배열과 재귀적인 리스트에서 데이터를 변환하고 싶다면, List 클래스의 toArray메서드나 Array 클래스의 toList를 사용한다.

copyToArray는 리스트 원소를 어떤 배열의 특정 지점부터 연속적으로 복사한다.

이터레이터를 사용해 접근해야하면, iterator를 사용하면 된다.

```scala
val arr = abcde.toArray // Array(1, 2, 3, 4, 5)
arr.toList // List(1, 2, 3, 4, 5)

val arr2 = new Array[Int](5) // Array(0, 0, 0, 0, 0)
List(1,2,3).copyToArray(arr2, 3)
arr2 // Array(0, 0, 0, 1, 2, 3, 0, 0)

val it = abcde.iterator
it.next // 1
it.next // 2
```

## List 클래스의 고차 메서드

모든 리스트 원소를 어떤 방법으로 변환하거나, 어떤 특성을 만족하는지 확인하거나, 특정 기준을 만족하는 원소를 뽑는 패턴을 고차 연산자라고 한다.

**리스트 매핑**

xs map f 연산은 피연산자로 List[T] 인 xs 리스트와 T => U 인 f 함수를 받는다.

flatMap 연산자는 map과 유사하다. 하지만 오른쪽 피연산자로 원소의 리스트를 반환하는 함수를 받는다.

```scala
List(1, 2, 3) map (_ + 1) // List(2, 3, 4)
var words = List("the", "quick", "brown", "fox")
words map (._length) // List(3, 5, 5, 3)
words map (_.toList.reverse.mkString) // List(eht, kciuq, nworb, xof)

// map flatMap 차이
words map (._toList) // List(List(t, h, e), List(q, u, i, c, k) ...) 
words flatMap (._toList) // List(t, h, e, q, u, i, c, k ...)

List.range(1, 5) flatMap(
        i => List.range(1, i) map (j => (i, j))
)
// List((2, 1), (3,1), (3,2), (4,1), (4,2), (4,3))
```

**리스트 걸러내기**

xs fillter p 는 List[T] 인 xs와 t => Boolean 타입의 술어 함수 p 를 받는다.

partitiondms filter와 같지만 리스트의 순서쌍을 반환한다.

find도 filter와 같지만 만족하는 모든 원소를 반환하지 않고 첫 번째 원소만 반환한다.

takeWhile과 dropWhile도 오른쪽 피연산자로 술어 함수를 받는다.

```scala
List(1, 2, 3, 4, 5) filter (_ % 2 == 0) // List(2, 4)
words filter (._length == 3) // List(the, fox)

List(1, 2, 3, 4, 5) partition(_ % 2 == 0) // (List(2, 4), List(1, 3, 5))

List(1, 2, 3, 4, 5) find (_ % 2 == 0) // Some(2)

List(1, 2, 3, -4, 5) takeWhile(_ > 0) // List(1, 2, 3)

words dropWhile (_ startsWidth "t") // List(quick, brown, fox)
```

**리스트 전체에 대한 술어**

xs forall p 은 인자로 리스트 xs와 술어 함수 p를 받는다. 모든 원소가 p를 만족할 때 true이다.

xs exist p 는 만족하는 원소가 하나라도 존재하면 true를 반환한다.

```scala
def hasZeroRow(m: List[List[Int]]) =
  m.exists(row => row forall (_ == 0))
hasZeroRow(diag3) // false
```

**리스트 폴드**

리스트의 원소를 연산자를 통해 결합할 때 사용한다.

```scala
def sum(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)
```

> 어려워

**리스트 정렬**

xs sortWith before 연산은 리스트 xs를 두 원소를 비교할 수 있는 함수 before를 사용해 정렬한다. x before y는 x가 y 앞에 있어야 하면 true를 반환한다.

```scala
List(1, -3, 4, 2, 6) sortWith(_ < _) 
words sortWith (_.length > _.length)
```

## List 객체의 메소드

리스트를 생성하는 팩토리 메소드와 특별한 모양의 리스트에서 동작하는 연산을 알아볼 것이다.

**원소로부터 리스트 만들기**

코드로 보자

```scala
List.apply(1, 2, 3) // List(1, 2, 3)
```
**수의 범위를 리스트로 만들기**

range는 어떤 범위를 구성하는 수로 이뤄진 리스트를 만든다.

```scala
List.range(1, 5) // List(1, 2, 3, 4)
List.range(1, 9, 2) // List(1, 3, 5, 7)
```

**균일한 리스트 만들기**

fill 메소드는 같은 원소를 0번 이상 반복한 리스트를 만든다.

```scala
List.fill(5)('a') // List(a, a, a, a, a)
List.fill(2, 3)('b') // List(List(b, b, b), List(b, b))
```

**함수 도표화**

tabulate는 제공된 함수로 계산한 원소의 리스트를 생성한다.

```scala
val squares = List.tabulate(5)(n => n * n)// List(0, 1, 4, 9, 16)
val multi = List.tabulate(5, 5)(_ * *) // 0,0,0,0,0 , 0,1,2,3,4 , 0,2,4,6,8, , 0,3,6,9,12 , 0,4,8,12,16
```

**여러 리스트 연결하기**

concat은 여러 리스트를 연결한다.

```scala
List.concat(List('a', 'b'), List('c')) // List(a, b, c)
```

## 여러 List를 함께 처리하기

zip은 두 리스트로부터 순서쌍의 리스트를 만들어 두 리스트를 한꺼번에 처리할 수 있다. 단점은 zip이 중간 리스트를 만들기에 비용이 발생하고, map이 취하는 함수가 튜플을 인자로 받는다는 점이다. 이로 인해 위치지정자를 사용할 수 없다.

layzZip이 zip의 문제를 해결해준다. zip과의 차이는 컬렉션을 즉시 돌려주지 않는다.

exists와 forall도 지연계산 zip에 해당하는 버전이 있다.

```scala
(List(10, 20) zip List(3,4,5)).map {case (x,y) => x * y} // List(30, 80)
(List(10, 20) lazyZip List(3,4,5)).map {case (x,y) => x * y} // List(30, 80)
(List("abc", "de") lazyZip List(3, 2)).forall(_.length == _) // true
(List("abc", "de") lazyZip List(3, 2)).exists(_.length != _) // false
```

## 스칼라의 타입 추론 알고리즘 이해

sortWith와 msort의 다른점 하나는 비교함수에 허용하는 문법적인 형태다

```scala
msort[Char]((x: Char, y: Char) => x > y)(abcde) // List(e, d, c, b, a)
abcde sortWith (_ > _) // List(e, d, c, b, a)

// msort는 더 간결하게 쓸 수 있다.
msort(_ > _)(abcde)
```

# 17장

## 컬렉션

스칼라는 풍부한 컬렉션 라이브러리를 지원한다.

## 시퀀스

시퀀스 타입은 순서가 정해진 데이터 그룹을 가지고 작업할 수 있게 해준다. 원소에 순서가 있기에 특정 순어의 원소를 요구할 수 있다.

**리스트**

변경 불가능한 연결 리스트다. List는 앞부분에 빠르게 원소를 추가하거나 삭제할 수 있다. 그러나 리스트를 순차적으로 따라가야만 하기 때문에 임의의 위치에 접근할 때는 빠르지 않다.

첫 번째 원소를 빠르게 추가하고 삭제할 수 있다는 건, 패턴 매치를 잘할 수 있다는 뜻이다. 리스트의 불변성은 리스트를 복사하지 않아도 되기 때문에 효율 적이면서 올바른 알고리즘에 도움된다.

**배열**

배열은 원소의 시퀀스를 저장하며, 임의의 위치에 있는 원소에 효율적으로 접근하게 해준다. 0을 기준으로 하는 인덱스를 사용해 원소를 읽거나 변경할 수 있다.

```scala
val fiveInts = new Array[Int](5) // Array(0, 0, 0, 0, 0)
val fiveToOne = new Array[Int](5, 4, 3, 2, 1) // Array(5, 4, 3, 2, 1)
fiveInts(0) = fiveToOne(4) // Array(1, 0, 0, 0, 0)
```

**리스트 버퍼**

List 클래스는 리스트의 앞쪽에 대해서는 빠른 접근을 제공하지만, 끝쪽에는 그렇지 않다. 리스트의 끝부분에 원소를 추가하려면 리스트의 앞에 원소를 추가해 뒤집힌 리스트를 만들고, reverse를호출해야 한다.

reverser를 피하는 방법은 ListBuffer를 사용하는 것이다. ListBuffer는 변경가능한 객체다. ListBuffer는 원소를 추가할 필요가 있을 때 효율적으로 리스트를 생성한다.

또한 ListBuffer는 List의 잠재적인 스택 오버플로를 피하기 위해서이다.

```scala
import scala.collection.mutable.ListBuffer
val buf = new ListBuffer[Int]
buf += 1 // ListBuffer(1)
buf += 2 // ListBuffer(1, 2)
3 += : buf // ListBuffer(3, 1, 2)
buf.toList // List(3, 1, 2)
```

**배열 버퍼**

ArrayBuffer는 끝부분과 시작 부분에 우너소를 추가하거나 삭제할 수 있다는 점만 제외하면 배열과 같다. 구현을 감싸주는 층 때문에 속도가 다소 느리다.

```scala
import scala.collection.mutable.ArrayBuffer
val buf = new ArrayBuffer[Int]()
buf += 12 // ArrayBuffer(12)
buf += 13 // ArrayBuffer(12, 15)
buf.length // 2
buf(0) == 12
```

**문자열(StringOps)**

StringOps는 많은 시퀀스 메소드를 구현한 것이다. Predef에 String을 StringOps로 바꾸는 암시적 변환이 있기 때문에 시퀀스 처럼 문자열을 다룰 수 있다.

```scala
def hasUpperCase(s: String) = s.exists(_.isUpper)
hasUpperCase("Robert") // true
hasUpperCase("asd") // false
```

## 집합과 맵

Set이나 Map을 만들면 디트로 변경 불가능한 객체가 생긴다. 변경 가능한 객체를 원한다면 명시적으로 임포트 해야 한다.

스칼라는 변경 가능한 것보단, 변경 불가능한 객체를 더 권장하기에 변경 불가능한 객체를 더 쉽게 접근할 수 있도록 한다.

```scala
// Predef 안에 있는 디폴트 맵과 집합 정의
object Predef {
  type Map[A, +B] = collection.immutable.Map[A, B]
  type Set[A] = collection.immutable.Set[A]
  val Map = collection.immutable.Map
  val Ser = collection.immutable.Set
}

// 변경가능한 Set
val mutaSet = collection.mutable.Set(1, 2, 3)
```

**집합의 사용**

집합의 핵심 특징은 특정 객체는 최대 하나만 들어가도록 보장한다는 점이다. 이때 ==으로 결정한다.

```scala
val text = "See Sopt run,. Run, Spot, Run!"
val wordsArray = text.split(("[ !,. ]+")) // 문자열을 공백 또는 구두점 문자가 존재하는 각 위치에서 분리하는 정규표현식
// Array(See, Spot, run, Run, Spot, Run)
val words = mutable.Set.empty[String]
for (word <- wordsArray)
  words += word.toLowerCase
words // Set(see, run, spot)
```

**맵의 사용**

맵은 어떤 값과 집합의 각 원소 사이에 연관 관계를 만든다. 배열을 사용하는 것과 비슷하지만, 정수 인덱스가 아닌 키를 사용할 수 있다는 점이 다르다.

```scala
val mutable.Map.empty[String, Int]
map("hello") = 1
map("there") = 2
map // Map(hello -> 1, there -> 2)
map("hello") // 1
```

**디폴트 집합과 맵**

대부분의 경우 Set이나 Map등의 팩토리가 제공하는 변경 가능하거나 불가능한 집합과 맵 구현만으로도 충분하다.

변경 불가능한 집합과 맵에 대해서, 팩토리에 얼마나 많은 원소를 전달하느냐에 따라 팩토리가 만드는 클래스는 달라진다.

| 원소개수 | 변경 불가능한 집합 디폴트 구현                   |
|------|-------------------------------------|
| 0    | scala.collection.immutable.EmptySet |
| 1    | scala.collection.immutable.Set1     |
| 2    | scala.collection.immutable.Set2     |
| 3    | scala.collection.immutable.Set3     |
| 4    | scala.collection.immutable.Set4     |
| 5 이상 | scala.collection.immutable.HashSet  |


| 원소개수 | 변경 불가능한 맵 디폴트 구현                    |
|------|-------------------------------------|
| 0    | scala.collection.immutable.EmptyMap |
| 1    | scala.collection.immutable.Map1     |
| 2    | scala.collection.immutable.Map2     |
| 3    | scala.collection.immutable.Map3     |
| 4    | scala.collection.immutable.Map4     |
| 5 이상 | scala.collection.immutable.HashMap  |

**정렬된 집합과 맵**

때때로 정해진 순서대로 원소를 반환하는 이터레이터를 제공하는 맵이나 집합이 필요할 수도 있다. 스칼라 컬렉션에는 TreeSet과 TreeMap 클래스가 있다.

두 클래스 모두 원소나 키를 다루기 위해 적흑 트리를 사용한다. 순서는 Ordering 트레이트를 따라 결정한다.

```scala
import scala.collection.immutable.TreeSet
val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5) // TreeSet(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
val cs = Treeseq('f', 'u, 'n') // TreeSet(f, n, u)

import scala.collection.immutable.TreeMap
val tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x') // Map(1 -> x, 3 -> x, 4 -> x)
tm += (2 -> 'x') // Map(1 -> x, 2 -> x, 3 -> x, 4 -> x)
```

## 변경 가능 컬렉션과 변경 불가능 컬렉션

문제에 따라서는 변경 가능 컬렉션이 더 좋을 수도 있다. 또 어떤 경우는 변경 불가능한 컬렉션이 더 좋기도 하다.

어떤 것을 선택해야 할 지 모그렜다면, 변경 불가능한 컬렉션으로 시작하고 나중에 필요에 따라 바꾸는데 좋다. 변경 불가능한 컬렉션이 프로그램을 추론하기가 더 쉽기 때문이다.

프로그램을 추론하기 더 쉬울 수 있다는 것과 더불어, 변경 불가능 컬렉션은 컬렉션에 저장할 원소의 수가 더 적은 경웅 변경 가능 컬렉션보다 일반적으로 더 작게 저장할 수 있다.

변경 불가능한 컬렉션에서 변경 가능한 컬렉션으로 바꾸거나 그 역으로 바꾸는 일을 쉽게 하기 위해, 스칼라에서는 몇 가지 문법적 편의를 제공한다.

```scala
val people = Set("Nancy", "Jane")
people += "Bob" // Error: val로는 불가능

var people = Set("Nancy", "Jane")
people += "Bob" // Success : Set(Nancy, Jane, Bob) - 새로운 컬렉션을 생성한 다음, 그 새 컬렉션을 가리키도록 재할당

people -= "Jane"
people ++= List("Tom", "Harry") // Set(Nancy, Bob, Tom, Harry)

// 변경 불가능한 Map을 변경 가능한 Map으로 변경
var capital = Map("US" -> "Washington")
capital += ("Japan" -> "Tokyo")

import scala.collection.mutable.Map // 추가하면 됨
```

## 컬렉션 초기화

컬렉션을 초기화하고 생성하는 일반적인 방법은 초기 원소를 컬렉션 동반 객체의 팩토리 메소드에 넘기는 것이다. 이 호출을 통해 apply 메소드 호출로 변환한다.

때때로 어떤 컬렉션을 생성하면서 컴파일러가 지정하는 것고 다튼 타입을 명시하고 싶을 수 있는데, 이는 변경 가능한 컬렉션에서 문제가 되곤 한다. 선언시 각 괄호 사이에 타입을 명시하면 된다.

```scala
// 문제가 되는 예
import scala.collection.mutable
val stuff = mutable.Set(42)
stuff += "abracadabra" // Error

// 해결
val nStuff = mutable.Set[Any](42)
nStuff += "abracadabra" // Success

// 어떤 컬렉션을 다른 컬렉션으로부터 초기화시 문제
val colors = List("blue", "yellow")
val treeSet = TreeSet(colors) // Error

// 해결
val nTreeSet = colors to TreeSet // Success
```

**배열이나 리스트로 바꾸기**

컬렉션을 임의의 다른 컬렉션으로 변환해주는 일반적인 to 메소드와 더불어, 더 구체적인 메소드도 있다. 리스트는 toList, 배열은 toArray를 호출하면 된다.

명심해야 할 사항은, 리스트나 배열 변환시 컬렉션의 모든 원소를 복하해야 하기 때문에 크기가 아주 큰 경우 느릴 수도 있다. 하지만 대부분의 컬렉션에는 그리 많지 않은 원소만 들어 있기 때문에, 복사로 인한 속도 손실은 그다지 크지 않다.

```scala
treeSet.toList
treeSet.toArray
```

**변경 가능한 집합과 변경 불가능한 집합 사이의 변환**

앞에서 본 to 메소드를 사용할 수 있다.

```scala
import scala.collection.mutable
val mutaSet = treeSet to mutable.Set
val immutaSet = mustaSet to Set

val muta = mutable.Map("i" -> i "ii" -> 2)
val immu = muta to Map
```

**튜플**

튜플은 정해진 개수의 원소를 한데 묶는다. 배열이나 리스트와 달리 튜플은 원소 타입이 서로 다를 수 있다.

튜플을 사용하면 데이터만 저장하는 단순한 클래스를 정의해야 하는 번거로움을 덜 수 있다. 튜플은 각기 다른 타입의 객체를 결합할 수 있기에 Iterable을 상속하지 않는다.

튜플을 사용하는 가장 일반적인 경우는 메소드에서 여러 값을 반환하는 것이다.

```scala
def longestWord(words: Array[String]): (String, Int) = {
  var word = words(0)
  var idx = 0
  for (i <- 1 until words.length) {
    if (words(i).length > word.length) {
      word = words(i)
      idx = 1
    }
    (word, idx)
  }
}

val longest = longestWord("The quick brown fox".split(" ")) // (quick, 1)
longest._1 // quick
longest._2 // 1

val (word, idx) = longest // word = quick, idx = 1

// 괄호가 없으면 다른 결과가 나온다 - 여러개의 정의를 제공한다.
val world idx = longest // word = (quick, 1), idx = (quick, 1)
```


