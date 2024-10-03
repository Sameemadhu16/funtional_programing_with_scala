object exam extends App{
    val f1 = (x:Int,y:Int) => x * y
    val f2 = (x:Int,y:Int) => x + y

    val x = List(1,2,3,4,5)
    val y = x.reduce(f1) + x.reduce(f2)
    val z = x.map(x=> x+y)
    println(z);
}