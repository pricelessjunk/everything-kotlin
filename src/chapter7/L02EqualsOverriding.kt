package chapter7

/**
 * Interesting here is that the equals is overriden and not operator
 * === cannot be overriden or overloaded
 */
class Point2(val x: Int, val y: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}