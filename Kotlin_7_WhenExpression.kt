class Kotlin_7_WhenExpression {
    /*
    *when expression is replacement of switch condition in kotlin
    * any other programming language like java c++ used switch statement
    * to doing when expression work
    * when expression is used to take decision on the value of variable
     */
    fun findDay(){
        println("enter number to find day")
        var num :Int = readLine()!!.toInt()
        when(num){
            1 -> println("Monday ")
            2 -> println("tuesday")
            3 -> println("wednesday")
            4 -> println("thursday")
            5 -> println("friday")
            6 -> println("saturday")
            7 -> println("Sunday")
            else -> println("invalid number")
        }
    }
}