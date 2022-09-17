package Anonymous_Functions

val factorial  = {a: Long ->
    var b : Long =1
    for(i in a downTo 1) b *= i
    println(b)
}

fun main(){

factorial(20)
}