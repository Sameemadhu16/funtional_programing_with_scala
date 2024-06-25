object Company {
    def normal(normal_h: Double): Double = {
        250 * normal_h;
    }

    def OT(ot_h: Double): Double = {
        85 * ot_h;
    }

    def tax(income: Double): Double = {
        12/100 * income
    }

    def main(args: Array[String]): Unit = {
        val normal_h = 40.0
        val ot_h= 30.0

        val income = normal(normal_h) + OT(ot_h)
        val finalSalary = income - tax(income)
        println(s"The final salary is Rs.${finalSalary}")
    }
}