object Inventory {
  val item_names: Array[String] = Array("Apple", "Banana", "Orange")
  var item_quantities: Array[Int] = Array(10, 12, 4)

  def displayInventory(names: Array[String], quantities: Array[Int]): Unit = {
    names.zip(quantities).foreach { case (name, quantity) => println(s"$name: $quantity") } 
  }

  def restockItem(item_name: String, item_quantity: Int, names: Array[String], quantities: Array[Int]): Array[Int] = {
    val index = names.indexOf(item_name) 
    if (index != -1) {
      quantities(index) += item_quantity
      println(s"Restocked $item_quantity of $item_name. New quantity: ${quantities(index)}") 
    } else {
      println(s"Item '$item_name' does not exist in the inventory.")
    }
    quantities 
  }

  def sellItem(item_name: String, item_quantity: Int, names: Array[String], quantities: Array[Int]): Array[Int] = {
    val index = names.indexOf(item_name)
    if (index != -1) {
      if (quantities(index) >= item_quantity) {
        quantities(index) -= item_quantity
        println(s"Sold $item_quantity of $item_name. New quantity: ${quantities(index)}")
      } else {
        println(s"Not enough quantity of $item_name to sell. Available quantity: ${quantities(index)}")
      }
    } else {
      println(s"Item '$item_name' does not exist in the inventory.")
    }
    quantities
  }

  def main(args: Array[String]): Unit = {
    displayInventory(item_names, item_quantities)
    item_quantities = restockItem("Orange", 5, item_names, item_quantities)
    item_quantities = restockItem("Banana", 10, item_names, item_quantities)
    item_quantities = sellItem("Banana", 3, item_names, item_quantities)
    item_quantities = sellItem("Orange", 5, item_names, item_quantities)
    displayInventory(item_names, item_quantities)
  }
}
