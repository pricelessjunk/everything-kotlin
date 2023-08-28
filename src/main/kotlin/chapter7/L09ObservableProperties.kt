package chapter7

import kotlin.properties.Delegates

/**
 * prints "-1 is old and new is 20 for property var chapter7.Person3.age: kotlin.Int. This is observed"
 */
class Person3() {
    var age: Int by Delegates.observable(-1) { property, oldValue, newValue ->
        println("$oldValue is old and new is $newValue for property $property. This is observed")
    }
}


fun main() {
    val p = Person3()
    println(p.age) // prints -1
    p.age = 20
    println(p.age) // prints 20
}