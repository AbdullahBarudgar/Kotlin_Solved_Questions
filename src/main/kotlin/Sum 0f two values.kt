package Anonymous_Functions

val sum1 :(Int , Int)-> Int = {a,b -> a+b}
val sum2 ={a: Int , b: Int -> a+b}

fun main(){

    println("Sum1 : ${sum1(43,56)} \nSum2 : ${sum2(67,33)}")

}