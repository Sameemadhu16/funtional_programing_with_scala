// Define a trait for Product
trait Product {
    def name: String
    def price: Double
}

// Define case class for Book that extends Product
case class Book(name: String, author: String, price: Double) extends Product

// Define case class for Electronics that extends Product
case class Electronics(name: String, brand: String, price: Double, warrantyInYears: Int) extends Product

// Define case class for User
case class User(name: String, address: String)

// Define case class for Order
case class Order(user: User, items: List[Product]) {

  // Calculate the total price of the order
    def totalPrice: Double = items.map(_.price).sum

  // Show the order details
    def orderDetails(): Unit = {
    println(s"Order placed by: ${user.name}")
    println(s"Shipping to: ${user.address}")
    println("Items in the order:")
    items.foreach(item => println(s"- ${item.name}: $${item.price}"))
    println(s"Total Price: $$${totalPrice}")
    }
}

// Main object to run the code
object ShoppingApp extends App {

  // Create some products
    val book1 = Book(name = "Scala Programming", author = "Martin Order", price = 29.99)
    val book2 = Book(name = "Functional Programming in Scala", author = "Paul C", price = 35.00)

    val electronics1 = Electronics(name = "Smartphone", brand = "TechBrand", price = 499.99, warrantyInYears = 2)
    val electronics2 = Electronics(name = "Laptop", brand = "SuperBrand", price = 999.99, warrantyInYears = 3)

  // Create a user
    val user = User(name = "Alice", address = "123 Scala Street, Functional City")

  // Create an order for the user with a list of products
    val order = Order(user, List(book1, book2, electronics1))

  // Display the order details
    order.orderDetails()
}
