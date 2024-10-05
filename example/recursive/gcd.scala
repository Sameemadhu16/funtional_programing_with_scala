object gcd extends App{
def GCD(a:Int,b:Int):Int=b match{
case 0 => a
case x if x>a => GCD(x,a)
case _ => GCD(b,a%b)
}
println(GCD(15,35))
}