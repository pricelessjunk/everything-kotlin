package chapter5

/**
 * In java, lambdas are not allowed to access non final variables from outside the lambda.
 * But kotlin can.
 */
fun main() {
    var counter = 0

    val lambda = {
        for (i in 1..10) {
            if (i % 2 == 0) {
                counter++           // This variable is outside and can be accessed and changed
            }
        }
    }

    lambda()
    println(counter)    // prints 5
}