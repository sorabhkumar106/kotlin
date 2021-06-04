class Kotlin_12_Function {
    /*
    * function is piece of code that used to  do specific work in our program
    * like if we want to print 1 to 100 number and we need this many times in program so this not good practice to
   * write it many times so what we do we write a function for this and call them when we need to write 1 to write 1 to
   * 100 number.
   * there are two types of function
   * 1.pre-defined function
   * 2.user defined function
   * pre-defined function is are pre-defined and we don't need to write them from scratch like print() ,downTo() , until
   * etc.
   * use-defined function are defined defined by user. this type of function we need to write them from scratch
   *
     */
    //user defined function
        fun add(a : Int , b : Int) :Int{
            var c=a+b
        return c
        }
    fun printSomthing(str :String){
        println(str)
    }
}