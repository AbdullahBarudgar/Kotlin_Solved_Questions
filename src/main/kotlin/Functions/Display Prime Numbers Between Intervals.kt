package Functions

fun primeNumbers(num : Int ,start : Int , end : Int) {
var check=true
if(num>end || num<start){
println("\nThe Number is not in the range")
}
else{
for(i in 2..num/2){
if(num%i==0)
check=false
break
}
println("The Number is : ${if(check)"Prime Number" else "not prime Number"}")
}
}

fun main(args : Array<String>){

println("Enter the range start")
var srt=readLine()!!.toInt()
println("Enter the range end")
var ends=readLine()!!.toInt()
println("Enter the number to check")
var number=readLine()!!.toInt()

primeNumbers(number,srt,ends)
}