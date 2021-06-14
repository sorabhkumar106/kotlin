/*
* generic is very important feature in kotlin is used to define class, methods , variables etc.
* the generic type class or method is declared as parameterized type.
* a parameterized type is an instance of generic type with actual type arguments .
* the parameterized type are declared using <> bracket .
* there are mainly three advantages of generic
* type safety
* type casting is not required
* compile time checking
 */
class Kotlin_29_Generics<T,E,C>(age :T) {
  var  age : T =age

    init {
        println("age  of person is $age")
    }
    fun show(name:E){
        println("the name of person is $name")
    }
    fun showCompany(company : C){
        println("company name is $company")
    }

}