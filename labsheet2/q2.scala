object Variables_2{
    def main(args: Array[String]): Unit = {
        var a=2;
        var b=3;
        var c=4;
        var d=5;
        var k=4.3f;

        //a) println( - -b * a + c *d - -);
        b=b-1;
        println(s"--b * a + c *d-- = ${b*a+c*d}");
        d=d-1;

        //b) println(a++);
        println(s"a++ = ${a}");
        a=a+1;

        //c) println( –2 * ( g – k ) +c); there is not "g" so i change it to a
        println(s"-2 * ( a - k ) +c = ${-2 * (a - k) + c}");

        //d) println (c=c++);
        println (s"c=c++ : ${c}");
        c=c+1;

        //e) println (c=++c*a++);
        c=c+1;
       
        println (s"c=++c*a++ : ${c*a}");
        a=a+1;

        
    }
}