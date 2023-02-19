package general.try1

fun main(args: Array<String>) {

    val list = listOf<String?>("a", "b", null, "c")
    list.forEach { alphabet ->
        println(alphabet)
        alphabet ?: return@forEach  // Same as continue for lambdas
    }
}