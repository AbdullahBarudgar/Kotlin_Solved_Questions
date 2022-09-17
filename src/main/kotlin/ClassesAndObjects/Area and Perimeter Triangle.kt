package ClassesAndObjects

/* Write a program to print the area and perimeter of a triangle having sides
 of 3, 4 and 5 units by creating a class named 'Triangle' with constructor
 having the three sides as its parameters.
 */

class Triangle(var s1 : Int ,var s2 : Int ,var s3 : Int , var b : Int , var h : Int){

fun area():Int{
return (h*b)/2
}

    fun per():Int{
        return s1+s2+s3
    }
}

fun main(){

val triangle = Triangle(4,5,3,8,4)
println("Area of Triangle is :${triangle.area()} \nArea of Perimeter is :${triangle.per()}")

}