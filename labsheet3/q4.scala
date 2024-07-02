// Write a function in Scala that takes a list of integers as input and returns the sum of all the
// even numbers in the list.

object SumEvenNumbers {
  def sumEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val result = sumEvenNumbers(inputList)
    println(s"The sum of all even numbers in the list is $result")
  }
}
