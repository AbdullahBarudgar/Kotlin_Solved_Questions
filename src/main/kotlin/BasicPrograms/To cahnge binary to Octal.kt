package BasicPrograms

fun main(args : Array<String>){

println("\nConvert Binary To Decimal")

    var DecimalNumber : Int=0
    var OctalNumber : Int=0
    var power =0
    var input2 = readLine()!!.toInt()
    var rem : Int
    var i=1

    while(input2>0) {
        rem = input2 % 10
        DecimalNumber = (DecimalNumber + rem * Math.pow(2.0, power.toDouble())).toInt()
        input2 /= 10
        power++
    }

    print("\nDecimal Number  :"+ DecimalNumber)

    println("\n\nConvert Decimal To Octal")

    while(DecimalNumber >0){

     var rem=DecimalNumber % 8

       OctalNumber=OctalNumber + rem * i

        DecimalNumber/=8
        i*=10
    }
    print("\nOctalNumber  :"+ OctalNumber)

}