/*
* abstract class defined using abstract keyword before the class name
* abstract class can't be instanced they always inherit by other classes.
* abstract class contains abstract method .
*  In abstract class we define abstract functions without function body and define their body in sub class or child class.
*if we not defined every abstract  function body of super class  in child class then we must define super class
* as abstract class.
* abstract class can also contains non-abstract functions.
 */

//abstract class
abstract class Company(var comp:String){
    init {
        println("Company name is $comp")
    }
    fun showSomthing(){
        println("this non - abstract function")
    }
    abstract fun companyName(comp:String)
    abstract fun subsidiaryName(sub : String)
}
 class Kotlin_24_AbstractClass(comp :String ,var subsidiary :String) :Company(comp){
 override fun companyName( comp: String){
    println("$comp is a tech company")
}

     override fun subsidiaryName(sub: String) {
         println("$comp own $sub")
              }
}