package Arrays
import java.util.*
fun main(args : Array<String>){

val arr = arrayOf(455,657,1245,442,321,666,112,321,323,563,218,887,999,122,1009)

var max=0
var min =0

for(i in arr.indices){

    if(max <arr[i])
        max = arr[i]
}

println("\nMaximum NUmber :"+max)
println("\nMinimun Number :" +min)
}
