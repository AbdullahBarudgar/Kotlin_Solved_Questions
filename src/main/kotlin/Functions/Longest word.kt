package Functions


fun main(args : Array<String>){
println("Enter the string")
val str1=readLine()!!

var str2  =str1.split(" ")
var str3=""

for(i in str2.indices){

if(str3 <= str2[i].length.toString())
 str3=str2[i]
}

println("The Longest Word is : ${str3} and Length of the word is : ${str3.length}")

}