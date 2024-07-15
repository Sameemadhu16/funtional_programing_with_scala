case class Book(title: String, author: String, isbn: String)

object LibraryManagement {
  var library: Set[Book] = Set(
    Book("Famous Five", "Enid Blyton", "123456"),
    Book("A Study in Scarlet", "Sir Arthur Conan Doyle", "222222"),
    Book("The Sign of the Four", "Sir Arthur Conan Doyle", "334455")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Book '${book.title}' added to the library.")
  }

  def removeBook(isbn: String): Unit = {
    val bookToRemove = library.find(_.isbn == isbn)
    bookToRemove match {
      case Some(book) =>
        library -= book
        println(s"Book '${book.title}' removed from the library.")
      case None =>
        println(s"No book found with ISBN '$isbn'.")
    }
  }

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("\nCurrent Library Collection:")
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def searchBookByTitle(title: String): Unit = {
    val foundBook = library.find(_.title.equalsIgnoreCase(title))
    foundBook match {
      case Some(book) =>
        println(s"\nBook found - Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"\nNo book found with title '$title'.")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"\nBooks by '$author':")
      booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    } else {
      println(s"\nNo books found by author '$author'.")
    }
  }

  def main(args: Array[String]): Unit = {
    // Initial display of library
    displayLibrary()

    // Add a new book
    val newBook = Book("Kittey", "Irumi Theekshana", "667788")
    addBook(newBook)
    displayLibrary()

    // Remove a book by ISBN
    removeBook("123456")
    displayLibrary()

    // Check if a book is in the library by ISBN
    println(s"Is book with ISBN '1122334455' in the library? ${isBookInLibrary("1122334455")}")

    // Search for a book by title
    searchBookByTitle("Famous Five")

    // Display all books by a specific author
    displayBooksByAuthor("Sir Arthur Conan Doyle")
  }
}
