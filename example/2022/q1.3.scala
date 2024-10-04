object exam extends App {
    val f1 = (x:Int, y:Int) => x*y
    val f2 = (x:Int, y:Int) => x+y
    val x = List(1,2,3,4,5)
    val y = x.map(x=>f1(x,2)).reduce(f2)
    println(y)
}