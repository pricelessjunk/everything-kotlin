package chapter4


/**
 * If all the constructor parameters have default values, the compiler gen-
erates an additional constructor without parameters that uses all the default
values. That makes it easier to use Kotlin with libraries that instantiate classes
via parameterless constructors.
 */

class User(val nickname: String)

// Same as
class UserAlternative constructor(_nickname: String) {
    val nickname: String

    init {          // Initializes at object creation
        nickname = _nickname
    }
}

/**
 * Constuctors with default
 */
class User2(val nickname: String,
           val isSubscribed: Boolean = true)        // These are primary Constructors


/**
 * Private constructors
 */
class Secretive private constructor() {}


/**
 * Auto calling parent constructor
 */
open class Parent {
    constructor() {                     // These are secondary constructors
        println("parent no param")
    }

    constructor(c: String) {
        println("In super $c")
    }
}

class Child : Parent {
    constructor(c : String) : super(c) {
        println("In child")     // Super contructor gets called first
    }

    constructor(a: Int) : this(a,"delegated") {  // Delegates to the bottom constructor
        println("After return from delegation a $a")
    }

    constructor(a: Int, c: String) : super(c) {
        println("After delegation a $a")
    }
}

fun main() {
    Child("lala")

    Child(1)
}