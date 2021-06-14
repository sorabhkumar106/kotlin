/*
* setter and getter is very important functions in kotlin
* setter function is used to set value and getter function is used to return value
* if you don't define setter and getter function then setter and getter function automatically called
 */
class Kotlin_32_SetterAndGetter(val company : String) {
    var name="sorabh kumar"
    set(value){
        field=value
        println("this set function")
    }
    get() {
println("this get function")
        return field
    }
    var companyName="faster corp"


    set(value){
        println("this will set company name")
        field = value
    }
        get() {
            println("this will return get function value")
            return field
        }
    }