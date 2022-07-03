package chapter7

/**
 * componentN is the compilers default names for the destructuring declaration
 */
class Point3(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun main(){
    val p = Point3(1,2)
    val (x,y) = p
    println("x: $x y: $y")
}