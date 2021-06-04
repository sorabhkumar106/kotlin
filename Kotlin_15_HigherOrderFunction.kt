class Kotlin_15_HigherOrderFunction {
    /*
    *higher order function can take function as argument and return function and also do both
     */
    fun add(a :Int, b :Int) :Int{
        return a+b
    }
    //higher order function
    fun addition(a :Int, b :Int, fn:(Int,Int)->Int){
      val c= fn(a,b)
        println("Addition of $a and $b is $c")
    }
    //higher order function

    fun show(str:String, fn:(String)->Unit){
        fn(str)
    }
}