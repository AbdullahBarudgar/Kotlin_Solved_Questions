package BasicPrograms

fun main(args : Array<String>) {
val num1 =readLine()!!.toInt()
val num2=readLine()!!.toInt()
var option=readLine()!!


println(when(option){
"+" -> "${num1+num2}"
"-" -> if(num1>num2)"${num1-num2}" else "${num2-num1}"
"*" -> "${num1*num2}"
"/" -> if(num1==0 || num2==0)"0" else "${num1/num2}"
else -> "Use proper symbol"
})
}
