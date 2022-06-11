package chapter4

interface Clickable {
    fun click()

    fun showOff() = println("I'm clickable")    // Default implementation
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")       // override is mandatory unlike java

    /**
     * Since, both interfaces contain the showOff() method, kotlin throws this compile error
     * Class 'Button' must override public open fun showOff(): Unit defined in chapter4.Clickable because it inherits multiple interface methods of it
     *
     * This can be solved by override the parent showOff() methods with your own one
     */
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    Button().click()
    Button().showOff()
}