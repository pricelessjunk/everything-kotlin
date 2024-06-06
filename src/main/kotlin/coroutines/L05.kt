package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking {// this: CoroutineScope
    // val text = doWorld()
   //  println("Done $text")

    println("World 1")
    val one = async { meaninglessCounter() }
    println("World 2")
    one.join()
    println("Hello ${one.getCompleted()}")
}

fun meaninglessCounter(): Int {
    var counter = 0
    for (i in 1..10_000_000_000) {
        counter += 1
    }
    return counter
}


/**
 * Both launches are executed concurrently
 */
private suspend fun doWorld() : String {
    var result = ""
    coroutineScope { // this: CoroutineScope
        val job = launch {// this: CoroutineScope
            println("World 1")
            delay(2000L)
            println("World 2")
            result="Kaustuv"
        }
        println("Hello")
        job.join()
    }
    return result
}


/*
Output

Hello
World 1
World 2
Done
 */