package BasicPrograms

fun main(args : Array<String>){
var multiple= 1
val input = readLine()!!.toInt()

for(i in input downTo 1){
   multiple *=i
}
println("Factorial of given number is : $multiple")
}