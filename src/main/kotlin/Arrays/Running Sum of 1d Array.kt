package Arrays

fun main(args : Array<String>){

val num : IntArray= intArrayOf(1 ,2 ,3 ,4 ,5)

var sum=0
var num2= IntArray(num.size)

    for (i in num.indices) {
        sum += num[i]
        num2[i] =sum
    }

for(i in num2.indices){

print(" " +num2[i])
}
}
