package chapter9

import kotlin.String

/**
 * The T here is a contravariance. This can only be used in the `in` position.
 * Contravariance means if A is parent of B, Generic<B> is parent of Generic<A>
 */
/**
 * This is the definition of kotlin.Comparator
 */
interface MyComparator<in T> {
    fun compare(e1: T, e2: T): Int {
        return e1.hashCode() - e2.hashCode()
    }
}

val anyComparator = Comparator<Any> { e1, e2 ->
    e1.hashCode() - e2.hashCode()
}

fun main() {
    val strings: List<String> = listOf("a", "b")
    // sortedWith expects Comparator<String>, but works with Comparator<Any> because of contravariance.
    strings.sortedWith(anyComparator)
}