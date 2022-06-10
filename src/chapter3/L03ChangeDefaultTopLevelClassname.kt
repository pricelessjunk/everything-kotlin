@file:JvmName("StringFunctions")    // Use to change the defaut class name

package chapter3

fun main(args : Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, separator = ";", prefix = "(", postfix = ")")) // (1; 2; 3)
    println(joinToString(list, separator = " ", prefix = " ")) // 1 2 3.
}