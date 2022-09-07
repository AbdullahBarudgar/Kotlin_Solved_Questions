package BasicPrograms

fun main(args : Array<String>){

var input = readLine()!!.toInt()
var mod : Int
var result : Int=0
val number=input
while(input>0){

   mod=input %10
   print(" "+mod+" ")
   result+= (mod*mod*mod)
   input /=10

}

println("${if(result == number)"\nYes,It is Armstrong Number" else "\nNo , It is not Armstrong Number"}")

}