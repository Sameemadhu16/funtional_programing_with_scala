object factorial{
    def fac(n:Int):Int = n match {
        case 0 =>  1
        case 1 =>  1
        case _ => n*fac(n-1)
    }
    def main(args: Array[String]):Unit = {
        println(fac(1))
    }
}