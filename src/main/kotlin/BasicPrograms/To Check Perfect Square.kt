package BasicPrograms

fun main(args : Array<String>) {

    var multiply: Int=1
    val input = readLine()!!.toInt()
    var sum: Int = 0
    for (i in 1 until input) {

        if (input % i == 0)
            multiply = i * i
        if(multiply==input)
            break
    }


    println("${if(multiply == input)"It is a perfect square" else "It is not a  perfect sqaure"}")

    }
