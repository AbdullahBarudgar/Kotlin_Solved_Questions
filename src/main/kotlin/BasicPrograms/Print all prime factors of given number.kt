package BasicPrograms

fun main(args : Array<String>){

var input = readLine()!!.toInt()

for(i in 2 until input){

if(input % i == 0) {
    println(i)
    input /= i
}

}
}