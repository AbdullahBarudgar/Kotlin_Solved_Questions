package String

fun main(args : Array<String>){

    println("Enter the String")
    val str=readLine()!!
    var str1 : String=""
    for(i in str.length-1 downTo 0){
        str1=str1+str[i]

    }
    println("Reverse String: "+ str1)
    println("${if(str1.equals(str))"String Is Palindrome" else "String Is Not Palindrome"}")

}

