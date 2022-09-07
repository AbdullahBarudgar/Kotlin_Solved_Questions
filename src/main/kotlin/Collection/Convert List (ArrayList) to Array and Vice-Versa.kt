package Collection

fun main(args : Array<String>){
    var list1: List<String> =listOf("A","B","C","D")
    println("  $list1")
    list1.toTypedArray()
    println("$list1")

    var list3=ArrayList<String>()
    var list2=arrayOf("E","F","G","H")

    for(i in list2.indices){
        list3.add(list2[i])
    }
    println("$list3")
}