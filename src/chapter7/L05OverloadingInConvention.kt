package chapter7

data class Rectangle(val upperLeft: MutablePoint, val lowerRight: MutablePoint)

operator fun Rectangle.contains(p: MutablePoint): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

fun main(){
    val rect = Rectangle(MutablePoint(10, 20), MutablePoint(50, 50))
    println(MutablePoint(20, 30) in rect)
    println(MutablePoint(5, 5) in rect)
}

