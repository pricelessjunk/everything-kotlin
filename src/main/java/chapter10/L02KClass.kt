package chapter10

import chapter9.Animal
import kotlin.reflect.KClass

fun main() {
    val animal = Animal()

    val kClass: KClass<Animal> = animal.javaClass.kotlin
    println(kClass.simpleName)
    println(kClass.qualifiedName)
    println(kClass.members)
    println(kClass.constructors)
    println(kClass.nestedClasses)

//    Other methods
//    val simpleName: String?
//    val qualifiedName: String?
//    val members: Collection<KCallable<*>>
//    val constructors: Collection<KFunction<T>>
//    val nestedClasses: Collection<KClass<*>>
}