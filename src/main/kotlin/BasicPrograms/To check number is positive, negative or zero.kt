package BasicPrograms
import java.util.*
fun main(args : Array<String>){
val sc=Scanner(System.`in`)

val input=sc.nextInt()
println("${if(input<0) "Negative" else if(input>0) "Positive" else "Zero"}")
}