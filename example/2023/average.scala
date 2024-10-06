object exam extends App{
    val sum =(l:List[Int])=>l.reduce((x,y)=>x+y)
    val a = sum(List(2, 5, 3, 6, 4, 7))
    println(s"sum of numbers is $a")

    val stat:List[Int] => (Int,Double)=(l:List[Int])=>(sum(l),sum(l).toDouble/l.size)
    val b=stat(List(2, 5, 3, 6, 4, 8))
    println(s"sum and average of numbers is $b")

    //generate list of tuples
    val t = (l:List[Int])=> l.map((x)=>(x,1))
    val t1 = t(List(2, 5, 3, 6, 4, 7))
    println(s"list of tuples is $t1")

    //add each elements
    val fx = (l:List[Int])=>l.map((x)=>(x,1)).reduce((x,y)=>(x._1+y._1,x._2+y._2))
    val fx1 = fx(List(2, 5, 3, 6, 4, 7))
    println(s"sum of elements is in tuple $fx1")
    println(s"number of elements in the list is ${fx1._2}")


}