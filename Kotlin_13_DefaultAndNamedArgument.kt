class Kotlin_13_DefaultAndNamedArgument {
    /*
    *default argument are used to give default values to the argument  in a situation like if you don't want to pass
    * any value for one or more argument so default value pass as argument and normally done all operation just like
    * passing values
    * Named argument are used to pass parameter for argument if you want to pass argument not any order then you specify
    * specify values by named argument
     */
    // default argument example
    fun corprate(company :String = "Tata Digital", subsidiary :String="Tata bigbasket" ){
        println("$company own $subsidiary")
    }
    //Named Argument
    fun namedArgument(){
        //Named Argument
        corprate(subsidiary = "Hdfc bank",company = "Hdfc")
    }
}