package chapter8

import java.io.BufferedReader
import java.io.FileReader

/**
 * Used instead of try-with-resources
 *
 * Same as -
 * try (BufferedReader br2 = new BufferedReader(new FileReader(path))) {
 *         return br.readLine();
 *     }
 */
fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }


}

