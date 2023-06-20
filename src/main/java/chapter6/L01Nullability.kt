package chapter6

import java.lang.NullPointerException

fun main() {
    val notNull : String = "notnull"
    val nullable : String? = null

    println(notNull.length)   // prints length
    println(nullable?.length)   // This is basically a null check. prints null
    println(nullable?.length?:-1)   // Elvis operator or null coalescing operator
    try {
        println(nullable?.length?:throw IllegalArgumentException("No value"))   // Can also throw exceptions
    } catch (e : IllegalArgumentException) {
        e.printStackTrace()
    }

    try {
        println(nullable!!.length)  // Not null assertion
    } catch (e:NullPointerException) {
        e.printStackTrace()
    }



}