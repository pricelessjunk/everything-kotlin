package chapter9

import java.security.Provider
import java.util.ServiceLoader

/**
 * Cannot check for instance of erased type: T
 */
// fun <T> isA(value: Any) = value is T

/**
 * This works. Because reified T's class information is stored.
 */
inline fun <reified T> isA(value: Any) = value is T

/**
 * Reified can also be used to check types in runtime.
 */
inline fun <reified T> Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for(element in this) {
        if(element is T){
            destination.add(element)
        }
    }
    return destination
}

/**
 * Reified use case
 */
inline fun <reified T> loadService(): ServiceLoader<T> {
    return ServiceLoader.load(T::class.java)
}

fun main() {
    println(isA<String>("abc"))
    println(isA<Int>(123))

    println(listOf("one",2,"three").filterIsInstance<String>())     // Prints "one", "three"

    // Example
    val serviceImpl = ServiceLoader.load(Provider.Service::class.java)
    val serviceImplEasier = loadService<Provider.Service>()                           // This is easier
}
