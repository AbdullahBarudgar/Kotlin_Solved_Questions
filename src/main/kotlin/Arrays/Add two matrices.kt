package Arrays
import java.util.*
fun main( args : Array<String>){

var read=Scanner(System.`in`)

println("Enter the size of the row :")
var row=readLine()!!.toInt()
println("Enter the size of the column :")
var col=readLine()!!.toInt()

var matrix1=Array(row){IntArray(col)}
var matrix2=Array(row){IntArray(col)}
var matrix3=Array(row){IntArray(col)}

println("\nEnter The First Matrix is :\n")
for(i in matrix1.indices) {
    for (j in matrix1[i].indices) {
        matrix1[i][j] = read.nextInt()

    }

}
    println("\nFirst Matrix is :\n")
    for(i in matrix1.indices){

    println(matrix1[i].contentToString())
    }

    println("\nEnter The Second Matrix is :\n")
    for (i in matrix2.indices) {
        for (j in matrix2[i].indices) {
            matrix2[i][j] = read.nextInt()

        }

    }

    println("\nSecond Matrix is :\n")
    for(i in matrix2.indices){

        println(matrix2[i].contentToString())
    }

    println("\nThe Sum Matrix Matrix is :\n")
    for (i in matrix3.indices) {
        for (j in matrix3[i].indices) {
            matrix3[i][j] = matrix1[i][j] + matrix2[i][j]
        }

    }


    println("\nSum Of Matrix is :\n")
    for(i in matrix3.indices){

        println(matrix3[i].contentToString())
    }
}