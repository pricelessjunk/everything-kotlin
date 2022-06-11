package chapter4


/**
 * object allows to define a class and also instantiates it together.
 * It's used for singleton pattern.
 */
object CaseInsensitiveStringComparator : Comparator<String> {
    override fun compare(file1: String, file2: String): Int {
        return file1.compareTo(file2, ignoreCase = true)

    }
}

/**
 * Even if an object  is declared in a class, it will be only 1 instance for all instances of the class
 */
data class Person2(val name: String) {
    object NameComparator : Comparator<Person2> {
        override fun compare(p1: Person2, p2: Person2): Int = p1.name.compareTo(p2.name)
    }
}

fun main() {
    println(CaseInsensitiveStringComparator.compare("ABC", "abc"))


    A.bar() // Calling like a static method in java

    B.printMe()
}


/**
 * Companion Objects
 *
 * Replacement for javas static methods
 */
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

class B {
    companion object C : Base {        // Can also be named and can implement interfaces
        fun bar() = println("Companion object called")

        override fun printMe() {
            TODO("Not yet implemented")
        }
    }
}

fun A.Companion.newFun(): Nothing = TODO("Not yet Implemented")       // Extended functions of companion objects

/**
 * Anonymous inner classes. Just ignore the name in the object. Can also extend interfaces
 */
fun anonymousInnerClasses() {
    val anon : Base = object : Base {
        override fun printMe() {
            TODO("Not yet implemented")
        }
    }
}