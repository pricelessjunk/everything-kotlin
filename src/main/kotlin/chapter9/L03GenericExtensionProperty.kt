package chapter9

// Extension property can also be called on list of any kind
val <T> List<T>.penultimate: T
    get() = this[size-2]

fun main() {
    println(listOf(1,2,3,4).penultimate)    // prints 3
}
