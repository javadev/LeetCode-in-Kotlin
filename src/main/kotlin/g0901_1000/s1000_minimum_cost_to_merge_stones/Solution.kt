package g0901_1000.s1000_minimum_cost_to_merge_stones

// #Hard #Array #Dynamic_Programming #2023_05_13_Time_152_ms_(75.00%)_Space_35.5_MB_(12.50%)

import java.util.Arrays

class Solution {
    private lateinit var memo: Array<IntArray>
    private lateinit var prefixSum: IntArray
    fun mergeStones(stones: IntArray, k: Int): Int {
        val n = stones.size
        if ((n - 1) % (k - 1) != 0) {
            return -1
        }
        memo = Array(n) { IntArray(n) }
        for (arr in memo) {
            Arrays.fill(arr, -1)
        }
        prefixSum = IntArray(n + 1)
        for (i in 1 until n + 1) {
            prefixSum[i] = prefixSum[i - 1] + stones[i - 1]
        }
        return dp(0, n - 1, k)
    }

    private fun dp(left: Int, right: Int, k: Int): Int {
        if (memo[left][right] > 0) {
            return memo[left][right]
        }
        if (right - left + 1 < k) {
            memo[left][right] = 0
            return memo[left][right]
        }
        if (right - left + 1 == k) {
            memo[left][right] = prefixSum[right + 1] - prefixSum[left]
            return memo[left][right]
        }
        var `val` = Int.MAX_VALUE
        var i = 0
        while (left + i + 1 <= right) {
            `val` = Math.min(`val`, dp(left, left + i, k) + dp(left + i + 1, right, k))
            i += k - 1
        }
        if ((right - left) % (k - 1) == 0) {
            `val` += prefixSum[right + 1] - prefixSum[left]
        }
        memo[left][right] = `val`
        return `val`
    }
}
