package String

fun main(args : Array<String>) {

    println("\nEnter the character ")
    val input = readLine()!![0]

//    println("The answere is : ${if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') "Vowel" else "Constant"}")

    when (input) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> println("The given character $input is vowel")
        else -> println("The given character $input is consonant")
    }
}