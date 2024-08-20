import scala.io.StdIn.readLine

object InterestCalculator {

  def main(args: Array[String]): Unit = {
    // Define the lambda function to calculate interest
    val calculateInterest: Double => Double = deposit => deposit match {
      case x if x <= 20000    => x * 0.02
      case x if x <= 200000   => x * 0.04
      case x if x <= 2000000  => x * 0.035
      case x if x > 2000000   => x * 0.065
    }

    // Get user input
    print("Enter the deposit amount: Rs. ")
    val depositAmount = readLine().toDouble

    // Calculate interest
    val interest = calculateInterest(depositAmount)
    println(f"Interest earned on Rs. $depositAmount%.2f is Rs. $interest%.2f")
  }
}
