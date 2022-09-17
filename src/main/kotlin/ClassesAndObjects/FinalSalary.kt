package ClassesAndObjects

/*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */

class Employee() {
    var salary: Long = 0
    var numOfHours: Int = 0

    fun getInfo(s: Long, n: Int) {
        salary = s
        numOfHours = n
    }

    fun AddSal(){
    if(salary < 500)
    salary+=10
    }

    fun AddWork(){
        if(numOfHours > 6)
            salary+=5
    }

    fun finalSalary() :Long = salary
}
    fun main(){

    val employee= Employee()
        print("Add the salary : ")
    var sal :Long = readLine()!!.toLong()
        print("Add the numOfHours : ")
        var num :Int = readLine()!!.toInt()

     employee.getInfo(sal,num)
     employee.AddSal()
     employee.AddWork()

     print("The Final Salary is : ${employee.finalSalary().toString()}")
    }
