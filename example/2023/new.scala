object example extends App {
  def countEvenNumbers(arr: List[Int]): Int = {
    arr.filter(_ % 2 == 0)
      .map(_ => 1)
      .reduce(_ + _)
  }

  var arr = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  println(countEvenNumbers(arr))  // Output: 4
}
