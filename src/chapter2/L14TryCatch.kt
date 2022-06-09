package chapter2

import java.io.BufferedReader

/**
 * Try as an expression
 */
fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}