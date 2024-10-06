object exam extends App{
    val l = List(2, 5, 3, 6, 4, 7)
    val a =l.fold(0)((x,y)=>x+y)
    println(a)
}