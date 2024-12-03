package g3301_3400.s3363_find_the_maximum_number_of_fruits_collected

// #Hard #Array #Dynamic_Programming #Matrix #2024_11_24_Time_53_ms_(100.00%)_Space_162_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxCollectedFruits(fruits: Array<IntArray>): Int {
        val n = fruits.size
        // Set inaccessible cells to 0
        for (i in 0..<n) {
            for (j in 0..<n) {
                if (i < j && j < n - 1 - i) {
                    fruits[i][j] = 0
                }
                if (j < i && i < n - 1 - j) {
                    fruits[i][j] = 0
                }
            }
        }
        var res = 0
        for (i in 0..<n) {
            res += fruits[i][i]
        }
        for (i in 1..<n) {
            for (j in i + 1..<n) {
                fruits[i][j] = (
                    fruits[i][j] + max(
                        fruits[i - 1][j - 1],
                        max(fruits[i - 1][j], if (j + 1 < n) fruits[i - 1][j + 1] else 0),
                    )
                    )
            }
        }
        for (j in 1..<n) {
            for (i in j + 1..<n) {
                fruits[i][j] = (
                    fruits[i][j] + max(
                        fruits[i - 1][j - 1],
                        max(fruits[i][j - 1], if (i + 1 < n) fruits[i + 1][j - 1] else 0),
                    )
                    )
            }
        }
        return res + fruits[n - 1][n - 2] + fruits[n - 2][n - 1]
    }
}
