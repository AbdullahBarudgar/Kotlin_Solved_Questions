package OOPS

class StudentData{

private var name : String=""
private var rollNumber : Int =0
private var age  : Int=0

fun StudentDetail( name : String ,  rollNumber : Int , age : Int) {
this.name=name
this.rollNumber=rollNumber
this.age=age
}

override fun toString(): String {
return "\nStudent Name: $name \nStudent RollNumber : $rollNumber \nStudent Age : $age"
}
}

fun main(args : Array<String>){
do {
    val stu = StudentData()
    println("\nEnter the Student Name")
    val n = readLine()!!
    println("Enter the Student RollNumber")
    val r = readLine()!!.toInt()
    println("Enter the Student Age")
    val a = readLine()!!.toInt()

    stu.StudentDetail(n, r, a)
    println("\nStudent Details : ${stu.toString()}")

    println("\nDo you want to continue , Press Y and N")
    val option=readLine()!![0]

}while(option=='Y')
}

