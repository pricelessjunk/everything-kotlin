package chapter5

/**
 * SAM or single abstract method constructors is a way to wrap lambdas into functional interfaces.
 * Here, a lambda is wrapped into the SAM Runnable
 */
fun main() {
    createAllDoneRunnable().run()

    // A true functional interface
    val aFunctionalInterface = AFunctionalInterface {
        it + 1
    }
    aFunctionalInterface.someMethod(2)  // returns 3
}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}


/**
 * IMPORTANT: SAMs are not supported in Kotlin constructors yet. Thus, to load a lambda into a SAM in kotlin, an anonymous
 * object needs to first inherit that interface
 */

interface SomeKotlinInterface {
    fun someMethod()
}

val someLambda = object : SomeKotlinInterface {
    override fun someMethod() {
        TODO("Not yet implemented")
    }
}

/**
 * Using `fun` to declare a true functional interface
 * Used in main
 */
fun interface AFunctionalInterface {
    fun someMethod(input: Int): Int
}

fun interface UpperInterface<K> {
    fun someMethod(input: Int): Int
}

public fun interface AFunGenInterface<K> : UpperInterface<K> {
    // This is the method for this functional interface
    public fun K.someThing()

    // This one implements the UpperInterface.someMethod
    override fun someMethod(input: Int): Int {
        return input + 1
    }
}
