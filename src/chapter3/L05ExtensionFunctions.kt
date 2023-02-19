package chapter3

/**
 * Receiver type is String
 * Receiver object is this
 *
 * External functions cannot be overridden as they are just static functions external to the class
 */
fun String.lastChar() :Char = this.get(this.length - 1)
fun String.lastChar2() :Char = get(length - 1)  // The this can be ignored
fun String?.lastChar3(): Char? = this?.get(this?.length?.minus(1) ?: 0) // can be called on nullable types also

fun main() {
    println("Kotlin".lastChar())
    println("Kotlin".lastChar2())
    val n : String? = null
    println(n.lastChar3())  // prints null
}