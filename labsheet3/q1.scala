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

//The program starts executing from the main method.
// It defines inputString with the value "Hello, Scala!".
// It calls the reverse method with inputString, initiating the recursive reversal process.
// The reverse method checks if the string is empty. If not, it calls itself with the tail of the string and appends the head character at the end.
// This process continues until the base case is reached (an empty string).
// As the recursion unwinds, the characters are appended in reverse order, building the reversed string.
// Finally, the original and reversed strings are printed to the console.