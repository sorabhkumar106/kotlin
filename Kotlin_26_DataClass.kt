class Kotlin_26_DataClass {
    /*
    * in kotlin we have concept of data class.data class is used to hold data,state of object .
    * data class define using data keyword before any class.
    * data class automatically genrate some usefull function like toString(),copy(), equals(), hashcode(), componentN()
    * etc.
     */
    data class Compan(var companyName: String, var subsidiary : String, var industry :String)
}