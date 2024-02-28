import scala.collection.mutable

object Main {
  def main(args: Array[String]): Unit = {
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

      def this(n: Int) = {
        this(n, 1)
      }

      def lessThan(that: Rational): Boolean = {
        // this 생략 가능
        this.numer * that.denom < that.numer * this.denom
      }

      def max(that: Rational): Rational = {
        // this.lessThan은 생략 가능 else this는 생략 불가
        if(this.lessThan(that)) that else this
      }
    }

    val a = new Rational(1, 2)
  }
}
