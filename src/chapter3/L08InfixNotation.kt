package chapter3

infix fun Any.something(other: Any) = Pair(this, other)

fun main() {
    println("first".something("second"))

    println("first" something "second")
}