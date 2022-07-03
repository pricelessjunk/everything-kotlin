package chapter6

/**
 * The let is like with. Does not return the incoming receiver. But, converts a nullable receiver param into a not nullable one
 */
fun main() {
    val sNullable :String? = "something"
    // printThis(sNullable)         Type mismatch
    sNullable?.let { printThis(it) }
}

fun printThis(str: String) = println(str)