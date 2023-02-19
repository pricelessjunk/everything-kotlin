package chapter10

class GeneralAnnotations {
    // This is a public field in jvm without getters and setters
    @JvmField
    val field:String=""

    // Byte code will have javaName
    @JvmName("javaName")
    fun kotlinName() {

    }

    companion object {
        // This becomes a static field in java
        @JvmStatic
        val kotlinObject: Int = 1
    }

}

fun main() {
    val g = GeneralAnnotations()


    g.kotlinName()
    GeneralAnnotations.kotlinObject

}