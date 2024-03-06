# start_scala
프로젝트 투입 전 scala 공부 - Programming in Scala 4판

- [1장](#1장)
    * [확장 가능한 언어](#확장-가능한-언어)
    * [새로운 제어 구조](#새로운-제어-구조)
- [2장, 3장](#2장-3장)
    * [변수 정의하기](#변수-정의하기)
    * [함수 정의하기](#함수-정의하기)
    * [Array, List, Tuple, Set, Map](#array-list-tuple-set-map)
    * [함수형 프로그래밍](#함수형-프로그래밍)
- [4장](#4장)
    * [클래스](#클래스)
    * [세미콜론 추론](#세미콜론-추론)
    * [싱글톤 객체](#싱글톤-객체)
- [5장](#5장)
  * [타입](#타입)
  * [리터럴](#리터럴)
  * [문자열 인터폴레이션](#문자열-인터폴레이션)
  * [연산자는 메소드다.](#연산자는-메소드다)
  * [산술 연산, 관계 연산, 논리 연산, 비트 연산, 객체 동일성](#산술-연산--관계-연산--논리-연산--비트-연산--객체-동일성)
  * [연산자 우선순위와 결합 법칙](#연산자-우선순위와-결합-법칙)
  * [풍부한 래퍼](#풍부한-래퍼)
- [6장](#6장)
  * [분수 클래스 명세](#분수-클래스-명세)
- [7장](#7장)
  * [if 표현식](#if-표현식)
  * [while 루프](#while-루프)
  * [for 표현식](#for-표현식)
  
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
  for (season <- List("fall", "winter", "spring")) pr ntln(season + " + calculate(season))
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
