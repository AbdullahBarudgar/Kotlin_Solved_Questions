package Anonymous_Functions

val reverse = {a : String ->
    var b : String =""
    for(i in a.length-1 downTo 0) {
         b+= a[i]
    }
    print(b)
}

fun main(){

var c=reverse("My name is abdullah barudgar")
println("$c")
}