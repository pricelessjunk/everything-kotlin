package chapter3

/**
 * Infix notation means a function can be called between two parameters. Eg, the following example, `a something b`
 *
 * The `something` is an infix function here.
 */
infix fun Any.something(other: Any) = Pair(this, other)

fun main() {
    println("first".something("second"))

    println("first" something "second") // Infix notation
}