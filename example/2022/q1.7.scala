object exam extends App{
    case class Point(x:Int,y:Int){
        val f = (x:Int,y:Int)=>x+y
        val op =(that:Point)=>
        Point(f(that.x,this.y),f(that.y,this.x))
    }
    val p1 = Point(2,3)
    val p2 = Point(3,4)
    println(p1.op(p2))
}