package chapter3

/**
 * varargs is used instead of the ... operator in java. The only problem is when passing it,
 * it needs to be spread into proper arguments. Thats where the * (spread operator comes)
 */

fun main(){
    val list : IntArray = intArrayOf(1,2,3,4,5,6)  // same as int[]
    spreadOperator(list)
}

fun spreadOperator(list: IntArray) {
    println(makeList(*list))  // Spreading the list
}

// Array<Int> translate to Integer[]. This is called a typed array
fun makeList(vararg inputList : Int) : Array<Int> = inputList.toTypedArray()