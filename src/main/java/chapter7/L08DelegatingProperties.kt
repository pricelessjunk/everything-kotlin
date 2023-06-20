package chapter7

/**
 * The emails gets loaded only when the get accessor is called.
 */
class Person2(val name: String) {
    val email by lazy { loadEmails(name) }

    private fun loadEmails(name: String): String {
        println("loadEmails called.")
        return "$name@gmail.com"
    }
}


fun main() {
    val p = Person2("kaustuv")
    println(p.email)
}