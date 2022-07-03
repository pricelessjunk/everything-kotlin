package chapter7

/**
 * Operator overloading can be done with the following method names -
 *
 * a * b times
 * a / b div
 * a % b mod
 * a + b plus
 * a - b minus
 *
 * precedence still follows the default rule. Also applies to unary operator
 *
 * +a unaryPlus
 * -a unaryMinus
 * !a not
 * ++a, a++ inc
 * --a, a-- dec
 */
data class Point(val x : Int, val y : Int, val z : Int) {
    operator fun plus(other : Point) : Point {
        return Point(x+other.x, y+other.y , z+other.z)
    }
}

/**
 * Alternative way to use extension functions. This ofcourse does not work when the internal function is present
 */
operator fun Point.plus(other : Point) : Point {
    return Point(x+other.x, y+other.y , z+other.z)
}

fun main() {
    val p1 = Point(1,2,3)
    val p2 = Point(4,5,6)

    println(p1 + p2)
}