package String

fun main(args : Array<String>){
println("\nEnter the value is ")
val input = readLine()!![0]
var ascii=input.toInt()

//println(when(ascii){
//in 65..90 , in 97..122 -> "\nAlphabet"
//in 48..57 ->  "\nDigit"
//in 33..57 , in 58..64 , in 133..140 -> "\nSpecial character"
//    else -> "\nEnter the appropriate value"
//})

    when {
        input.isDigit() -> println("Digit")
        input.isLetter() -> println("Alphabet")
        else -> println("Special Character")
    }
}