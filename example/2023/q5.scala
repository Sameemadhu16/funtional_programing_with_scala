object exam extends App {
case class Rational(x: Int, y: Int) {
def numer = x

def denom = y
def op(r: Rational) =
new Rational (numer * r.denom + r.numer * denom, denom * r.denom)
override def toString = numer + "/" +denom

}

val n1=Rational (1,3)
val n2=Rational (5,7)
println(n1.op(n2))

}