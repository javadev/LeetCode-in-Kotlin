package g0801_0900.s0801_minimum_swaps_to_make_sequences_increasing

// #Hard #Array #Dynamic_Programming #2023_03_15_Time_617_ms_(83.33%)_Space_58.5_MB_(66.67%)

class Solution {
    fun minSwap(listA: IntArray, listB: IntArray): Int {
        val dp = IntArray(2)
        dp[1] = 1
        for (i in 1 until listA.size) {
            var a = Int.MAX_VALUE
            var b = Int.MAX_VALUE
            if (listA[i] > listA[i - 1] && listB[i] > listB[i - 1]) {
                a = dp[0]
                b = dp[1]
            }
            if (listA[i] > listB[i - 1] && listB[i] > listA[i - 1]) {
                a = a.coerceAtMost(dp[1])
                b = b.coerceAtMost(dp[0])
            }
            dp[0] = a
            dp[1] = b + 1
        }
        return dp[0].coerceAtMost(dp[1])
    }
}
