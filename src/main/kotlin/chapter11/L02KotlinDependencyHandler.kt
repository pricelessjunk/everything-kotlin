package chapter11

class KotlinDependencyHandler {
    fun compile(name: String) {
        println("Added $name")
    }

    /**
     * The invoke function defines the support for DSL API. It basically receives
     * a function of class type KotlinDependencyHandler
     * and just calls the function again. In our example, it is the compile method.
     */
    operator fun invoke(init: KotlinDependencyHandler.() -> Unit) {
        init()
    }
}

fun main() {
    val dh = KotlinDependencyHandler()

    // This calls the invoke function
    dh {
        compile("dependency 1")
    }
}