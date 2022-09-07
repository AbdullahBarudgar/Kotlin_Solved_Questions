package String

fun main(args : Array<String>){

    println("Enter the String")
    val str=readLine()!!

        println("\nNew String is : ${str.replace(" ","",ignoreCase = true)}")
}



