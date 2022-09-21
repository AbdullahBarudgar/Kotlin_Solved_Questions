package Functions

import java.util.*
import kotlin.collections.ArrayList

class PrimeSum(var num : Int){
fun primeNumber():ArrayList<Int>{
    var n = num
    var arr : ArrayList<Int> = ArrayList<Int>()
    for (i in 2..num) {
        if(i==2 || i==3 || i==5)
            arr.add(i)
        if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
            arr.add(i)
        }

    }
    return arr
}

}

fun main(){
println("Enter the number")
var n = readLine()!!.toInt()
var prime = PrimeSum(n)
println(prime.primeNumber())
var primenumbers : ArrayList<Int> = prime.primeNumber()
    var sum : Boolean = false

    for(i in primenumbers){
        for(j in primenumbers){
        if(i+j==n) {
            println("$i + $j == $n")
        }

        }
    }

}