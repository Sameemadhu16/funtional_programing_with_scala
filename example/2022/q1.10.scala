object exam extends App{
    def fx(a:Int, b:Int) : Int =
        if(b == 0) a else fx(b, a%b)
    val l1=List(12,24,16)
    val l2=l1.reduce((x,y) => fx(x,y))
    println(l2)
}