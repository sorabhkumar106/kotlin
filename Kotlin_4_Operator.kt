class Kotlin_4_Operator {
    /*
    *operator is special type of character which are used to perform mathematical operations on operands
    * here operand means variable or any Number data type variable
     */
    fun arithmeticalOperator(){
        // arithmetical operator is used to perform arithmetical operator on operands
        // Addition operator
        var subscription :Int =200
        var order :Int =300
        var totalBill : Int =subscription + order
        println("you are expending $totalBill INR")

        // Subtraction operator
        var  totalShoping :Int =1999
        var coupon :Int =199
        var totalShopingExpenditure =totalShoping - coupon
        println("you got $coupon INR coupon you shopped $totalShoping INR and you pay only $totalShopingExpenditure INR")

        // Multiplication Operator (*)
        var smartphonePrice :Int =40000
        var smartPhoneUnit : Int =10
        var bill :Int = smartPhoneUnit*smartphonePrice
        println("you bought $smartPhoneUnit unit at the price $smartphonePrice INR you pay $bill INR")

        //Division operator(/)
        var burgerpeice :Float=4f
        var totalPerson :Float =5f
        var eachPerson :Float = (burgerpeice/totalPerson).toFloat()
        println("each person got $eachPerson piece of burger")

        // Modular Operator(%)
        var totalBurger :Int =20
        var persons : Int =7
        var leftBurger  =totalBurger % persons
        println("there are $leftBurger burger left ")
    }
    fun relationalOperator(){
        // relational operator is used to find some relation between operands
          //equal to equal operator(==)
        var comp1:String = "Amozon"
        var comp2:String = "Alphabet"
        var result1=comp1==comp2
        println(" Is $comp1 and $comp2 equal :$result1")

        //less-then operator (<)
        var oyo : Float =10f
        var Byjus : Float =16.5f
        var result2=oyo < Byjus
        println("is oyo valuation less then byjus :$result2")

        //greater-then (>)
        var result3=Byjus>oyo
        println("is byjus valuation greater then oyo valuation : $result3")
        oyo=16.5f

        //greter-then equal to(>=)
 var result4=Byjus>=oyo
        println(" is byju's valaution greter then equal to oyo :$result4")
         //less=then equal to (<=) works as >=

    }
    fun assignmentOperator(){
        //Assignment operator is used to assign values
        // equal to operator(=)
        var relinceMCap=200
        println("reliance market cap is $relinceMCap")

        //plus equal to (+=)
        relinceMCap +=10
        println("reliance maeket cap is now $relinceMCap billion doller")

        //minus equal to (-=)
        relinceMCap-=20
        println("reliance market cap decrease to $relinceMCap billion doller")

        //multiply equal to (*=)
        var sbiMCap :Int =50
        relinceMCap =4
        relinceMCap *=sbiMCap
        println("reliance market cap is 4 times of sbi bank market cap to $relinceMCap billion doller")

        // division equal to (/=)
        var infosysMCap :Float =75f
        infosysMCap/=1.15f
        println("infosys market cap dropped by 15% to $infosysMCap billion doller")

        //modular equal to (%=) operator


    }
    fun  unaryOperator(){
        // unary operator perform operations on single operator
        // increment operator (++)
        var num :Int =20
        num++
        println("the value of num is $num")
        //pre increment
        println(++num)
        //post increment
        println(num++)

        println("the value of num is $num")
        //pre-decrement
        println(--num)

        //post-decrement
        println(num--)
        println("the value of num is $num")
        // not(!) operator
var youAreMrried=true
        println(" you are married " +!youAreMrried)

    }
    fun logicalOperator(){
        var married=true
        var educated=false
        // logical AND operator (&&)
        println(married && educated)

        //logical or operator (||)
        println(married || educated)

        //logical not operator(!)
        println(!married)
    }
}