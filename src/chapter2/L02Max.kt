package chapter2


fun main(args: Array<String>) {
    println(max(1, 2))
}


//fun max(a: Int, b : Int) : Int {
//    return if (a > b) a else b
//}

/**
 * When the body consists of a single expression, can be simplified
 */
fun max(a: Int, b: Int): Int = if (a > b) a else b