class kotlin_1_Variables {
    /*
    * variables  identifier which refer memory location address where variable data stored
    * there are two type of variable in kotlin
    * 1. var variables and 2.val variables
    * var variable will be reassigned but val variable can't reassigned
     */
    fun Variable() {
        var language="kotlin"
        println("we are learning $language")
        // var variable can be reassigned
        language=" javaScript"
        println("now we are learning $language")

        // val variable
        val db="MySql"
        println("we are using $db database")
        // this will through error
       //val ="Mongodb"
    }
}