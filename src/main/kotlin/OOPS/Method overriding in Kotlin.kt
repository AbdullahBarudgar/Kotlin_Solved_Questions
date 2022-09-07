package OOPS

open class Person{

open fun  printMessage(){
println("Message for Person")
}

}

class Child :Person() {
    override fun printMessage() {
        println("Message for Child")
    }
}

open class Boy : Person(){

    final override fun printMessage() {
        println("Message for Boy")

    }
}

class Hero :Boy(){
   fun print(){
    super.printMessage()
    println("HelloWorld")
   }
}

fun main(args : Array<String>){

    Person().printMessage()

    //Create class Instance and Called Methods,
    //it will invoke Child class version of  methods
    Child().printMessage()

    //Create class Instance and Called Methods
    Hero().print()
}