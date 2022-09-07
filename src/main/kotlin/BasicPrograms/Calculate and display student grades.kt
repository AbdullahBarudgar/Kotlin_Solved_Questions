package BasicPrograms

fun main(args : Array<String>){

var percentage =readLine()!!.toFloat()
var grade : String

println(when(percentage){
in 91.0..100.0 -> "A"
in 81.0..90.0 -> "B"
in 71.0..80.0 -> "C"
in 61.0..70.0 -> "D"
in 51.0..60.0 -> "E"
in 41.0..50.0 -> "F"
in 33.0..40.0 -> "G"
else -> "Fail"

}
)

}