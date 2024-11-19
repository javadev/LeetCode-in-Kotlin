package g1301_1400.s1388_pizza_with_3n_slices

// #Hard #Array #Dynamic_Programming #Greedy #Heap_Priority_Queue
// #2023_06_06_Time_170_ms_(100.00%)_Space_33.8_MB_(100.00%)

class Solution {
    fun maxSizeSlices(slices: IntArray): Int {
        val n = slices.size
        val third = n / 3
        return Math.max(
            maxSizeSlices(slices, 0, n - 2, third),
            maxSizeSlices(slices, 1, n - 1, third),
        )
    }

    private fun maxSizeSlices(slices: IntArray, start: Int, end: Int, parts: Int): Int {
        val dp = IntArray(slices.size)
        var res = 0
        for (i in 0 until parts) {
            var prev = 0
            var prevPrev = 0
            for (j in end downTo start) {
                val curr = dp[j]
                dp[j] = slices[j] + prevPrev
                prevPrev = prev
                prev = Math.max(curr, prev)
                res = Math.max(res, dp[j])
            }
        }
        return res
    }
}
