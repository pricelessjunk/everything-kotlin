package `try`

import java.io.File

fun main(args: Array<String>) {
    val lines = readFileAsLinesUsingUseLines(args[0])

    var progress = 0
    var count = 0
    var arr: Array<DoubleArray>? = null
    val names = mutableListOf<String>()
    var nameCount = 0


    for (line in lines) {
        if (!line.startsWith('#') && line.isNotEmpty()) {
            if (progress == 0) {
                count = line.toInt()
                arr = Array(count) { DoubleArray(count) }
                progress++
            } else if (progress == 1) {
                names.add(line)
                nameCount++

                if (nameCount == count) {
                    progress++
                }
            } else if (progress == 2) {
                processLine(arr!!, line, count)
            }
        }
    }

    arr?.forEach { println(it) };

}

fun readFileAsLinesUsingUseLines(fileName: String): List<String> = File(fileName).useLines { it.toList() }

fun processLine(arr: Array<DoubleArray>, line: String, count: Int) {
    val splits = line.split(' ')
    var amount: Double = splits[0].toDouble()
    val payer: Int = splits[1].toInt() - 1
    val payee: String = splits[2]

    if (payee == "even") {
        amount /= count

        for(i in 0 until count) {
            arr[payer][i] += amount;
        }
    }


}