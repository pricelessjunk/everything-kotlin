package chapter3

/**
 * Receiver type is String
 * Receiver object is this
 *
 * External functions cannot be overridden as they are just static functions external to the class
 */
fun String.lastChar() :Char = this.get(this.length - 1)
fun String.lastChar2() :Char = get(length - 1)  // This can be ignored
fun String?.lastChar3(): Char? = this?.get(this?.length?.minus(1) ?: 0) // can be called on nullable types also


/**
 * Inheritance.
 *
 */

open class A {}
fun A.some() = println("In A")
fun A.test(callback: A.() -> Unit) = this.callback()
class B : A() {}
fun B.some2() = println("In B")



fun main() {
    println("Kotlin".lastChar())  // n
    println("Kotlin".lastChar2())  // n
    val n : String? = null
    println(n.lastChar3())  // prints null

    B().some()  // In A. Simple case of calling the parent function
    A().test {
        B()
    }
}