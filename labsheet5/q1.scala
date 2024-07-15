import scala.io.StdIn.readLine

object InventoryManagementSystem {

  def getProductList(): List[String] = {
    def getProductListHelper(products: List[String]): List[String] = {
      val productName = readLine("Enter product name (or type 'done' to finish): ")
      if (productName.toLowerCase == "done") products
      else getProductListHelper(products :+ productName)
    }

    getProductListHelper(List())
  }

  def printProductList(productList: List[String], index: Int = 1): Unit = {
    if (productList.nonEmpty) {
      println(s"${index}. ${productList.head}")
      printProductList(productList.tail, index + 1)
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.length
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nList of Products:\n")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}
