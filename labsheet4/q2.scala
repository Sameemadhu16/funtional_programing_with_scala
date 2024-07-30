object Q2 {
  def identifynum(): Unit = {
    try { 
      println("Input a number:")
      val input = scala.io.StdIn.readLine().toInt 

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