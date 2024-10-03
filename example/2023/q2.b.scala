object RecursionExample {

  def isEven(n: Int): Boolean = {
    if (n == 0) true
    else isOdd(n - 1)
    
  }

  def isOdd(n: Int): Boolean = {
    if (n == 0) false
    else isEven(n - 1)
  }

  def main(args: Array[String]): Unit = {
    val number = 9
    println(s"Is $number even? ${isEven(number)}")
    println(s"Is $number odd? ${isOdd(number)}")
  }
}
