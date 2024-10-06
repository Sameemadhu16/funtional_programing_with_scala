object example extends App{
    val l = List(2, 5, 3, 6, 4, 7)
    val isEven = (i:Int)=>i%2 == 0
    val double = (i:Int)=>i*2
    val f1 = l.filter(isEven)
    val f2 = f1.map(double)
    println(s"Even numbers are :$f1")
    println(s"Doubled numbers are :$f2")
}