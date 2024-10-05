object CommonElements extends App {
  def commonNumbers(l1: List[Int], l2: List[Int]): List[Int] = {
    l2.filter(l1.contains)
  }

  // Example usage
  val list1 = List(1, 2, 3, 4, 5)
  val list2 = List(3, 4, 5, 6, 7)

  val common = commonNumbers(list1, list2)

  println(common)  // Output: List(3, 4, 5)
}
