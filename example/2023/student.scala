object StudentMarks extends App {

  // Define a case class for Student
  case class Student(name: String, marks: Int)

  // List of students
  val students = List(Student("Kasun", 80), Student("Kulunu", 70), Student("Nuwan", 60), Student("Nimal", 50))

  // Sort by marks in ascending order
  val sortedStudents = students.sortBy(_.marks)

  // Print the sorted list
  sortedStudents.foreach { apple =>
    println(s"${apple.name} => ${apple.marks}")
  }
}
