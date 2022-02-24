package Arrays

import java.util.*

fun main(args : Array<String>){
    val read= Scanner(System.`in`)

    println("\nEnter the row of the matrix")
    val row = readLine()!!.toInt()
    println("Enter the column of the matrix")
    val col = readLine()!!.toInt()

    val matrix1=Array(row){IntArray(col)}


    println("\nEnter the elements of matrix :")
    for(i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            matrix1[i][j] = read.nextInt()

        }
    }
    for(i in matrix1.indices){
        println(matrix1[i].contentToString())
    }


    println("\nUpper Triangular Matrix :")
    for(i in matrix1.indices) {
        for (j in matrix1[i].indices) {
          if(j<i){
          matrix1[i][j]=0
          }

        }
    }

    for(i in matrix1.indices){
        println(matrix1[i].contentToString())
    }

}