//Area of a disk with radius r is Pi r*r. What is the area of a disk with radius 5?

def area(r:Double):Double = {
    math.Pi * r * r;
    
}

//The temperature is 35C; convert this temperature into Fahrenheit. ºF =ºC * 1.8000 + 32.00

def fahrenhite(celcius:Double):Double={
    celcius * 1.8000 + 32.00;
}

//The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

def volume(r:Double):Double={
    4/3 * math.Pi * r * r * r;
}

/* Suppose the cover price of a book is Rs. 24.95, but bookstores get
a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75
cents for each additional copy. What is the total wholesale cost for 60
copies?
*/

def total(book_count:Int):Double={
   if(book_count>50){
     (24.95-24.95*40/100)*book_count + 3 + 0.75*(book_count-50);
   }else{
     (24.95-24.95*40/100) * book_count +3;
   }
} 

// I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7
// min per km) and 2 km at easy pace again to reach home. What is the
// total running time?

def total_run_time(epr1:Double,tpr:Double,epr2:Double)={
    epr1*8 + tpr*7 + epr2*8;
}