import scala.collection.mutable

object Main {
  def main(args: Array[String]): Unit = {
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
  }
}
