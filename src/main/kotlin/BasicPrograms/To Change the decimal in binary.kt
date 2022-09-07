package BasicPrograms
import java.util.*

fun main(args : Array<String>){
 println("\nConvert Decimal To Binary")
 var input = readLine()!!.toInt()
 var BinaryNumber : Int=0
 var DecimalNumber : Int=0
 var binaryStr = StringBuilder()
 var rem : Int
 while(input >0){

     rem=input%2
     binaryStr.append(rem)
     input/=2

    }
    print("\nBinary Number  :"+ binaryStr.reverse())

    println("\n\nConvert Decimal To Binary")

    var power =0
    var input2 = readLine()!!.toInt()
    while(input2>0){
    rem=input2 %10
    DecimalNumber= (DecimalNumber + rem*Math.pow(2.0,power.toDouble())).toInt()
    input2/=10
    power++
    }

    print("\nDecimal Number  :"+ DecimalNumber)

}