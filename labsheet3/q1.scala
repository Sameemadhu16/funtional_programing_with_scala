//. Write a function in Scala that takes a string as input and returns the reverse of the string
// using a recursive approach.

object StringReversal {
  def reverse(s: String): String = {
    if (s.isEmpty) ""
    else reverse(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = {
    val inputString = "Hello, Sameera!"
    val reversedString = reverse(inputString)
    println(s"Original: $inputString")
    println(s"Reversed: $reversedString")  
  }
}
