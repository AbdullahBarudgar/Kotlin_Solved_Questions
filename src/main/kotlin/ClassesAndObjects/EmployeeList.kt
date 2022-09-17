package ClassesAndObjects

/*Write a program that would print the information (name, year of joining, salary, address)
 of three employees by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat

*/
class EmployeeDetails(var list1N : List<String> , var list2Y : List<String> ,var list3A : List<Int>) {

    fun result() {
        println("Name $list1N")
        println("Year Of Joining $list2Y")
        println("Address $list3A")
    }
}

fun main(){
var nameList = mutableListOf<String>("Robert","Sam","Jhon")
    var yearList = mutableListOf<Int>(1994,2000,1999)
    var addList = mutableListOf<String>("64C- WallsStreat","68D- WallsStreat","26B- WallsStreat")

    val employee =EmployeeDetails(nameList,addList,yearList)

    employee.result()
}