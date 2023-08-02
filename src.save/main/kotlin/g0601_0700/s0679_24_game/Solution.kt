package g0601_0700.s0679_24_game

// #Hard #Array #Math #Backtracking #2023_02_16_Time_175_ms_(100.00%)_Space_34.7_MB_(100.00%)

import kotlin.math.abs

class Solution {
    private fun backtrack(list: Array<Double>, n: Int): Boolean {
        if (n == 1) {
            return abs(list[0] - 24) < EPS
        }
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val a = list[i]
                val b = list[j]
                list[j] = list[n - 1]
                list[i] = a + b
                if (backtrack(list, n - 1)) {
                    return true
                }
                list[i] = a - b
                if (backtrack(list, n - 1)) {
                    return true
                }
                list[i] = b - a
                if (backtrack(list, n - 1)) {
                    return true
                }
                list[i] = a * b
                if (backtrack(list, n - 1)) {
                    return true
                }
                if (Math.abs(b) > EPS) {
                    list[i] = a / b
                    if (backtrack(list, n - 1)) {
                        return true
                    }
                }
                if (Math.abs(a) > EPS) {
                    list[i] = b / a
                    if (backtrack(list, n - 1)) {
                        return true
                    }
                }
                list[i] = a
                list[j] = b
            }
        }
        return false
    }

    fun judgePoint24(nums: IntArray): Boolean {
        val a = nums.map { it.toDouble() }.toTypedArray()
        return backtrack(a, a.size)
    }

    companion object {
        private const val EPS = 1e-6
    }
}
