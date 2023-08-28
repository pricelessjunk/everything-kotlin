package tries

fun main() {
    something {
        other(1)
        other(2)
        other(it)
    }
}

fun something(fn: (Int) -> Unit) {
    fn(3)
}

fun other(j : Int) : Unit {
    println("lala $j")
}