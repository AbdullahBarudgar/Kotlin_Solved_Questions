package BasicPrograms

fun main(args : Array<String>){

var num1 =90
var num2=70

    println("Before :Number 1 is : $num1 and Number 2 is : $num2")

    var temp =num1
num1=num2
num2=temp

println("After :Number 1 is : $num1 and Number 2 is : $num2")
}