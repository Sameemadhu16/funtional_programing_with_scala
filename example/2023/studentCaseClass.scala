case class Student(name: String, marks: Int)

object exam extends App {
    // List of students
    val students = List(Student("Nuwan", 60), Student("Kulunu", 70), 
                        Student("Nimal", 50), Student("Kasun", 80))

    // Map to extract marks and reduce to calculate the total
    val f_list = students.map(x=>(1,x.marks)).reduce((x,y)=>(x._1+y._1,x._2+y._2))
    val totalMarks = f_list._2
    val averageMarks = totalMarks/f_list._1

    val sortedStudents = students.sortBy(_.marks).reverse
    val print = (s:Student) =>println(s"${s.name}    => ${s.marks}")

    // Print the total marks
    println(s"Total marks of students is $totalMarks")
    println(s"Average marks of students is $averageMarks")
    //println(sortedStudents)
    sortedStudents.map((x)=>print(x))
}
