package chapter4

/**
 *  Decorater pattern
 *
 * Where a class is added as a field instead of inheriting from it.
 * The methods are just delegated to the original class.
 *
 * The by keyword does this for all methods by default
 */

//class DelegatingCollection<T> : Collection<T> {
//    private val innerList = arrayListOf<T>()
//    override val size: Int get() = innerList.size
//    override fun isEmpty(): Boolean = innerList.isEmpty()
//    override fun contains(element: T): Boolean = innerList.contains(element)
//    override fun iterator(): Iterator<T> = innerList.iterator()
//    override fun containsAll(elements: Collection<T>): Boolean =
//        innerList.containsAll(elements)
//
//}

class DelegatingCollection<T>(
    innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList {

}

// ------------ Another Example -----------------------

interface Base {
    fun printMe()
}

open class BaseImpl(val x: Int) : Base {
    override fun printMe() { println(x) }
}

class Derived(b: Base) : Base by b          // A normal class with the base class as a field. delegating the public method on the object b

class Derived2(val y : Int) : BaseImpl(y)   // Actual derived from base class

fun main() {
    val b = BaseImpl(10)

    Derived(b).printMe() // prints 10

    Derived2(2).printMe()   // prints 2
}