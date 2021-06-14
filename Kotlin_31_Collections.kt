import kotlin.collections.Set
/*
* collections is used to store group of related objects in a single unit.
* By using collection ,we can store ,retrieve ,manipulate and aggregate data.
* collections contains -> list , map and set
* list store similar and ordered objects
* map store object by key value pair
* set don't store duplicate objects and it is also not contain oder
* there are two types of collection
* immutable collections -> read only
* mutable collection -> read and write both
 */
class Kotlin_31_Collections {
    //----------------------------------- immutable collections -------------------------------------------
    var li = listOf<String>(
        "faster AI & ML",
        "faster finacial services",
        "faster digital Services",
        "faster saas products",
        "faster investment and holding"
    )
    var map = mapOf<Int, String>(
        1 to "faster AI & ML ",
        2 to "faster finacial services",
        4 to "faster Digital Services",
        5 to "faster saas products"
    )

    fun showImuList() {
        for (i in li)
            print("$i  ->  ")
    }

    fun showImuMap() {
        var it = map.iterator()
        for (i in it)
            println("${i.key} -> ${i.value} ")
    }

    var s = setOf(2, 9, 9, 8, 0, 5, 3, 7, 6, 1, 5)
    fun showImuSet() {
        for (i in s)
            print("$i  ")
    }

    //------------------------------------- mutable collection --------------------------------------
    //mutable list
    var arrli = ArrayList<String>()
    var arrli2 = arrayListOf<String>("Byju's", "paytm", "oyo", "swiggy", "zomato")
    var arrli3 = mutableListOf<String>("maruti suzuki", "hundayi", "mahindra auto ", "tata motors", "kia", "honda")
    fun arrList() {
        arrli.add("tcs")
        arrli.add("infosys")
        arrli.add("wipro")
        arrli.add("hcl")
        arrli.add("tech mahindra")
        arrli.add("mindtree")
        println("first arraylist")
        for (i in arrli)
            println(i)
        println()
        println("Second Arraylist :")
        for (i in arrli2)
            println(i)
        println()

        for (i in arrli3)
            println(i)
        println()
    }
        //mutable hashmap
        var muhash= mutableMapOf<String,String>("auto" to "Eicher motor","nbfc" to "bajaj finace","it" to "TCS","bank" to "hdfc")

        //second hashmap
        var hash2 = hashMapOf<String, String>("tata" to "tata Digital", "relinace" to "Jioplatform", "bajaj" to "bajaja finace")

        fun printHashMap() {
            var it = muhash.iterator()
            println("first hashmap ")
            for (i in it)
                println("${i.key} -> ${i.value} ")
            println()

println("second hashmap ")
            var itr=hash2.iterator()
            for (i in itr)
                println("${i.key} -> ${i.value}")
        }

    // mutable set
    var hashset= hashSetOf<String>("tata Digital","tata chemical","tata cliq","tata motors","tata consultancy services","tata titan","tata power","tata stell")
    fun printSet(){
        println("printing mutable set")
        for (i in hashset)
            println("$i ")
    }
    }

