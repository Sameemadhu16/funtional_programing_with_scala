object exam extends App{
    def f1 (x:Int,y:Double) = x*y
    def f2 (x:Double,y:Int) = x+y
    def f3 (x:Double,y:Int) = x-y
    val x=f3(f2(f1(2,3),4),5)
    println(x)
}