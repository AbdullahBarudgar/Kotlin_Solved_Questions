package ClassesAndObjects

/*Assign and print the roll number, phone number and address of
 two students having names "Sam" and "John" respectively by
  creating two objects of class 'Student'. */

class Student(var name : String , var address : String ,var phone : Long , var roll : Int){

fun print(){
print("Student Name : $name\nRoll Number : $address \nPhone Number : $phone\nRoll Number : $roll\n\n")
}
}

fun main(){
val st1 = Student("Sam","Near Jamia",757747747,1)
    val st2 = Student("Jhon","Near Hamdrad",905774473,2)

st1.print()
    st2.print()
}