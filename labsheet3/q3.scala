// You are given two integers, num1 and num2. Write a function in Scala to determine the
// arithmetic mean (average) of the two numbers, rounded to two decimal places. Return
// the result as a floating-point number.

object ArithmeticMean {
  def mean(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.0
    Math.round(average*100.0)/100.0
  }

  def main(args: Array[String]): Unit = {
    val num1 = 6
    val num2 = 13
    val result = mean(num1, num2)
    println(s"The mean of $num1 and $num2 is $result")
  }
}



