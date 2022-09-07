package OOPS

// Declared Class with Parameterized
// primary constructor
class Animal(name:String){
    // Property Declaration
    private var name: String?=null
    private var type: String?=null

    // Init Block, effectively becomes part of
    // the primary constructor
    init{
        this.name=name
        println("Init Block")
    }

    // Secondary Constructor, calls/delegates the
    // primary constructor using 'this'
    constructor(name:String,type:String) : this(name){
        this.type=type
        println("Secondary Constructor")
    }

    //fun to print class property data
    fun printData(){
        println("Animal -> Name : $name  and Type : $type")
    }
}

// Declared class without primary Constructor,
// delegation still happens implicitly,
// and the initializer blocks are still executed
// before Secondary Constructor execution

class Sample{
    // First Init Block
    init{
        println("Init Block 1")
    }

    // Secondary Constructor
    constructor(a: Int,b:Int){
        println("Secondary Constructor : A=$a and B=$b")
    }

    // Second Init block
    init {
        println("Init Block 2")
    }
}

// Main function, Entry Point of Program
fun main(args: Array<String>){
    // Create Class object to call Primary constructor
    // of Animal Class
    val animal = Animal("Cobra")
    animal.printData()

    // Create Class object to call Secondary constructor
    // of Animal Class
    val animal2 = Animal("Python","Snake")
    animal2.printData()

    // Create Class object to call Secondary constructor
    // of Sample Class with named parameter
    Sample(a=10, b=20)
}