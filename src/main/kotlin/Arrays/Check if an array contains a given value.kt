package Arrays
import java.util.*

fun main(args : Array<String>){
val read=Scanner(System.`in`)
println("\nEnter the size of the array")
val size =readLine()!!.toInt()
var arr=IntArray(size)
var check : Boolean=true

println("\nEnter The Elements :")
for(i in arr.indices){

    arr[i]=read.nextInt()
    print(" "+arr[i])
}

println("\nEnter the element which you want to check")
var element=readLine()!!.toInt()
for(i in arr.indices) {
    if (arr[i] == 45)
        check = true
    else
        check = false

}
println("The number in the array :"+ check)

}
