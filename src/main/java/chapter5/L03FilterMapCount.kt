package chapter5


fun main() {
    println(listOfPerson.filter { it.age % 2 == 0 })
    println(listOfPerson.map { it.age * 2 })

    // maps
    val numberMap = mapOf(0 to "zero", 1 to "one")
    println(numberMap.mapValues { it.value.uppercase() })
}