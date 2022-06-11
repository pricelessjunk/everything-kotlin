package chapter4

/**
 * Data classes have these methods all auto generated
 */
class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Clinet $name lives at $postalCode"

    override fun equals(other: Any?): Boolean {
        return if (other !== null && other is Client) {
            name == other.name && postalCode == other.postalCode
        } else {
            false
        }
    }

    override fun hashCode(): Int = name.hashCode() + postalCode.hashCode()
}

fun main() {
    val client1 = Client("name", 1)
    val client2 = Client("name", 1)

    // Object equals
    println("object equal ${client1 == client2}")

    // Reference equals
    println("reference equal ${client1 === client2}")
}

