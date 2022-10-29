package chapter8

/**
 * noinline doesn't replace the code
 */
inline fun foo(inlinedFun: (Int) -> Unit, noinline notInlinedFun: (Int) -> Unit) {
    val a = 1
    inlinedFun(a)
    notInlinedFun(a)
}

fun main() {
    val f = { c:Int -> println("inlined $c")}
    val f2 = { d:Int ->
        println("noninlined $d")
        println("noninlined2 $d")
        println("noninlined3 $d")
    }
    foo(f, f2)
}