package chapter5

fun main() {
    println(listOfPerson.filter { it.age % 2 == 0 })
    println(listOfPerson.map { it.age * 2 })

    // maps
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.uppercase() })
}