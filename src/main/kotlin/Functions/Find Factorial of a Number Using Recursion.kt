package Functions

fun fact(num : Int):Int{
if(num >= 1)
return  num *fact(num-1)
else
return 1
}

fun main(args : Array<String>){
println("Enter the number")
val number=readLine()!!.toInt()
var ans=println("Factorial is : ${fact(number)}")

}