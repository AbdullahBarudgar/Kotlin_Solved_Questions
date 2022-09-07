package BasicPrograms

import java.lang.Math.PI

fun main(args : Array<String>){

var length : Float
var breadth : Float
var height : Float
var diameter : Float
var  Area : Float
var  Apothem : Float

//    println("\nEnter the Length")
//    length = readLine()!!.toFloat()
//    println("\nEnter the Breadth")
//     breadth = readLine()!!.toFloat()
//    println("\nEnter the Height")
//     height = readLine()!!.toFloat()
//    println("\nEnter the Diameter")
//     diameter = readLine()!!.toFloat()

    println("\nSelect Below To Find The Area")
    println("\n1:Rectangle"+"\n2:Square"+"\n3:Circle"+"\n4:Triangle"+"\n5:Cuboid"+"\n6:Pentagon"+"\n7.Equilateral Triangle")
    var select =readLine()!!.toInt()
    println(when(select){

    1 ->{println("\nEnter the Length")
        length = readLine()!!.toFloat()
        println("\nEnter the Breadth")
        breadth = readLine()!!.toFloat()
        "\nArea of the Rectangle : " + (length * breadth)
    }
    2 -> {
        println("\nEnter the Length")
        length = readLine()!!.toFloat()
        "\nArea of the Square :" + (length * length)
    }
    3 ->{   println("\nEnter the Diameter")
            diameter = readLine()!!.toFloat()
        "\nArea of the Circle :" + PI *(diameter/2*diameter/2)
    }

    4 ->{println("\nEnter the Breadth")
        breadth = readLine()!!.toFloat()
         println("\nEnter the Height")
        height = readLine()!!.toFloat()
        "\nArea of the Triangle :" +(breadth*height/2)
    }
    5-> {  println("\nEnter the Length")
       length = readLine()!!.toFloat()
       println("\nEnter the Breadth")
       breadth = readLine()!!.toFloat()
       println("\nEnter the Height")
       height = readLine()!!.toFloat()
    "\nArea of the Cuboid :" +2*(length*breadth + breadth*height + length*height)
    }
    6-> {println("\nEnter the Apothem of pentagon")
        Apothem=readLine()!!.toFloat()
        "\nArea of a Pentagon :" + (2.5*5*Apothem)
    }
    7-> {println("\nEnter the Length")
        length = readLine()!!.toFloat()
        "\nArea of a Equilateral Triangle :" +(0.433 *length*length)
    }
        else -> {"\nChoose The Appropriate Answere"}
    })
}