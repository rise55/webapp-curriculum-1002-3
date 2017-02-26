import scala.math.BigInt

object Factorial extends App {
  def factorial(i: Int, ac: BigInt): BigInt = if (i == 0) ac else factorial(i - 1, ac * i)

  println(factorial(10000, 1))
}
