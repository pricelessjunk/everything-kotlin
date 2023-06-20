package chapter2

import chapter2.Color.*


fun main(args: Array<String>) {
    println(getWarmth(Color.GREEN))

    println(mix(VIOLET, BLUE))
}

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}


fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {      // Order in Set is not important
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty color")
}
