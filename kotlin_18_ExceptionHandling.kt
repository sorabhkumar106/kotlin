import java.lang.Exception
class kotlin_18_ExceptionHandling {
/*
*Exception handling is very important concept of any programming language
* Exception handling is used to stop unexpected program termination
* in kotlin we use try-catch block for exception handling
* which piece of code probability to throw exception we write that code inside try block and write code that run if
* any exception throws inside catch block we also write finally block that execute whether exception throws or not
 */
    fun handleException(){
val num=10
        try {
            var c=num/0
        }catch (e :Exception){
            println(e.message)
        }
   finally {
       print("Exception is handled")
   }
    }
}