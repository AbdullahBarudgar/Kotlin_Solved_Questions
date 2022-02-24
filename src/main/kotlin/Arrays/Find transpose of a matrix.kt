package Arrays

import java.util.*

fun main(args : Array<String>){
val read= Scanner(System.`in`)

println("\nEnter the row of the matrix")
val row = readLine()!!.toInt()
    println("Enter the column of the matrix")
    val col = readLine()!!.toInt()

val matrix1=Array(row){IntArray(col)}
val matrix2=Array(col){IntArray(row)}

println("\nEnter the elements of matrix :")
for(i in matrix1.indices) {
    for (j in matrix1[i].indices) {
        matrix1[i][j] = read.nextInt()

    }
}
    for(i in matrix1.indices){
        println(matrix1[i].contentToString())
    }


    println("\nTranspose of matrix :")
    for(i in matrix2.indices) {
        for (j in matrix2[i].indices) {
            matrix2[i][j] =matrix1[j][i]

        }
    }

    for(i in matrix2.indices){
        println(matrix2[i].contentToString())
    }

}