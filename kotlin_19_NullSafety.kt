class kotlin_19_NullSafety {
    /*
    * null safety is a procedure which we eliminate the risk of null reference from the code.
    * kotlin throws NullPointerException immediately if it found any null argument is passed without executing any other
    *  statements.
    * kotlin have two type of argument nullable or non -nullable variables
    * nullable variable can hold null but non-nullable variables can't hold null
    * nullable variable defined by as:String?
    *
     */
    fun nullSafety(){
        //non-nullable String
       var str="faster corp"
        //this line will throw error
        //str=null
        println(str)
        //nullable string
        var str2:String?="faster anlytics"
        println(str2)
        str2=null
        println(str2)
    }
}