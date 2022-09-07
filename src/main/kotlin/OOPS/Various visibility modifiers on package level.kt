package OOPS

// Public by default, visible to everywhere
fun fun1(){
    // local variable can not have visibility
    var a=5
    println("Inside Fun1 $a")
}

// private , visible inside Containing file
// VisibilityModifiersInsidePackages.kt
private fun fun2(){
    println("Inside Fun2")
}

// internal , visible inside same module
internal fun fun3(){
    println("Inside Fun3")
}

// public by default visible everywhere
var name="Abdullah Barudgar"

// by default public, visible every where
class MyClass

// Main function, Entry point of program
fun main(){
    // call function
    fun1()

    // call function
    fun2()

    // call function
    fun3()

    //Access variable
    println("Name : $name")
}