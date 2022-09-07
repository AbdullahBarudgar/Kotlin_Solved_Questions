package BasicPrograms


fun main(args : Array<String>) {

    val input = readLine()!!.toInt()
    for (i in 1..input) {

        if (input % i == 0)
        print(" "+i+ " ")

    }

}