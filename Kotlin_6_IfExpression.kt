

class Kotlin_6_IfExpression {
    /*
    *if expression is used make decision on the behalf of certain condition
    * if - expression are three types
    * 1. if - expression
    * 2. if-else ladder expression
    * 3. nested if - else expression
     */
//    if - Expression example
    fun isAdult() : String{
        println("Enter your age :")
        var adult :Int = readLine()!!.toInt()
        var result :String=""
        result=if (adult>=18)
            "your are adult "
        else
            "you are teenager"
        return result
    }
   //ladder if - else Expression Example
    fun  whichDeveloper() : String{
        println("what type of development you do ?")
       var devloper : String= readLine().toString()
       var result=if(devloper=="web developrt")
           "you are web developer"
       else if(devloper == "Android development")
           "you are android developer"
       else if(devloper == "web designing")
           "you are web designer"
       else
           "sorry we can't fetch data"
       return result
    }
    //nested if-else Example
    fun buyJioSim(){
        println("------------------Buy jio sim-------------------------")
        println("Enter your age ")
        val age : Int = readLine()!!.toInt()
        println("you have adhar card enter yes or no ->")
        val adhar :String= readLine().toString()
        if (age >=18){
            if (adhar =="yes"){
                println("Authenticating.............................")
                println("Enter you otp ")
                var otp :Int = readLine()!!.toInt()
                if (otp == 12345){
                    println("Aunthentication successfull ")
                    println("you sim on between 24 hour")
                }else
                    print("authentication unsuccessfull")
            }else
                print("sorry you have not adhar card")
        }else
            print("Sorry your age less then 18 years")
    }
}