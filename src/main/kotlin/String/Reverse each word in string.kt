package String

fun main(args : Array<String>){

    println("Enter the String")
    val str=readLine()!!
    var str1 : String=""
    for(i in str.length-1 downTo 0){

    str1=str1+str[i]

    }
    println("$str1")

}