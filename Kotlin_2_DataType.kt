class Kotlin_2_DataType {
    /*
    * data type is used to define the size and data associated with variable
    * there are mainly six type of data type in kotlin
    * 1.Number
    * 2.Character
    * 3.Boolean
    * 4.Array
    * 5. String
    * user defined data type(classes)
     */
    fun dataType() {
        //----------------------------1. Number data types--------------------------
        //Byte data type
        var num1: Byte = 23
        println(num1)

        //Short data type
        var num2: Short = 757
        println(num2)

        //Int Data type
        var num3: Int = 47677857
        println(num3)

        // Long data  type
        var num4: Long = 7476676556546546
        println(num4)

        // Float Data Type
        var num5: Float = 74764.489f
        println(num5)
        //------------------- 2.Character data type------------------------
        //char data type
        var ch : Char='a'
        println(ch)

        //-------------------- 3.boolean data type-------------------------
        var isMarried : Boolean = false
        println("you are married $isMarried")

        //-------------------- 4.array ------------------------------------
        /*
        * array is collection of similar type data type variables
        */
        //string array
        var myarr =arrayOf<String>("Faster Ai & ml","faster Digital Service","Faster Finacial Services","Faster Investment and holding")
        for (i in myarr)
            print(" $i ")
        println()

        //Int array
        var myarr2 :IntArray=intArrayOf(1,3,98,8,56,86,8)
        for (i in myarr2)
            print(i)
        println()

        // Float Array
        var myarr3=arrayOf<Float>(5.6f,9867.86f,87.6f,98.78f)
        for (i in myarr3)
            print("$i ")
    }
    }
