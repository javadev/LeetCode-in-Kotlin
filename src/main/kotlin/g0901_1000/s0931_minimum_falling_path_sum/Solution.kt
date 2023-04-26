package g0901_1000.s0931_minimum_falling_path_sum

// #Medium #Array #Dynamic_Programming #Matrix #Dynamic_Programming_I_Day_13
// #2023_04_26_Time_201_ms_(84.21%)_Space_36.7_MB_(94.74%)

class Solution {
    fun minFallingPathSum(matrix: Array<IntArray>): Int {
        val l = matrix[0].size
        var arr = matrix[0]
        for (i in 1 until matrix.size) {
            val cur = IntArray(l)
            for (j in 0 until l) {
                var left = Int.MAX_VALUE
                var right = Int.MAX_VALUE
                val curCell = arr[j]
                if (j > 0) {
                    left = arr[j - 1]
                }
                if (j < l - 1) {
                    right = arr[j + 1]
                }
                cur[j] = matrix[i][j] + left.coerceAtMost(right.coerceAtMost(curCell))
            }
            arr = cur
        }
        var min = Int.MAX_VALUE
        for (i in 0 until l) {
            if (arr[i] < min) {
                min = arr[i]
            }
        }
        return min
    }
}
