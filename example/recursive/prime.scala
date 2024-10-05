object example extends App{

def GCD(a:Int,b:Int):Int=b match{
case 0 => a
case x if x>a => GCD(x,a)
case _ => GCD(b,a%b)
}
def prime(n:Int,i:Int=2):Boolean=i match{
case x if(x==n) => true
case x if gcd.GCD(n,x)>1 => false
case x => prime(n,x+1)
}
println(prime(5))
}