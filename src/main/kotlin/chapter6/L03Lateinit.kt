package chapter6

fun main() {
    LateInitDemo("blah")
}

/**
 * lateinit can only be used with mutable type
 * allows initialization in constructor
 */
class LateInitDemo {
    lateinit var something: String

    constructor(s: String) {
        something = s
    }
}