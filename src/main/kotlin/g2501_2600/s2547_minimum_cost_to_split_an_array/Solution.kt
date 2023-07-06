package g2501_2600.s2547_minimum_cost_to_split_an_array

// #Hard #Array #Hash_Table #Dynamic_Programming #Counting
// #2023_07_06_Time_400_ms_(100.00%)_Space_50.3_MB_(100.00%)

class Solution {
    fun minCost(nums: IntArray, k: Int): Int {
        val n = nums.size
        val dp = IntArray(n)
        dp.fill(-1)
        val len = Array(n) { IntArray(n) }
        for (r in len) r.fill(0)
        for (i in 0 until n) {
            val count = IntArray(n)
            count.fill(0)
            var c = 0
            for (j in i until n) {
                count[nums[j]] += 1
                if (count[nums[j]] == 2) c += 2 else if (count[nums[j]] > 2) c += 1
                len[i][j] = c
            }
        }
        return f(0, nums, k, len, dp)
    }

    private fun f(ind: Int, nums: IntArray, k: Int, len: Array<IntArray>, dp: IntArray): Int {
        if (ind >= nums.size) return 0
        if (dp[ind] != -1) return dp[ind]
        dp[ind] = Int.MAX_VALUE
        for (i in ind until nums.size) {
            val current = len[ind][i] + k
            val next = f(i + 1, nums, k, len, dp)
            dp[ind] = dp[ind].coerceAtMost(current + next)
        }
        return dp[ind]
    }
}
