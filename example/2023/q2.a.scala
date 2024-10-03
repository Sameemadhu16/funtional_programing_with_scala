object exam extends App{
    def f1(i:Int,n:Int):Unit ={
    println("Value of a: " + i);
    if(i<n) {
        f1(i+1,n);
    }
}
    f1(1,10)
}