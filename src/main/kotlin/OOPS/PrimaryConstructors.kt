package OOPS

class Dog(private var name : String="Shakib") {

    fun dog(): String? {
        return name
    }
}
    class Horse(private var name : String="RahulDoot"){

        fun horse():String?{
            return name
        }

}

class Cat(private var name : String="Nayyum" ,private var age :Int =3){

    fun cat(){
        println("[$name,$age]")
    }

}

fun main(args : Array<String>){

val dogg=Dog()
val horsee=Horse()
val cate=Cat()

println("${dogg.dog()}")
println("${horsee.horse()}")
cate.cat()

}