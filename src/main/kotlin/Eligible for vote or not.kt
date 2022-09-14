package Anonymous_Functions

val eligible = { a : Int ->
when(a){
    in 18..100 -> "Eligible for vote"
 else -> "Not eligible for vote"
}
}
fun main(){
val str : String = eligible(35)
println(str)
}