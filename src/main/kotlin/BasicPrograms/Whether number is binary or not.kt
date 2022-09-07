package BasicPrograms

fun main(args : Array<String>){

var input =readLine()!!.toInt()
var number=input
var  toCheck :Boolean=true

while(input>0){
var mod =input%10
if(mod>1) {
    toCheck = false
    break
}
else {
    toCheck = true
}

input /=10

}
println("${if(toCheck==true)"Binary Number" else "It is not a Binary Number"}")
}