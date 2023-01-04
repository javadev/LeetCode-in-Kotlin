package g0301_0400.s0312_burst_balloons

// #Hard #Array #Dynamic_Programming #2022_11_09_Time_210_ms_(100.00%)_Space_35.2_MB_(100.00%)

class Solution {
    fun maxCoins(nums: IntArray): Int {
        if (nums.size == 0) {
            return 0
        }
        val dp = Array(nums.size) { IntArray(nums.size) }
        return balloonBurstDp(nums, dp)
    }

    private fun balloonBurstDp(nums: IntArray, dp: Array<IntArray>): Int {
        for (gap in nums.indices) {
            var si = 0
            var ei = gap
            while (ei < nums.size) {
                val l = if (si - 1 == -1) 1 else nums[si - 1]
                val r = if (ei + 1 == nums.size) 1 else nums[ei + 1]
                var maxAns = -1e7.toInt()
                for (cut in si..ei) {
                    val leftAns = if (si == cut) 0 else dp[si][cut - 1]
                    val rightAns = if (ei == cut) 0 else dp[cut + 1][ei]
                    val myAns = leftAns + l * nums[cut] * r + rightAns
                    maxAns = Math.max(maxAns, myAns)
                }
                dp[si][ei] = maxAns
                si++
                ei++
            }
        }
        return dp[0][nums.size - 1]
    }
}
