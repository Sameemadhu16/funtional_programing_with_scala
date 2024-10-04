object exam extends App{
    val fx = (x:Int) =>
        if (x%2==0) false else true
    val lx = List(1,2,3,4,5,6,7,8,9,10)
    val lfx = lx.filter(fx).map(_*2)
    println(lfx)

}