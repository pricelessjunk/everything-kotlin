package coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {// this: CoroutineScope
    doWorld()
    println("Done")
}

/**
 * Both launches are executed concurrently
 */
private suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    launch {// this: CoroutineScope
        delay(2000L)
        println("World 2")
    }
    launch {// this: CoroutineScope
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}

/*
Output

Hello
World 1
World 2
Done
 */