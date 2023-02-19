package chapter9

import java.lang.StringBuilder

/**
 * Single constrained type parameter
 */
fun <T: Number> oneHalf(value: T) :Double {
    return value.toDouble() / 2.0
}

/**
 * Multiple constrained type parameter
 */
fun <T> ensureTrailingPeriod(seq: T) : T where T:CharSequence, T:Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
    return seq
}

/**
 * Non-nullable constraint
 * By default, T is nullable
 */
fun <T: Any> guaranteedNonNull(value: T) :T {
    return value
}

fun main() {
    oneHalf(2)
    // oneHalf("sd")        Error

    println(ensureTrailingPeriod(StringBuilder("hell")).toString())  // hell.

    guaranteedNonNull("not null")
    // guaranteedNonNull(null)      Error
}