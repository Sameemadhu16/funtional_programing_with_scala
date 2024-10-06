object exam extends App{
    val isPrime =(n:Int)=>(2 to Math.sqrt(n).toInt)
    println(isPrime(25))

    val isPrime1 =(n:Int)=>(2 to Math.sqrt(n).toInt).filter(n%_==0)
    println(isPrime1(100))

    val isPrime2=(n:Int)=>(2 to Math.sqrt(n).toInt).filter(n%_==0).size==0
    println(isPrime2(31))
}

