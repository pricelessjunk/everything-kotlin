package chapter4

sealed class Expr {
    class Num(val value: Int) : Expr()      // All the direct subclasses must be nested here.

    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {          // when expression must be exhaustive. all subclasses of Expr should be listed
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }