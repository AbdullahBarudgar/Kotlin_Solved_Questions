package Collection


fun main(args : Array<String>) {
    var arr = arrayOf("A", "B", "C", "D", "E")
    var hashset = HashSet<String>()

    for (i in arr.indices) {
        hashset.add(arr[i])
    }
    println("HashSet is : $hashset ")


    var hashset2: Set<String> = setOf("F", "G", "H", "I", "J")
    var arr2: String

    hashset2.toTypedArray()
    println("Array is  $hashset2")
}
