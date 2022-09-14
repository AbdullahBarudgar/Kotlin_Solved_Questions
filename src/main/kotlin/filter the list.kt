package Anonymous_Functions
import java.util.*

fun main(){

var list = mutableListOf(23,45,67,43,66,86,44,12,34,68,54,323,999,77,66,555,44,12,23,45,56,456,23,332,3232,89,76,54,111)

 // To find the number less than 50

 println(list.filter{it >= 50})

 // To Find number 5 or 7

println(list.filter{it %5==0 || it %7==0})

 // To Find number 2 and 3

 println(list.filter{it %2==0 || it %3==0})
}