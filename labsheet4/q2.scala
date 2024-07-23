object PatternMatching {
  def main(args: Array[String]): Unit = {
    
    println("Please provide an integer as a command line argument.")
    val input = args(0).toInt
    checkNumber(input)
      
    }
  

  def checkNumber(number: Int): Unit = {
    number match {
      case x if x <= 0 => println("Negative/Zero input")
      case x if x % 2 == 0 => println("Even number")
      case _ => println("Odd number")
    }
  }
}
