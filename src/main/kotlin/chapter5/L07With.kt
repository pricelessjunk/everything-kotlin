package chapter5

import kotlin.text.StringBuilder

fun main() {

}

fun original() : String {
    val sb = StringBuilder()

    sb.append("s")
    sb.append("b")
    return sb.toString()
}

/**
 * works also without the this
 */
fun withWith() : String {
    return with(StringBuilder()) {
        this.append("s")
        this.append("b")
        this.toString()
    }
}