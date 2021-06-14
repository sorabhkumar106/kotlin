/*
* range is used to give a range and iterate between that range
* range declared using .. operator
* downTo range function is used to iterate on a range in decrease order
* until range is used to exclude last element
 */
class Kotlin_30_Ranges {
    //defining range
    var ran=1 ..6

    //downTo range
    var ran2=6 downTo 1

    //until range
    var ran3=1 until 6

    //printing range
    fun show(){
        //printing simple range
        println("simple range :")
        for( i in ran)
            println()

        //printing downTo range
        for(i in ran2)
            print(i)
        println()

        //printing until range
        println("until range :")
        for (i in ran3)
            print(i)
        println()

        //kotlin range of character
        var ch='a'..'z'
        println("character range :")
        for(i in ch)
            print(i+" ")
println()

//step in range
     var ran4=1..10
        for (i in ran4 step 2)
            print("$i  ")
println()
    //iterator in range
        var ran5=1..10
        var it=ran5.iterator()
        println("iterator range :")
        while (it.hasNext())
            print("${it.next()}   ")
    }

}