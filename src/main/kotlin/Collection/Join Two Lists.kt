package Collection

fun main(args : Array<String>){
var list1  =ArrayList<String>()
var list2  = ArrayList<String>()

list1.add("A")
    list1.add("B")
    list1.add("C")
    list1.add("D")

    list2.add("E")
    list2.add("F")
    list2.add("G")
    list2.add("H")

    println("Join both List : ${list1.addAll(list2)}  and $list1")

}