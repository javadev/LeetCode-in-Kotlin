package g3501_3600.s3537_fill_a_special_grid

// #Medium #2025_05_04_Time_2_ms_(100.00%)_Space_88.71_MB_(61.54%)

import kotlin.math.pow

class Solution {
    fun specialGrid(n: Int): Array<IntArray> {
        if (n == 0) {
            return arrayOf<IntArray>(intArrayOf(0))
        }
        val len = 2.0.pow(n.toDouble()).toInt()
        val ans = Array<IntArray>(len) { IntArray(len) }
        val num = intArrayOf(2.0.pow(2.0 * n).toInt() - 1)
        backtrack(ans, len, len, 0, 0, num)
        return ans
    }

    private fun backtrack(ans: Array<IntArray>, m: Int, n: Int, x: Int, y: Int, num: IntArray) {
        if (m == 2 && n == 2) {
            ans[x][y] = num[0]
            ans[x + 1][y] = num[0] - 1
            ans[x + 1][y + 1] = num[0] - 2
            ans[x][y + 1] = num[0] - 3
            num[0] -= 4
            return
        }
        backtrack(ans, m / 2, n / 2, x, y, num)
        backtrack(ans, m / 2, n / 2, x + m / 2, y, num)
        backtrack(ans, m / 2, n / 2, x + m / 2, y + n / 2, num)
        backtrack(ans, m / 2, n / 2, x, y + n / 2, num)
    }
}
