// You are given two integers, num1 and num2. Write a function in Scala to determine the
// arithmetic mean (average) of the two numbers, rounded to two decimal places. Return
// the result as a floating-point number.

object ArithmeticMean {
  def mean(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.0
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 5
    val num2 = 10
    val result = mean(num1, num2)
    println(s"The mean of $num1 and $num2 is $result")
  }
}



