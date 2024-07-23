object Inventory {
  def item_names: Array[String] = Array("Apple", "Banana", "Orange")
  def item_quantities: Array[Int] = Array(10, 12, 4)

  def displayInventory(names: Array[String], quantities: Array[Int]): Unit = {
    if (names.nonEmpty) {
      println(s"${names.head}: ${quantities.head}")
      displayInventory(names.tail, quantities.tail)
    }
  }

  def restockItem(item_name: String, item_quantity: Int, names: Array[String], quantities: Array[Int]): Unit = {
    if (names.isEmpty) {
      println(s"Item '$item_name' does not exist in the inventory.")
    } else if (item_name == names.head) {
      quantities(0) += item_quantity
      println(s"Restocked $item_quantity of $item_name. New quantity: ${quantities.head}")
    } else {
      restockItem(item_name, item_quantity, names.tail, quantities.tail)
    }
  }

  def sellItem(item_name: String, item_quantity: Int, names: Array[String], quantities: Array[Int]): Unit = {
    if (names.isEmpty) {
      println(s"Item '$item_name' does not exist in the inventory.")
    } else if (item_name == names.head) {
      if (quantities.head >= item_quantity) {
        quantities(0) -= item_quantity
        println(s"Sold $item_quantity of $item_name. New quantity: ${quantities.head}")
      } else {
        println(s"Not enough quantity of $item_name to sell. Available quantity: ${quantities.head}")
      }
    } else {
      sellItem(item_name, item_quantity, names.tail, quantities.tail)
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory(item_names, item_quantities)
    restockItem("Orange", 5, item_names, item_quantities)
    sellItem("Banana", 3, item_names, item_quantities)
    sellItem("Orange", 10, item_names, item_quantities)
    displayInventory(item_names, item_quantities)
  }
}
