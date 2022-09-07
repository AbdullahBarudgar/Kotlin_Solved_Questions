package BasicPrograms

fun main(args : Array<String>){

val num1 =78
val num2=36
val num3=45

println("Largest Number is : ${if(num1>num2 && num1>num3) num1 else if( num2>num3) num2 else num3}")

}