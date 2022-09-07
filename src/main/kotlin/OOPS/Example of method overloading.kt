package OOPS

class sumOf(){

fun sum(a : Int , b:Int) {
    println("Sum : ${a + b}")
}

fun sum(a: Int , b:Int ,c:Int) {
    println("sum : ${a + b + c}")
}

fun sum(a: Int ,b:Int ,c:Int ,d:Int) {
    println("sum : ${a + b + c + d}")
}

fun sum(c: String , d:String){
println("sum : ${c+d}")
}
    fun sum(a: Double ,b: Double){
    println("sum : ${a+b}")
    }

}

fun main(args : Array<String>) {

val operation=sumOf()
operation.sum(67,33)
operation.sum(34,56,77)
operation.sum(23,45,67,86)
operation.sum("Abdullah ","Barudgar")

operation.sum(45.0,42.42)

}



