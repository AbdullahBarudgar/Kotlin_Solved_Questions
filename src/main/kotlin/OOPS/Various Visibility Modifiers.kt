package OOPS

// Class, by default public visibility
// Mark with 'open' to make inheritable
open class MyOuter{
    private var myname="Abdullah Barudgar !!"
    protected open val age=20
    internal var salary=10000

    var city="Delhi"  // Public , by default

    protected fun fun1(){
        println("Protected Function in Base !!")
    }
}

class MySub: MyOuter() {
    // Override protected members,
    // because protected is visible in subclass
    override val age: Int
        get() = 50

    fun printDetails(){
        // Can't Access $myname as it is private in super class
        // println("Name :  $myname")

        println("City :  $city")
        println("Salary : $salary")
        println("Age : $age")
        fun1()
    }
}

// Main function, Entry Point of Program
fun main(){
    // Create Instance
    val myOuter = MySub()
    // Call subclass method
    myOuter.printDetails()
}