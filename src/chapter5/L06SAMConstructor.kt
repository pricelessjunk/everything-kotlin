package chapter5

/**
 * SAM or single abstract method constructors is a way to wrap lambdas into functional interfaces.
 * Here, a lambda is wrapped into the SAM Runnable
 */
fun main() {
    createAllDoneRunnable().run()
}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}