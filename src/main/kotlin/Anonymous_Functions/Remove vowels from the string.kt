package Anonymous_Functions

val removeVowels ={str : String -> val vowels = mutableListOf('a','e','i','o','u')
    str.filterNot { it in vowels }
}

fun main(){

var s = readLine()!!
println("${removeVowels(s)}")
}