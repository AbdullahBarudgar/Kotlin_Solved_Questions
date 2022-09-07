package OOPS

//Declare class, use 'open' keyword
//to make class inheritable
//Class without declare primary constructor

open class Company{
    //member function
    fun getCompany(){
        println("Base Methods : Company Info")
    }
}
//Declare class using inheritance
class Department : Company() {
    //member function
    fun getDept(){
        println("Derived Method :  Dept Info")
    }
}

//Declare class, use 'open' keyword
//to make class inheritable

open class Shape(val a:Int){
    fun getBaseValue(){
        println("Base value : $a")
    }
}
//if derived class has primary constructor
//then base class can initialized there
//using primary constructor parameters
class Circle(val b:Int): Shape(b) {
    fun getChildValue(){
        println("Child value : $b")
    }
}


//Main Function, Entry point of program
fun main(args:Array<String>){

    //create derived class object
    val company = Department()
    //access base class function
    company.getCompany()
    //access derived class function
    company.getDept()


    //create derived class object and passed parameter
    val shape = Circle(20)
    //access base class function
    shape.getBaseValue()
    //access derived class function
    shape.getChildValue()
}