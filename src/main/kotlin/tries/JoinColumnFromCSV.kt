package tries

import java.io.File

fun main() {
    val listOfLines = File("src/main/kotlin/tries/csv.csv").readLines().reversed().toList()

    val theMessage = listOfLines.map { it.substring(1..it.length - 2) }.joinToString("").replace("\\\"", "")

    println(theMessage)
}