package chapter5

import java.io.File

/**
 * Doesn't store intermediate lists as in collections
 */
fun main() {
    listOfPerson.asSequence()               // From list
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()   // prints 5050


    val naturalNumbers = generateSequence(0) { it + 1 }     // from formula
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())     // true


    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
    file.delete()
}


fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }        // generateSequence(<start>) { <way to get to the next one>}