package chapter5

/**
 * SAM or single abstract method constructors is a way to wrap lambdas into functional interfaces.
 */
fun main() {
    createAllDoneRunnable().run()
}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}