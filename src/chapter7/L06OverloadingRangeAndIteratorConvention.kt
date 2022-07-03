package chapter7

import java.time.LocalDate

/**
 * RangedTo can overloaded like this
 * operator fun <T: Comparable<T>> T.rangeTo(that: T): ClosedRange<T>
 */

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> = object : Iterator<LocalDate> {
    var current = start

    override fun hasNext() =
        current <= endInclusive

    override fun next() = current.apply {
        current = plusDays(1)
    }
}

fun main() {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(2)..newYear
    for (dayOff in daysOff) {
        println(dayOff)
    }
}