package OOPS

//Declare class
class Car{
    //class init block
    init {
        println("Init Block of Class")
    }
    //Make companion object
    companion object {
        //companion object init block
        init {
            println("Init Block of Companion object")
        }
        //property of companion object
        val name="Tata Nano!! "

        //function in companion object
        fun printName(){
            println("Your Car name : $name")
        }
    }
}

//Main Function, Entry Point of Program
fun main(){
    //Call method with Class name,
    //without create Instance of class,
    //like static method in java
    Car.printName()

    //access Property using class name
    val nameLen = Car.name.length

    println("Car Name Length : $nameLen")
}