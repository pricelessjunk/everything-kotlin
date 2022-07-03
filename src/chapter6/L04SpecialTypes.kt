package chapter6

import java.lang.RuntimeException

fun main() {
    val answer: Any = 42    // under the hood, this is just Java's object

    // The fail method returns Nothing.
    // This helps the compiler decide that address will either have value or thorw exception. And hence is non nullable
    val nullable: String? = null
    val address : String = nullable ?: fail("No address")
    println(address)
}

/**
 * Unit is basically void. Return Void if extending a java function which returns void
 * This is useful in generic types
 */
fun f(): Unit {
    println("Unit is the same as Java's void")
}

/*
interface Processor<T> {
    fun process(): T
}
class NoResultProcessor : Processor<Unit> {
    override fun process() {
    // do stuff
    }
}
 */

fun fail(e: String) : Nothing {
    throw RuntimeException()
}
