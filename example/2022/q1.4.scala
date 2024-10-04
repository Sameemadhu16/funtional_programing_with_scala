object exam extends App{
    val pi = 3.14
    val double = (x:Double) => x*x
    val area = (r:Double) => pi*double(r)
    println(area(5))
}