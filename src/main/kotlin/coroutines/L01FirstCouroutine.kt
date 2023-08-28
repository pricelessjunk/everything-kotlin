package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * A coroutine is an instance of suspendable computation. It is conceptually similar to a thread,
 * in the sense that it takes a block of code to run that works concurrently with the rest of the code.
 * However, a coroutine is not bound to any particular thread. It may suspend its execution in one thread
 * and resume in another one.
 */
fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed. This gets printed first
}