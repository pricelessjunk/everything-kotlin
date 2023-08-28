package chapter8

import java.util.concurrent.locks.Lock

/**
 * A Higher Order Function is a function that takes another function as an argument or returns one.
 *
 * inline function used with higher order functions as parameters.
 * Executing an action inside a synchronized block.
 *
 * Inline is best used when the function type is lambda
 */
inline fun <T> synchronized(lock: Lock, action: () -> T ) : T {
    lock.lock()

    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun main() {
//    val l = Lock()
//    synchronized(l) {
//        // Some action
//    }
}