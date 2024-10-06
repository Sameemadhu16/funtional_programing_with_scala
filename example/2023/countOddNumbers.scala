object exam extends App{
    def countOddNUmbers(l:List[Int]):Int={
        l.filter(_%2!=0).map(x=>(1,x)).reduce((x,y)=>(x._1+y._1,x._2+y._2))._1
    }
    val l = List(2, 5, 3, 6, 4, 7,9,11,78,68,09)
    println(countOddNUmbers(l))
}