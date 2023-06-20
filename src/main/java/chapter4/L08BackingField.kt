package chapter4

/**
 * Backing fields or backing properties have an implicit variable called field on which the operations are
 * usually done. In this example, the address is just a facade and the data is being stored internally in an
 * implicit private variable.
 */
class User3(val name: String) {
    var address: String = "default?"   // This is the backing field
        set(value) {
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


    val u = User3("name")
    u.address = "something2"
    u.address = "something3"
}