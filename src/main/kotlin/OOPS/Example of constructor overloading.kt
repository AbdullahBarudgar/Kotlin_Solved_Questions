package OOPS

class Constructors(length : Int){

    init{println("This is the primary constructor init block  $length")}

    constructor() :this(10) {
        println("Secondary Constructor with no parameter ")
    }

    constructor(name : String):this(name.length){
        println("Secondary Constructor with one parameter  : $name")
    }

    constructor(names : String , leng : Int) : this(){
        println("Secondary Constructor with two parameter  : [$names ,$leng]")

    }
}

fun main(args : Array<String>){

Constructors(1000)
    Constructors()
    Constructors("Abdullah")
    Constructors("Barudgar",60)

}