import java.util.*
import java.util.LinkedList

class Kotlin_5_TakingInputFronUsert {
    //Every language has unique way to take input from user in this file we creating some small project by
    // taking input from user by the readLine() function
    //we can also take help of scanner class
    fun buyGroceries(){
        var groceries= HashMap<String,Int>()
        groceries.put("rice",99)
        groceries.put("tea",179)
        groceries.put("coffee",299)
        for (i in groceries)
            println(i)
        var li=LinkedList<String>()
        var d :Int=0
        println("Select groceries to buy and Enter done ")
        //readLine function is used to take input from user
        var done:String= readLine().toString()
        d +=groceries.getValue(done)
        li.add(done)
        while (done != "done"){
            println("Select groceries to buy and Enter done ")
            var done:String= readLine().toString()
            if (done =="done")
                break
            d +=groceries.getValue(done)
            li.add(done)

        }
        println("you bought ->")
        for (i in li)
            print("$i  ")
        println("your total bill is $d INR")
    }
}