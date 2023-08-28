package chapter2

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello $name")

    /*
     Or can be directly substituted to
     */

    println("Hello ${if (args.size > 0) args[0] else "Kotlin"}")    // Double quotes can be nested as long as they are within the function
}