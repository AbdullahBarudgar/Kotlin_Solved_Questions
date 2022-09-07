package BasicPrograms
import java.util.*
fun main(args : Array<String>){
    val sc = Scanner(System.`in`)

    println("\nTake Integer input from the user")
    val IntValue1 =sc.nextInt()
    val IntValue2=readLine()!!.toInt()

    println("\nTake String input from the user")

    val str1 = sc.nextLine()
    val str2 =readLine()!!

    println("\nTake Charcater input from thr user")
    val chr1=sc.next()[0]
    val chr2=readLine()!![0]

    println("\nTake Double input from the user")

    val dou1=sc.nextDouble()
    val dou2=readLine()!!.toDouble()

    println("\nTake Long input from thr user")

    val lo1=sc.nextLong()
    val lo2=readLine()!!.toLong()

    println("\nTake FLoat input from the user")

    val flo1=sc.nextFloat()
    val flo2=readLine()!!

    println("Integer : $IntValue1 and $IntValue2 " + "\nString : $str1 and $str2 " +
    "\nCharacter : $chr1 and $chr2  "+"\nDouble : $dou1 and $dou2" +"\nLong : $lo1 and $lo2" +"\nFloat : $flo1 and $flo2")
}
