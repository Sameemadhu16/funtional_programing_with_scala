object exam extends App{
    def f1(x:Int,y:Int) = x*y
    def f2(x: (Int,Int)=>Int,y:Int) = x(y,y+1) +2
    val x=f2(f1,5)
    println(x)
}

//output = 32