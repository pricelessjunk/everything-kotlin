package chapter9

/**
 * Comparable is a Generic class / interface
 */
interface Comparable<T> {
    fun compareTo(other: T): Int
}
class String : Comparable<String> {
    override fun compareTo(other: String): Int = 0
}