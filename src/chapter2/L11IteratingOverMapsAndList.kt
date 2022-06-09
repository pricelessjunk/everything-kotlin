package chapter2

import java.util.TreeMap

fun main(args: Array<String>) {
    // Maps
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary      // Same as binaryReps.put(c, binary)
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    // Lists
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}