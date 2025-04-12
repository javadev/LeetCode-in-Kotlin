package g2901_3000.s2911_minimum_changes_to_make_k_semi_palindromes

// #Hard #String #Dynamic_Programming #Two_Pointers
// #2023_12_27_Time_216_ms_(100.00%)_Space_37.2_MB_(100.00%)

import kotlin.math.min

class Solution {
    private val divisors = getDivisors()
    private lateinit var cs: CharArray
    private lateinit var cost: Array<IntArray>
    private lateinit var dp: Array<IntArray>

    fun minimumChanges(s: String, k: Int): Int {
        cs = s.toCharArray()
        val n = cs.size
        cost = Array(n - 1) { IntArray(n + 1) }
        dp = Array(n + 1) { IntArray(k + 1) }
        return calc(n, k) - k
    }

    private fun calc(i: Int, k: Int): Int {
        if (k == 1) {
            return change(0, i)
        }
        if (dp[i][k] > 0) {
            return dp[i][k]
        }
        var min = INF
        for (j in (k - 1) * 2 until (i - 1)) {
            min = min(min, calc(j, k - 1) + change(j, i))
        }
        dp[i][k] = min
        return min
    }

    private fun change(start: Int, end: Int): Int {
        if (cost[start][end] > 0) {
            return cost[start][end]
        }
        var min = INF
        var divisor = divisors[end - start]
        while (divisor != null) {
            val d = divisor.value
            var count = 0
            for (i in 0 until d) {
                var left = start + i
                var right = end - d + i
                while (left + d <= right) {
                    if (cs[left] != cs[right]) {
                        count++
                    }
                    left += d
                    right -= d
                }
            }
            if (count < min) {
                min = count
            }
            divisor = divisor.next
        }
        cost[start][end] = min + 1
        return min + 1
    }

    private fun getDivisors(): Array<Divisor?> {
        val list = arrayOfNulls<Divisor>(200 + 1)
        for (d in 1..199) {
            var len = d + d
            while (len < 200 + 1) {
                list[len] = Divisor(d, list[len])
                len += d
            }
        }
        return list
    }

    private class Divisor(var value: Int, var next: Divisor?)
    companion object {
        private const val INF = 200
    }
}
