package Arrays

import java.util.*
fun main( args : Array<String>){

    var read=Scanner(System.`in`)

    println("Enter the size of the Matrix1 row :")
    var row1=readLine()!!.toInt()
    println("Enter the size of the Matrix1 column :")
    var col1=readLine()!!.toInt()

    println("Enter the size of the Matrix1 row :")
    var row2=readLine()!!.toInt()
    println("Enter the size of the Matrix1 column :")
    var col2=readLine()!!.toInt()

    if(row1 !=col2){
    println("Multiplication is not possibebecause row\nof 1 matrix is not equal to cloumn of 2 matrix")
    }
    else{
    var matrix1=Array(row1){IntArray(col1)}
    var matrix2=Array(row2){IntArray(col2)}
    var matrix3=Array(row1){IntArray(col2)}

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
    for(i in matrix2.indices) {

        println(matrix2[i].contentToString())
    }

    for(i in matrix3.indices) {
        for (j in matrix3[i].indices) {
            for (k in matrix3.indices) {
                matrix3[i][j] += matrix1[i][k] * matrix2[k][j]
            }
        }
    }

        println("\nMultiplication Of Matrix is :\n")
        for(i in matrix3.indices) {

            println(matrix3[i].contentToString())
        }

        }
    }
