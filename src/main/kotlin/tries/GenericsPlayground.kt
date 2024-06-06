package tries


fun interface FunInterface {
    fun translate(): String
}

fun main() {
    val someClass = SomeClass()
    someClass.toSomething {
        "Hello"
    }
}

class SomeClass {
    fun toSomething(f: FunInterface):String = f.translate()
}

