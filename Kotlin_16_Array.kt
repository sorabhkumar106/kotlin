class Kotlin_16_Array {
    /*
    * Array is used to store collection of similar type data
    * there are to ways to define array ->
    * by using arrayOf<data type>()
    * by using datatypearrayOf() function
    * array may be string type,char type or any other type
    * below write some array function
    * arrayOf<int>()
    * arrayOf<String>()
    * arrayOf<char>()
    * arrayOf<float>()
     */
    fun defineArray(){
     //Integer array
        var intarr= intArrayOf(1,75,98,7,65,6)
        for (i in intarr)
            print( "$i ")
        //character array
        var chararr = charArrayOf('g','v','j','f')
        for (i in chararr)
            print("$i ")
        // string array
        var strArr=arrayOf<String>("faster AI &Analytics","faster Digital services","faster finacial services")
        for (i in strArr)
            print("$i ")

    }
}