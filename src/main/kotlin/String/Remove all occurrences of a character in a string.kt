package String

fun main(args : Array<String>){

    println("Enter the String")
    val str=readLine()!!
    println("Enter the character you want to remove from the string")
    val chr=readLine()!![0]

    if(chr in str){
    println("\nNew String is : ${str.replace(chr.toString() ,"",ignoreCase = true)}")
    }
    else
    println("\nThe character is not present in string")
}