package chapter3

fun main(args : Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, separator = ";", prefix = "(", postfix = ")")) // (1; 2; 3)
    println(joinToString(list, separator = " ", prefix = " ")) // 1 2 3.

}

/**
 * Using named arguments with defaults
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = " ",
    prefix: String = " ",
    postfix: String = "."
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}