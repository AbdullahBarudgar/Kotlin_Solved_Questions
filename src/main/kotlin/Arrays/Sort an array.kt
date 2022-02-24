package Arrays

fun main(args : Array<String>){

var arr= arrayOf(3,4,7,5,2,1,9,6,11,15,17,12,18,13,19,14,20)
println("\nArray In Descending Order\n")
arr.sortDescending()

for(i in arr.indices){
print(" "+arr[i])
}

println("\n\nArray In Ascending Order\n")
    arr.sort()
    for(i in arr.indices){
        print(" "+arr[i])
    }

}