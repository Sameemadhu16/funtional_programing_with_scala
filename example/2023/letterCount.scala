object exam extends App{
    val fc=(x:Char,s:String)=>(x,s.count(_==x))
    println(fc('a',"apple"))
}