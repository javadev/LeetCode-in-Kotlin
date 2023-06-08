package g1201_1300.s1218_longest_arithmetic_subsequence_of_given_difference

// #Medium #Array #Hash_Table #Dynamic_Programming
class Solution {
    fun longestSubsequence(arr: IntArray, difference: Int): Int {
        var res = 0
        val dp = IntArray(20001)
        for (j in arr) {
            val cur = j + 10000
            val last = j - difference + 10000
            if (last < 0 || last > 20000) {
                dp[cur] = Math.max(dp[cur], 1)
            } else {
                dp[cur] = Math.max(dp[cur], dp[last] + 1)
            }
            res = Math.max(res, dp[cur])
        }
        return res
    }
}
