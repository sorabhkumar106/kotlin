class Kotlin_21_NestedAndInnerClass {
    /*
    * when any class defined inside a class we call them nested class
    * inner class defined by writing inner keyword before nested class .
    * by the help of nested class we can't access outer class references so we write inner keyword before nested class
     */
    var company : String = "Faster International"
    class Faster{
        fun FasterDigitalServices() :String{
            return "Faster Digital services own  many internet compnies "
        }
        fun FasterFinacialServices() :String{
            return "Faster finacial services is a fintech gaint"
        }
        fun show(){
            //this line will throw error
            //println(Kotlin_21_NestedAndInnerClass.company)
        }
    }
    //inner class
   inner class FasterCompanies{
        fun FasterSaasProducts(){
            println("Faster saas products provides saas tools for enterprises and consumer")
        }
       fun showCompany() :String{
           //accessing outer class variable
           return company
       }
    }
}