object Josephus{
    def jos(n:Int,k:Int):Int = {
        if (n == 1) 0
        else(jos(n-1,k)+k)%n
    }
    def main(args: Array[String]):Unit = {
        println(jos(5,3))
    }
}
