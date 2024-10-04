object exam extends App{
    val fx=(x:Int)=>(y:Int)=>(x,y)
    val x = List(1,2,3,4,5)
    val y =x.map((x)=>fx(1)(x))
    val z = y.reduce((x,y)=>(x._1+y._1,x._2+y._2))
    println(z)
}