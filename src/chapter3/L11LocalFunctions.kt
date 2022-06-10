package chapter3

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {    // Local functions
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${id}: " +
                        "empty $fieldName"
            )

        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun main() {
    val u = User(1, "Robot", "")
    u.validateBeforeSave()
}

