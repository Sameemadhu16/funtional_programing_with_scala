object TowerOfHanoi {
  def towerOfHanoi (n:Int,from:String,to:String,aux:String):Unit = {
    if(n==1){
        println(s"move disk 1 from $from to $to")
    }
    else {
        towerOfHanoi(n-1,from,aux,to)
        println(s"move disk $n from $from to $to")
        towerOfHanoi(n-1,aux,to,from)
    }

  }
  def main(args: Array[String]):Unit = {
    towerOfHanoi(6,"A","C","B")
  }
}
