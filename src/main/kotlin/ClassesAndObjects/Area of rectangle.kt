package ClassesAndObjects
import java.util.*

/* Write a program to print the area of a rectangle by creating a
 class named 'Area' having two methods. First method named as 'setDim'
 takes length and breadth of rectangle as parameters and the second method
  named as 'getArea' returns the area of the rectangle. Length and breadth
  of rectangle are entered through keyboard.
 */

class Area() {
  var l1 : Float=0f
  var b1 : Float=0f

fun setDim(l : Float , b : Float){
l1 = l
b1=b
}
    fun getArea() : Float{
    return l1*b1
    }
}
    fun main() {

        var area = Area()

        area.setDim(34.56f ,67.89f)
        println("The area of rectangle is : "+  area.getArea().toString())
    }

