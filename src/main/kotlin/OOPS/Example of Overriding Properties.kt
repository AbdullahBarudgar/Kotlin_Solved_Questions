package OOPS

// Declare Base class , marked with 'open'
// to make inheritable
open class ABC{
    // marked property with 'open'
    // to make overridable
    open val a=10

    init {
        println("Init Block : Base Class")
        println("Value : $a")
    }
}

// Derived class extends Base class
open class XYZ: ABC() {
    // Override base class property
    override var a=15
    init {
        println("Init Block : Child Class 1")
    }
}


// Derived class with primary constructor
// Override base class property as
// parameter in primary constructor
class PQR(override var a:Int): XYZ() {
    init {
        println("Init Block : Child Class 2")
        println("Value : $a")

        // Access Super class value of
        // property using super keyword
        println("Super class value : ${super.a}")
    }
}

// Main function, Entry Point of program
fun main(args: Array<String>){
    // Create Instance of PQR class
    val abc:ABC = PQR(20)
}