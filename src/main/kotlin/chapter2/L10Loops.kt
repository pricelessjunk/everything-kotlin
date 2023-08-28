package chapter2

fun main(args: Array<String>) {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }

    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    for(i in 0 until 100) {
        print(fizzBuzz(i))
    }
}

fun fizzBuzz(i: Int) = when {   // When without parameters
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    else -> "$i "
}