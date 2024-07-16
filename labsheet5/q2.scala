case class Book(title: String, author: String, isbn: String) 

object LibraryManagement { 
  var library: Set[Book] = Set( 
    Book("Famous Five", "Enid Blyton", "123456"),
    Book("Madolduwa", "Martin Wickramasinghe", "222222"),
    Book("The White Walker", "John Snow", "334455")
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
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author)) //filters the books by the given author.
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
    val newBook = Book("The Prince", "John Wilson", "667788")
    addBook(newBook)
    displayLibrary()

    // Remove a book by ISBN
    removeBook("123456")
    displayLibrary()

    // Check if a book is in the library by ISBN
    println(s"\nIs book with ISBN '222222' in the library? ${isBookInLibrary("123456")}")

    // Search for a book by title
    searchBookByTitle("Madolduwa")

    // Display all books by a specific author
    displayBooksByAuthor("John Snow")
  }
}
