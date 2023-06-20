package chapter3

fun main() {
    // Multiple delimiters
    println("12.345-6.A".split(".", "-"))   // out [12, 345, 6, A]

    parsePath("path/some/file.jpg")

    multiLinedTripleQuotedString()
}

fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()     // Triple quoted strings escape regex automatically

    val matchResult = regex.matchEntire(path)

    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun multiLinedTripleQuotedString() {
    val kotlinLogo = """| //
                       .|//
                       .|/ \"""
    println(kotlinLogo.trimMargin("."))
}