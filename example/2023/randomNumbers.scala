object exam extends App{
    //generate a random number
    val r1 =(x:Int)=> scala.util.Random.nextInt(x)
    println(r1(10))

    //generate a list of random numbers
    val r2 =(x:Int)=>List.fill(x)(r1(1000))
    println(r2(5))
}