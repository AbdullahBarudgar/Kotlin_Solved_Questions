package OOPS

//declare Top Level compile time constant
const val PI=3.14

//Declare Class with object to make singleton
object Physics{
    //declare compile time constant
    const val GRAVITY=10
}

//declare class
class Greetings{
    //declare companion object
    companion object{
        //declare compile time constant
        const val GREET="Hello Abdullah Barudgar"
    }
}

//Main Function, Entry Point of Program
fun main(){
    //Print All Constant Value
    println("PI Value : $PI")
    println("Gravity  : ${Physics.GRAVITY}")
    println("Greetings: ${Greetings.GREET}")
}