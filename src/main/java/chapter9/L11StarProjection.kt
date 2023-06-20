package chapter9

/**
 * Group can only be a type of Animal
 *
 * If we replace animal with Cat, readOut will throw error since, `out Animal`(parent) cannot be cast into `T:Cat`(child).
 * But readStar will work fine since inferred type of `item` will become `Cat`
 */
interface Group<T : Animal> {
    fun insert(member: T): Unit
    fun fetch(): T
}

fun readIn(group: Group<in Nothing>) {
    // Inferred type of `item` is `Any?`
    val item = group.fetch()
}


fun readOut(group: Group<out Animal>) {
    // Inferred type of `item` is `Animal`
    val item = group.fetch()
}

/**
 * Uses - easier to read and understand, but they also more gracefully handle changes to type parameter constraints!
 */
fun readStar(group: Group<*>) {
    // Inferred type of `item` is `Animal`
    val item = group.fetch()
}