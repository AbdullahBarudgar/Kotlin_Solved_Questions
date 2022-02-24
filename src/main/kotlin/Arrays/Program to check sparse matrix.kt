package Arrays

import java.util.*


fun main(args : Array<String>){
    val read= Scanner(System.`in`)

    println("\nEnter the row of the matrix")
    val row = readLine()!!.toInt()
    println("Enter the column of the matrix")
    val col = readLine()!!.toInt()

    val matrix1=Array(row){IntArray(col)}
    var totalNumberOfElements =row*col
    var totalNumberOfZero=0

    println("\nEnter the elements of matrix :")
    for(i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            matrix1[i][j] = read.nextInt()

        }
    }
    for(i in matrix1.indices){
        println(matrix1[i].contentToString())
    }


    for(i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            if(matrix1[i][j]==0){
                totalNumberOfZero++
            }

        }
    }

    println("\nThe Matrix is : ${if(totalNumberOfZero > totalNumberOfElements/2 ) "SPARSE MATRIX" else "NOT SPARSE MATRIX"} ")

}