package chapter9

import chapter3.list

/**
 * This extended function that returns a sub list of the given list
 *
 * <T> is called the type parameter declaration.
 */
fun <T> List<T>.slice(intRange: IntRange) : List<T> {
    return this.subList(intRange.first, intRange.last)
}

fun main() {
    val charList = listOf('a','b','c','d')
    println(charList.slice(1..3))
}