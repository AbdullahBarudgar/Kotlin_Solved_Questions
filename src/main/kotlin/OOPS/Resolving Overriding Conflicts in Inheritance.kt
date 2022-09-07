package OOPS

interface One{

    fun myName()
    fun sayHello(){
    println("Hello, From interface one ")
    }
}

interface Two{

    fun myName(){
    println("My name is interface two")
    }
    fun sayHello(){
        println("Hello, From interface two ")
    }
}

class Three :One {

    override fun myName() {
        println("My name is class three")
    }
}

class Four :One,Two{
    override fun myName() {
     super.myName()
     println("My name is class three")
    }

    override fun sayHello() {
        super<One>.sayHello()
        super<Two>.sayHello()
        println("Hello,from class four")
    }


}

fun main(args : Array<String>){

val three=Three()
val four=Four()

three.myName()
four.myName()
four.sayHello()
}