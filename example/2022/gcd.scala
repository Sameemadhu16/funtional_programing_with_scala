object GCD {
    def gcd(a:Int,b:Int):Int = b match{
        case 0 => a
        case _ => gcd(b,a%b)
    }
    def main(args: Array[String]):Unit = {
        println(gcd(10,15))
    }
}