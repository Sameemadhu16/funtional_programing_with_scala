//Write a function in Scala that takes a list of strings as input and returns a new list
// containing only the strings that have a length greater than 5.

object Q2{

  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args:Array[String])={
    
  val inputList = List("Scala", "programming", "php", "function", "html", "github")
  val result = filterLongStrings(inputList)
  println(result) 
  }

}
