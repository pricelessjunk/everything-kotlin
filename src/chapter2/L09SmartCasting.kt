package chapter2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr


fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalShorter(Sum(Sum(Num(1), Num(2)), Num(4)))) // Same output
}

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num    // Explicit casting is unnecessary
        return n.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun evalShorter(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> evalShorter(e.left) + evalShorter(e.right)
    else -> throw IllegalArgumentException("Unknown expression")
}