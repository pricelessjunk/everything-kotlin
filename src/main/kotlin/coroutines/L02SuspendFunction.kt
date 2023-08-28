package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Suspend functions are useful to call other suspending functions like `delay`. Without this `suspend`
 * the `doWorld()` function would not compile.
 */
fun main() = runBlocking { // this: CoroutineScope
    launch { doWorld() }
    println("Hello")
}

private suspend fun doWorld() {
    delay(1000L)
    println("World!")
}