package BasicPrograms

fun main(args : Array<String>){

    val input = readLine()!!.toInt()
    var sum : Int =0
    for (i in 1 until input) {

        if (input % i == 0)
        sum +=i
    }
    println("${if(sum==input) "Yes it is perfect Number" else "No it is not perfect number"}")

}