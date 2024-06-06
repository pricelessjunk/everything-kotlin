package chapter6

/**
 * The let is like with. Does not return the incoming receiver. But, converts a nullable
 * receiver param into a not nullable one within its scope.
 *
 * Unlike apply, the value is passed as a parameter and accessed through it
 *
 * Run is like let but does not have the inner it
 */
fun printThis(str: String) = println(str)

fun main() {
    // Let
    val sNullable: String? = "nullableString"
    // printThis(sNullable)         Type mismatch
    sNullable?.let {
        printThis("$it is of type String and is not nullable")
        it
    }

    //-----------------
    // Run
    var someString: String? = "nullable"

    someString = run {      // Expects return type to be String?
        val someString = "not nullable"  // This is like a block where scope is local
        someString
    }

    println(someString) //not nullable

    //-------------------
    // Can be used to set defaults
    var p: String? = null
    p?.let { println("p is $p") } ?: run {
        println("p was null. Setting default value to: ")
        p = "Kotlin"
    }

    println(p)
}

