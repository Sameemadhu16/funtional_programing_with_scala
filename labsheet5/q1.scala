object Fibonacci {
  // Recursive function to calculate the nth Fibonacci number
  def fib(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else fib(n - 1) + fib(n - 2)
  }

  // Recursive function to print the first n Fibonacci numbers
  def printFibonacci(n: Int): Unit = {
    def printFibonacciHelper(current: Int): Unit = {
      if (current < n) {
        println(fib(current))
        printFibonacciHelper(current + 1)
      }
    }
    printFibonacciHelper(0)
  }

  def main(args: Array[String]): Unit = {
    val n = 10 // Change this value to print more or fewer Fibonacci numbers
    println(s"First $n Fibonacci numbers:")
    printFibonacci(n)
  }
}
