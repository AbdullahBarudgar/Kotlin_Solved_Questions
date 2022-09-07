package String

import java.util.HashSet

fun main(args : Array<String>){
    println("Enter the String")
    val str=readLine()!!
    var result :HashSet<Char> = HashSet<Char>()
    var check =false
    for(i in str.indices){

        if(!check)
        check=result.add(str[i])
        break
    }
    println("Unique Elements:  "+check)
    }


