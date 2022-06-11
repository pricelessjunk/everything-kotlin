package chapter4

/**
 * In case of interfaces : A member in an interface is always open; you can’t declare it as final. It’s abstract if
 * it has no body, but the keyword isn’t required.
 */
abstract class Animated {

    abstract fun animate()

    open fun stopAnimation() {
        println("Called stopAnimation from parent")
    }

    /**
     * Non abstract functions are non open by default. This is essentially final
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