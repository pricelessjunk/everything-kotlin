package chapter2

/**
 * Importing this function from a different package
 */
import chapter2.l06.createRandomRectangle

fun main(args: Array<String>) {
    val rect: Rectangle = createRandomRectangle()
    println(rect.isSquare)
}