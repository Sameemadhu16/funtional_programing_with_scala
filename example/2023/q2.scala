object exam extends App{
    val x = List(1,2,3,4,5)
    val f1 = (x:Int) => x*x
    val f2 = (x:Int) => x + x
    val y = x.map(x=>f1(x)).map(x=>f2(x))
    println(y)
}

//List(2,8,18,32,50)