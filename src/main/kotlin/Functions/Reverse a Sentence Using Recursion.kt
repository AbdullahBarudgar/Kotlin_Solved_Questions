package Functions

fun reverse(value : String) : String{
if(value.isEmpty())
    return value

else
    return reverse(value.substring(1)) + value[0]
}

fun main(args : Array<String>){

var  ans=reverse("Kotlin is a good language ")
println("$ans")
}