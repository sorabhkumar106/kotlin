class Kotlin_23_Inheritance {
    /*
    * Inheritance is very important concept in object oriented programming .
    * Inheritance is used to use existing code of any class which we inherit in our class it makes reuseblity
    * of existing code so we don't need to write that functionalities from scratch .
    * in inheritance we have two classes one from we inherited in our class it is also called parent class or
    * super class. second class which we inherit our class it is also called sub class or child class .
    * child class can use all the functions and variables of parent class
    * we can also define same function and variable name in child class this called overriding
     */

}
open class Tata{
    open var companyName: String="Tata group"
    open fun show(){
        println("$companyName is 200 years old indian conglomerate ")
    }
}
//Inheritance in kotlin
class TataDigital :Tata(){
    override var companyName: String="Tata Digital"

//overriding method
    override fun show() {
        println("$companyName is an subsidiary of ${super.companyName}")
    }
}