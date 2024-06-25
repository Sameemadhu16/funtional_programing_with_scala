
def noOfAttendees(t_price: Double): Double={
        120 + (15 - t_price) * 20/5
    }
def show_cost(t_price: Double):Double={
    var noOfshow= (noOfAttendees(t_price)/120)
    if(noOfshow <= 1){
        noOfshow=1
    }else{
        noOfshow=2
    }
    
       noOfshow*500+noOfAttendees(t_price)*3 
    }
def income(t_price:Double):Double={
    noOfAttendees(t_price)*t_price
}
def profit(t_price:Double):Double={
    income(t_price)-show_cost(t_price)
}

object question04{
    def main(args: Array[String]): Unit ={
        
        println(profit(5));
        println(profit(10));
        println(profit(15));
        println(profit(20));
        println(profit(25));
        println(profit(30));

    }
}
