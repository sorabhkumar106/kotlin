class Kotlin_22_Constructor {
    /*
    * constructor is like a function that are used initialize and execute codding expressions
    * there are two types of constructor in kotlin
    * primary constructor
    * secondary constructor
    * primary constructor implemented using init block
    * secondary constructor implemented by constructor() block
    * constructor call done automatically when we create object of class
     */
    //primary constructor
//    init {
//        println("company name is ${companyName}")
//    }
    var parentCompany :String=""
    var subsidiary :String=""
    var industry :String =""

    //secondary constructor
    constructor(parentCompany:String , subsidiary :String){
print("${subsidiary} owned by ${parentCompany} .${subsidiary}")
    }
    constructor(parentCompany:String , subsidiary :String , industry :String) :this(parentCompany,subsidiary){
       println("worked in ${industry}")
    }
    fun show(){
        println("${subsidiary} is owned by ${parentCompany}")
    }
}