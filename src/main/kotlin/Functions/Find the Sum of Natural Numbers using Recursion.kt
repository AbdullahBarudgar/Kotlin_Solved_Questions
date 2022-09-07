package Functions

fun sumOf(num : Int) :Int{

if(num != 0)
return num+sumOf(num-1)
else
return num

}

fun main(args : Array<String>){

println("Enter the number")
var n=readLine()!!.toInt()
var  ans =println("${sumOf(n)}")
}