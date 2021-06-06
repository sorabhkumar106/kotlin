class Kotlin_17_String {
    /*
    *String data type is very important data type used for taxt writing ,text edditing etc.
     */
fun stringProperties(){
    val str="sorabh kumar"
    //String length
    println(str.length)
    //return the range of valid character indices
    println(str.indices)
    //return the index of last character
    println(str.lastIndex)

}
fun stringFunctions(){
 val str2="Faster Digital services"
    val str3="Faster Digital services"
 val str4="Faster AI and Analytics"
    println("comparing two string :")
    //compareTo() function is used to compare two strings
    println(str4.compareTo(str2))
    //get() function returns the character at given index of string
    println("Getting character at given index :")
    println(str4.get(4))
    //plus() function is used to concatenate string
    println("concatenating string :")
    println(str2.plus(" "+str4))
    //subsequence function is used to return subsequence of given string
    println("taking subsequence of $str2")
    var subseq=str2.subSequence(1,9)
    println(subseq)
    //contains() checks weither a particular  string subsequence contains or not
    println("checking weither string contains subsequence")
    println(subseq.contains("aster"))
    //count function is used to count words in a string
    println("checking number of words in string ")
    println(subseq.count())
    //drop() function is used to return string after n number dropping
    println("returning string after n character dropped")
    var droppedString=str2.drop(12)
println(droppedString)
    // dropLast() function is used to drop character at the end of string
    var dropLast=str2.dropLast(9)
    println("dropping character at the end of String")
    println(dropLast)
    //elementAt() function returns character at given index
    println("printing element at given point :")
println(str2.elementAt(9))
    //indexOf() function is used to return index of first ocurrance of given character
    println("printing index first occurance of given character")
    println(str2.indexOf('t'))

}
}