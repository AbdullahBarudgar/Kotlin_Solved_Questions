package Arrays

fun main(args : Array<String>){

var arr1= arrayOf('A','B','D','U','L','L','A','H')
var arr2 = arrayOf(' ','B','A','R','U','D','A','R')
var arr3= arr1 + arr2

for(i in arr3.indices){
print(arr3[i])
}


}