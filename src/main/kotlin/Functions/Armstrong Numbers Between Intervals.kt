package Functions
import java.util.*
import kotlin.math.pow

// Armstrong number is a number that is equal to the sum of cubes of its digits

class Armumber(var num : Int , var range : Int) {
var sum=0
var mode=0
var n=num
fun toCheckArm():Boolean{
    if(n<=range){
    while(n != 0){
        mode =n%10
   sum += power(mode,3)
        n /= 10
}
    }
    else{
    println("Error -- Out Of Range")
    }
    return sum==num
}
}

fun main(){

println("Enter the range :")
var r= readLine()!!.toInt()
    println("Enter the number :")
    var nume= readLine()!!.toInt()

var arm = Armumber(nume ,r)
 println(if(arm.toCheckArm()) "It is an Armstrong Number" else "It is not an Armstrong Number")
}