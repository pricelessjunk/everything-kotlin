package chapter4


/**
 * Open classes and methods in Kotlin are equivalent to the opposite of final in Java, an open method is overridable
 * and an open class is extendable in Kotlin.
 *
 *
 * In case of interfaces or abstract classes : A member in an interface is always open; you can’t declare it as final.
 * It’s abstract if it has no body, but the keyword isn’t required.
 */
abstract class Animated {

    abstract fun animate()

    /**
     * Without the open keyword, the method becomes final.
     */
    open fun stopAnimation() {
        println("Called stopAnimation from parent")
    }

    /**
     * Non-abstract functions are non open by default. This is essentially final
     */
    fun animateTwice() {

    }
}

class AnimatedChild : Animated() {
    override fun animate() = println("in animated child")

    override fun stopAnimation() {
        super.stopAnimation()
        println("Called stopAnimation from child")
    }
}


fun main() {
    AnimatedChild()
}