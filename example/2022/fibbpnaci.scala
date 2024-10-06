object fibbonaci{
    def fib(n:Int):Int = n match{
        case 0 => 0
        case 1 => 1
        case _ => fib(n-1)+fib(n-2)
    }
    def main(args: Array[String]):Unit ={
        println(fib(25))
    }
}