package chapter3

// Set
val set = setOf(1, 7, 10)

// List
val list = listOf(1, 7, 10)

// Map
val map = hashMapOf(1 to "One", 7 to "Seven", 10 to "ten")

/**
 * Extra methods in the kotlin list, set and map
 */
fun main() {
    // List operations
    println(list.last()) // 10
    println(list)           // invokes toString

    // Set Operations
    println(set.maxOf { it })  // 10
}
