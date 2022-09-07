package OOPS

abstract class ColorSheet{

abstract var value :Int
abstract fun draw()

    //marked function with 'open' to make overridable
    open fun paint(){
        println("Paint Method , Base Class Implementation")
    }

    //final method, so cant be override in subclass
    fun sketch(){
        println("Sketch Method , From Base Class!")
    }
}

class Sheet :ColorSheet(){
    override var value =100
    override fun draw() {
        println("draw Method , override in Child Class")
    }

    override fun paint() {
        super.paint()
    }
    fun printValue(){
        println("Value : $value")
    }
}

fun main(args : Array<String>){

val sheet =Sheet()

sheet.paint()
sheet.draw()
sheet.sketch()
sheet.printValue()

}