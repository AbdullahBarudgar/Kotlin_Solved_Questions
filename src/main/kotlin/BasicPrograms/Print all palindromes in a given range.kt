package BasicPrograms

fun main(args : Array<String>){
var reverse=0
var input=readLine()!!.toInt()
var number=input
while(input>0){

var mod=input%10
    reverse=reverse*10 +mod
    input /=10
}

println("${if(reverse==number)"It is a palindrome" else "It is not a palindrome"}")
}