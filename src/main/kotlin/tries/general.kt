package tries

fun main() {
    //val a: IntArray = intArrayOf(1, 3, 6, 4, 1, 2,-1)
//    val m = a.filter { it > 0 }.associateWith { true }
//
//    for (i in 1..Int.MAX_VALUE) {
//        if(m.get(i) == null) {
//            println(i)
//            break
//        }
//    }
//    solution(1200)
    // println(solution2(5, 0, 2))
    //println(solution2(1, 2, 1))
    println(solution3("DABACD"))

}

fun solution(N_arg: Int) {
    var N: Int = N_arg
    var enable_print = 0

    while (N > 0) {
        if (enable_print == 0 && N % 10 != 0) {
            enable_print = 1
        }
        if (enable_print == 1) {
            print(N % 10)
        }
        N = N / 10
    }
}

// AA BB || BB AA
// BB AB AA
// BB AB
// AB AA
// AB AB
fun solution2(AA: Int, AB: Int, BB: Int): String {
    var aa = AA
    var ab = AB
    var bb = BB
    var result = ""

    while (aa!=0 && bb !=0){
        result+="AABB"
        aa-=1
        bb-=1
    }

    while (ab>0){
        result+="AB"
        ab-=1
    }

    if (bb>0){
        result="BB$result"
    }

    if (aa>0){
        result="${result}AA"
    }

    return result
}

fun solution3(S: String): String {
    var input = S
    var outputLength = -1
    while (input.length != outputLength) {
        val result = StringBuffer("")
        outputLength = input.length
        var i = 0
        while (i < input.length){
            if(i == input.length - 1){
                result.append(input[i])
                break
            }

            if ((input[i]=='A' && input[i+1]=='B') || (input[i]=='B' && input[i+1]=='A')){
                i+=2
                continue
            } else if ((input[i]=='C' && input[i+1]=='D') || (input[i]=='D' && input[i+1]=='C')){
                i+=2
                continue
            } else {
                result.append(input[i])
                i+=1
            }
        }

        input=result.toString()
    }

    return input
}
