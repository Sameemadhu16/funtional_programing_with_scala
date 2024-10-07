object Power{
    def power(a:Int,b:Int):Int = b match{
        case 0 => 1
        case _ => a*power(a,b-1)
    }
    def main(args: Array[String]):Unit = {
        println(power(2,3))
    }
}