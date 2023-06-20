package chapter5

fun main() {
    println("countAbove18 = ${listOfPerson.count { it.age > 18 }}")

    println(listOfPerson.find { it.age > 18 })

    // groupBy
    val newListOfPerson  = mutableListOf(*listOfPerson.toTypedArray())
    newListOfPerson.add(Person("Angela", 31))
    println(newListOfPerson.groupBy { it.age })     // Retures a Map<Int, List<Person>>

    // flatMap
    println(newListOfPerson.flatMap { p:Person -> p.name.toList() }) // prints [A, l, i, c, e, K, a, g, u, r, a, A, n, g, e, l, a]

    // flatten
    val listOfList = listOf(listOfPerson, newListOfPerson)
    println(listOfList.flatten())
}
