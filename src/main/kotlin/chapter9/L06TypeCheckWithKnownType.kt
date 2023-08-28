package chapter9

/**
 * Type checking is done here in line 7
 */
fun printSum(c: Collection<Int>) {
    if (c is Set<Int>) {
        println(c.sum())
    } else {
        if(c is List<Int>){
            println("in else")
        }
    }
}

fun main(){
    printSum(listOf(1,2,3))
}