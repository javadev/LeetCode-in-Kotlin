package g3201_3300.s3225_maximum_score_from_grid_operations

// #Hard #Array #Dynamic_Programming #Matrix #Prefix_Sum
// #2024_07_23_Time_371_ms_(100.00%)_Space_49.9_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maximumScore(grid: Array<IntArray>): Long {
        val n = grid.size
        var dp1 = LongArray(n)
        var dp2 = LongArray(n + 1)
        var dp3 = LongArray(n + 1)
        var dp12 = LongArray(n)
        var dp22 = LongArray(n + 1)
        var dp32 = LongArray(n + 1)
        var res: Long = 0
        for (i in 0 until n) {
            var sum: Long = 0
            var pre: Long = 0
            for (ints in grid) {
                sum += ints[i].toLong()
            }
            for (j in n - 1 downTo 0) {
                var s2 = sum
                dp12[j] = s2 + dp3[n]
                for (k in 0..j) {
                    s2 -= grid[k][i].toLong()
                    var v = max((dp1[k] + s2), (dp3[j] + s2))
                    v = max(v, (pre + s2))
                    dp12[j] = max(dp12[j], v)
                    if (k == j) {
                        dp32[j] = v
                        dp22[j] = dp32[j]
                        res = max(res, v)
                    }
                }
                if (i > 0) {
                    pre = max((pre + grid[j][i]), (dp2[j] + grid[j][i]))
                }
                sum -= grid[j][i].toLong()
            }
            dp32[n] = pre
            dp22[n] = dp32[n]
            res = max(res, pre)
            for (j in 1..n) {
                dp32[j] = max(dp32[j], dp32[j - 1])
            }
            var tem = dp1
            dp1 = dp12
            dp12 = tem
            tem = dp2
            dp2 = dp22
            dp22 = tem
            tem = dp3
            dp3 = dp32
            dp32 = tem
        }
        return res
    }
}
