class Kotlin_10_breakStatement {
    /*
    *break statement is used to exit external loop
    * we use conditional statement inside any loop and use break keyword with conditional statement .
    * when condition get true we exit the loop
     */
    fun breakStatement(){
        var li=java.util.LinkedList<String>()
        println("Enter your favorite company name or Enter exit :")
        var company = readLine().toString()
        li.push(company)
        while(true){
            println("Enter your favorite company name or Enter exit :")
            var company = readLine().toString()
            if (company== "exit")break
            li.push(company)
        }
        println("Your favorite compnies")
        for (i in li)
            println("$i")

        //labled break Statement
        for (i in 1..4){
           at@ for (j in 1..5){
               if (j==4)
                 break@at
               print("$j ")
            }
            println("-----------------------------------")
        }
    }
}