package g0701_0800.s0764_largest_plus_sign

// #Medium #Array #Dynamic_Programming #2023_03_08_Time_415_ms_(100.00%)_Space_49.9_MB_(100.00%)

class Solution {
    fun orderOfLargestPlusSign(n: Int, mines: Array<IntArray>): Int {
        val mat = Array(n) { BooleanArray(n) }
        for (pos in mines) {
            mat[pos[0]][pos[1]] = true
        }
        val left = Array(n) { IntArray(n) }
        val right = Array(n) { IntArray(n) }
        val up = Array(n) { IntArray(n) }
        val down = Array(n) { IntArray(n) }
        var ans = 0
        // For Left and Up only
        for (i in 0 until n) {
            for (j in 0 until n) {
                val i1 = if (j == 0) 0 else left[i][j - 1]
                left[i][j] = if (mat[i][j]) 0 else 1 + i1
                val i2 = if (i == 0) 0 else up[i - 1][j]
                up[i][j] = if (mat[i][j]) 0 else 1 + i2
            }
        }
        // For Right and Down and simoultaneously get answer
        for (i in n - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                val i1 = if (j == n - 1) 0 else right[i][j + 1]
                right[i][j] = if (mat[i][j]) 0 else 1 + i1
                val i2 = if (i == n - 1) 0 else down[i + 1][j]
                down[i][j] = if (mat[i][j]) 0 else 1 + i2
                val x = left[i][j].coerceAtMost(up[i][j]).coerceAtMost(
                    right[i][j].coerceAtMost(down[i][j])
                )
                ans = ans.coerceAtLeast(x)
            }
        }
        return ans
    }
}
