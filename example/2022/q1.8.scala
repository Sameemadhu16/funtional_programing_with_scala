object exam extends App{
    val cube = (x:Int)=>x*x*x
    val square = (x:Int)=>x*x
    val print = (f:Int => Int) => (x:Int)=> f(x)
    println(print(cube)(square(2)))
}