package chapter10

import kotlin.reflect.KFunction

/**
 * KCallable is a superinterface for functions and properties. It
 * declares the call method, which allows you to call the corresponding function or the
 * getter of the property:
 */
fun foo(x: Int) = println(x)


/**
 * Now you can’t call the invoke method on kFunction with an incorrect number of
 * arguments: it won’t compile. Therefore, if you have a KFunction of a specific type,
 * with known parameters and return type, it’s preferable to use its invoke method.
 */
fun sum(x: Int, y: Int)=x+y

fun main() {
    val kFunction = ::foo
    kFunction.call(42)

    // ---

    val kFunction2 = ::sum
    println(kFunction2.invoke(1, 2) + kFunction2(3, 4))
    // kFunction2(1)     ERROR: No value passed for parameter p2
}