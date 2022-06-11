package chapter4

class User3(val name: String) {
    var address: String = "default?"        // This is the backing field
        set(value: String) {
            println(
                """
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent()
            )

            field = value
        }
}

fun main() {
    User3("name").address = "something"
}