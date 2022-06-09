package chapter2


fun main(args: Array<String>) {
    recognize('4')
}

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    !in 's'..'t' -> "Just the not in condition"        // !in
    else -> "I don't know..."
}