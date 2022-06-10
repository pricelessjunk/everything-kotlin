package chapter3

/**
 * Receiver type is String
 * Receiver object is this
 *
 * External functions cannot be overridden as they are just static functions external to the class
 */
fun String.lastChar() :Char = this.get(this.length - 1)
fun String.lastChar2() :Char = get(length - 1)  // The this can be ignored

fun main() {
    println("Kotlin".lastChar())
    println("Kotlin".lastChar2())
}