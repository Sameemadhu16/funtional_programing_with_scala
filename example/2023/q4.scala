object exam extends App{
    val fx = (x:Int)=>(y:Int)=>
        if(x%y == 0) false
        else true

    val lx = List(1,2,3,4,5,6)
    val lfx = lx.filter(x => fx(x)(3))
    println(lfx)
}