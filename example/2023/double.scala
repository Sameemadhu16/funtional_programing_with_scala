object exam extends App{
    val double = (l:List[Int]) => l.map(_*2)

    var list = List(1,2,3,4,5)
    println(double(list))
}