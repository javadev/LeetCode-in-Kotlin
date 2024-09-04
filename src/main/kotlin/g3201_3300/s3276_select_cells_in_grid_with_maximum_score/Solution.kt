package g3201_3300.s3276_select_cells_in_grid_with_maximum_score

// #Hard #Array #Dynamic_Programming #Matrix #Bit_Manipulation #Bitmask
// #2024_09_04_Time_213_ms_(92.31%)_Space_39.8_MB_(84.62%)

import kotlin.math.max

class Solution {
    fun maxScore(grid: List<List<Int>>): Int {
        val n = grid.size
        val m = grid[0].size
        val arr = Array(n * m) { IntArray(2) }
        for (i in 0 until n) {
            val l = grid[i]
            for (j in l.indices) {
                arr[i * m + j][0] = l[j]
                arr[i * m + j][1] = i
            }
        }
        arr.sortWith { a: IntArray, b: IntArray -> b[0] - a[0] }
        var dp = IntArray(1 shl n)
        var i = 0
        while (i < arr.size) {
            val seen = BooleanArray(n)
            seen[arr[i][1]] = true
            val v = arr[i][0]
            i++
            while (i < arr.size && arr[i][0] == v) {
                seen[arr[i][1]] = true
                i++
            }
            val next = dp.copyOf(dp.size)
            for (j in 0 until n) {
                if (seen[j]) {
                    val and = ((1 shl n) - 1) xor (1 shl j)
                    var k = and
                    while (k > 0) {
                        next[k or (1 shl j)] = max(next[k or (1 shl j)], (dp[k] + v))
                        k = (k - 1) and and
                    }
                    next[1 shl j] = max(next[1 shl j], v)
                }
            }
            dp = next
        }
        return dp[dp.size - 1]
    }
}
