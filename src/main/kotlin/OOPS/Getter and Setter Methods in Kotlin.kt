package OOPS

class America{

var city : String ="Newyork"
}

class India{

var city : String ="Delhi"

    get() = field
    set(value){
    field=value
    }
}

class China{

var city : String ="China"
private set

fun setCity(city : String){
this.city=city
}
}

class Japan{

var city : String ="Tokyo"

get()=field.toUpperCase()

 set(value){
 field="Modern City : $value"
 }
}

fun main(args : Array<String>){

val america=America()
america.city="Alaska"
println("America : ${america.city}")

val india=India()
india.city="Mumbai"
println("India : ${india.city}")
        
val china=China()
china.setCity("Beijing")
println("China : ${china.city} ")

    val japan=Japan()
    india.city="Quoto" // access setter
    println("Japan : ${india.city}")
}