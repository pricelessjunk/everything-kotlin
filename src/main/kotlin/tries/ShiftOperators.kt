package tries

fun main(){
    var buffer = UByteArray(UInt.SIZE_BYTES)
    val v = 20
    for (i in 0 until  Int.SIZE_BYTES) {
        buffer[i] = (v shl (i*8)).toUByte()
    }
    println(buffer)

    val b = 2
    println(((b shr 8)).toString(2))
}