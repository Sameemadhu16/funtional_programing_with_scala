object exam extends App{
    def commonNumber(l1:List[Int],l2:List[Int]):List[Int] ={
        l1.filter(l2.contains(_))
    }
    val l1 = List(1,2,3,4,5)
    val l2 = List(3,4,5,6,7)
    println(commonNumber(l1,l2))
}