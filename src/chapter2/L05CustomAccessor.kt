package chapter2

fun main(args: Array<String>) {
    val rect: Rectangle = Rectangle(1, 2)
    println(rect.isSquare)
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}