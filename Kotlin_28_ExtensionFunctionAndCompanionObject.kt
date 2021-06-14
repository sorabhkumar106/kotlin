/*
* Extension function is used to extend the functionalities of any class.
* when we write class and his functions so if we want to write new function of that class but not inside
* the class body then we use extension function
* companion object is used to call function using class name
 */
class Kotlin_28_ExtensionFunctionAndCompanionObject {

    //companion object
    companion object {
fun printSomthing(str :String){
    println(str)
}
    }
    fun show(){
        println("this Kotlin_28_ExtensionFunctionAndCompanionObject  class function")
    }
}

//extension function
fun Kotlin_28_ExtensionFunctionAndCompanionObject.write(){
    println("this extension function ")
}
fun Kotlin_28_ExtensionFunctionAndCompanionObject.Companion.showComp(){
    println("company name is faster corp")
}