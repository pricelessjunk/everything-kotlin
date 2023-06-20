package chapter9

/**
 * Here T is marked as covariant. Meaning, `Producer<Int>` can be cast into `Producer<Number>`. The out keyword does that.
 *
 * Restriction - T can be used only in out positions. Meaning in the return position
 * Error message: Type parameter T is declared as 'out' but occurs in 'in' position in type T
 */
interface Producer<out T> {
    fun produce(/*t: T*/): T
}

// ------Bigger example ----------

open class Animal {
    fun feed() {
        println("Animal::feed")
    }
}

class Cat : Animal() {
    fun cleanLitter() {
        println("Cat::cleanLitter")
    }
}

/**
 * This is where the out is declared
 */
class Herd<out T : Animal> {
    val animals: List<T> = listOf()
    val size: Int get() = animals.size

    operator fun get(i: Int): T {
        return animals.get(i)
    }
}

/**
 * The out is the reason why `Herd<Cat>` can be cast into `Herd<Animal>`
 */
fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    feedAll(cats)
}