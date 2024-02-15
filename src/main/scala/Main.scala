import java.math.BigInteger

object Main {
  def main(args: Array[String]): Unit ={
    val x = 10
    val y = 20
//    println(max(x, y))
//    whileTest()
    instanceTest()
  }


  def max(x: Int, y: Int): Int = {
    if(x > y) x
    else y
  }

  private def whileTest(): Unit = {
    var i = 0
    while (i < 10) {
      println(i)
      i += 1
    }
  }

  def instanceTest(): Unit = {
    val big = new BigInteger("12345")
    println(big)

    val arrayTest = new Array[Int](5)
    arrayTest(0) = 1
    arrayTest(1) = 2
    arrayTest(2) = 3
    arrayTest(3) = 4
    arrayTest(4) = 5

//    arrayTest.foreach(i => println(i))

    for (i <- 0 to 3)
      println(arrayTest(i))
  }
}
