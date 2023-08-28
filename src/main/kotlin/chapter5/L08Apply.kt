package chapter5

/**
 * Same as with. Except it returns the passed object back
 */
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

/**
 * this function basically an instance of A() after printing the line.
 */
fun s() = A().apply {
    println("in lambda apply")
}