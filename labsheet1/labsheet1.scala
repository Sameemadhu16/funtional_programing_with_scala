object MainApp{
  def area(r: Int): Double = {
    return Math.PI * r * r;
      
  }

  def fahrenhite(celcius: Double):Double={
      return celcius * 1.8000 + 32.00;
  }

  def volume(r: Double):Double={
      return 4/3 * Math.PI * r * r * r;
  }

  def total(book_count:Int):Double={
    if(book_count>50){
      return (24.95-24.95*40/100)*book_count + 3 + 0.75*(book_count-50);
    }else{
      return (24.95-24.95*40/100) * book_count +3;
    }
  } 



  def total_run_time(epr1:Double,tpr:Double,epr2:Double):Double={
      return epr1*8 + tpr*7 + epr2*8;
  }

  def main(args: Array[String]): Unit = {
      val res=8;
      println(s"area is : ${area(res)}");
      val f = 30;
      println(s"${fahrenhite(f)}");
      val r = 5;
      println(s"${volume(r)}");
      val t=10
      println(s"${total(t)}");
      val ep1 = 2
      val ep2 = 3
      val ep3 = 2
      println(s"${total_run_time(ep1,ep2,ep3)}")
  }
}
