class Kotlin_11_continuestatement {
    /*
    *continue statement is used to execute above code to but not execute code below from continue statement
    * continue statement work as break statement
     */
    // continue statement
    fun continueStatement(){
        println("------------------------continue statement---------------------------")
        for (i in 1..10){
            if (i in 4..6)
                continue
            println("$i ")

        }


    }

}