object example extends App{
    val l = List(2, 5, 3, 6, 4, 7)
    val f1 = l.reduce((x, y) => x max y)
    val f2 = l.reduce((x,y)=>x min y)
    println(s"maximum number is $f1")
    println(s"minimum number is $f2")
}