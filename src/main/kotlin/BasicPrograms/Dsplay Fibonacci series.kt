package BasicPrograms

fun main(args : Array<String>) {

    val input = readLine()!!.toInt()
    var a = 0
    var b = 1
    var sum=0
    var temp : Int
    print(a)
    print(" "+b+" ")
    for (i in 2 ..input){
    sum=a+b
    a=b
    b=sum
        print(" "+ sum+" " )
    }

}