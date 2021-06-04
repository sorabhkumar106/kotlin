class Kotlin_8_ForLoop {
    /*
    *loops are very important when it comes to any programming language
    * loops are used to iterate piece of code until specified condition not true
    * for loop are used when we know that how many times loop will iterate or iterate on list,set,map and array
     */
    fun forloopEx(){
        var li=java.util.LinkedList<String>()
        li.push("tcs")
        li.push("tata elxsi")
        li.push("tata bigbasket")
        li.push("tata 1mg")
        li.push("tata cult.fit")
        li.push("tata digital")
        // for loop example to iterate on list
        for(i in li)
            print("$i -> ")
        println()

        // for loop example to iterate on range
        var num2=10 downTo 0
        for (i in num2)
            print("$i -> ")
println()
        // for loop example iterate on array
        var arr=arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)
        for (i in arr)
            print("$i ")
    }
}