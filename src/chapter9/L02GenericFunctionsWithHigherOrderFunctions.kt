package chapter9

fun <T> List<T>.filterGeneric(predicate: (T) -> Boolean) : List<T> {
    return this.filter(predicate)
}

fun main() {
    val charList = listOf('a','b','c','d')
    println(charList.filterGeneric { it !in listOf('a', 'b', 'e', 'f') })   // prints [c, d]
}