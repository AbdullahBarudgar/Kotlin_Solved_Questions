package String

fun main(args : Array<String>){

    println("Enter the String 1")
    val str1=readLine()!!
    println("Enter the String 2")
    val str2=readLine()!!
    var check =false
    if(str1.length != str2.length ) {
        println("\nStrings are not anagram")
    }
    else{
    var arr1=str1.toCharArray()
    var arr2=str2.toCharArray()

    for(i in arr1.indices){
        for(j in arr2.indices){

     if(arr1[i] !=arr2[j])
     check=false
     break
        }
    }
    println("${if(!check)"Strings are anagram" else "Strings are not anagram"}")
    }

}