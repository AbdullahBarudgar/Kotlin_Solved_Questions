package Arrays

fun main(args : Array<String>){
var sum :Double =0.0
val arr : IntArray = intArrayOf(5,6,3,8,9,1,23,90)

for(i in arr.indices){

sum+=arr[i]
}
println("Sum Of the numbers :"+sum)

println("Average : ${sum/arr.size} ")
}