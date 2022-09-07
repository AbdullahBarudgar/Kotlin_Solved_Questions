package BasicPrograms

fun main(args : Array<String>){

val num1=readLine()!!.toInt()
val num2=readLine()!!.toInt()

//Largest from both numbers, get as initial lcm value
var lcm=if(num1>num2)num1 else num2
//Running Loop to find out LCM

//Running Loop to find out LCM
    while (true){
        //check lcm value divisible by both the numbers
        if(lcm % num1==0 && lcm % num2==0){
            //break the loop if conditon satisfies
            break;
        }
        //increase lcm value by 1
        lcm++
    }

    //print LCM
    println("LCM of $num1 and $num2 is : $lcm ")
}