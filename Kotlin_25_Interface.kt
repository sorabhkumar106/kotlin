/*
* like in java we have also the concept of interface in kotlin.
* Interface defined by interface keyword.interface act like a abstract class .
* interface have abstract as well as non-abstract methods
 */

//interface
interface Auto{
    fun autoCompany()
    fun vehicleType()
    fun show(){
        println("this auto interface show function")
    }
}
interface vehicle{
    // abstract methods
    fun braking()
    fun speedUp()
    fun show(){
        println("this vehicle interface show function")
    }
}
class TataMotors :Auto,vehicle{
 override fun autoCompany(){
        println("tata motors is an auto company")
    }
   override fun  vehicleType(){
        println("tata motors make passenger and commercial vehicle")
    }

    override fun braking() {
        println("Braking.......................")
    }

    override fun speedUp() {
        println("Speed Up.......................")
    }

    override fun show() {
        super<Auto>.show()
    }

}
class Kotlin_25_Interface {
}