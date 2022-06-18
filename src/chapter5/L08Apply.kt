package chapter5

fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

// --------------------------

fun main() {
    s() // overriden by lambda
    A().apply() // original method
}

class A {
    fun apply() {
        println("in apply")
    }
}

fun s() = A().apply() {
    println("in lambda apply")
}