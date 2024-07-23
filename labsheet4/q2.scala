object Q2 {
  def identifynum(): Unit = {
    try { // A try block to catch exceptions that might occur during the execution of the enclosed code.
      println("Input a number:")
      val input = scala.io.StdIn.readLine().toInt //Reads a line of input from the standard input (console) and attempts to convert it to an integer

      if (input <= 0) {
        println("Negative or Zero")
      } else if (input % 2 == 0) {
        println("Even number")
      } else {
        println("Odd number")
      }
    } catch {
      case e: NumberFormatException =>
        println("Invalid input. Please enter a valid integer.")
    }
  }

  def main(args: Array[String]): Unit = {
    identifynum()
  }
}