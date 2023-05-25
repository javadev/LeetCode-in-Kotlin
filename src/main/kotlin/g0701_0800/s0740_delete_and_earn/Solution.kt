package g0701_0800.s0740_delete_and_earn

// #Medium #Array #Hash_Table #Dynamic_Programming #Dynamic_Programming_I_Day_3
// #2023_03_03_Time_192_ms_(100.00%)_Space_37_MB_(88.89%)

class Solution {
    fun deleteAndEarn(nums: IntArray): Int {
        val sum = IntArray(10001)
        var min = 10001
        var max = 0
        for (num in nums) {
            sum[num] += num
            min = num.coerceAtMost(min)
            max = num.coerceAtLeast(max)
        }
        val dp = IntArray(max + 1)
        dp[min] = sum[min]
        for (i in min + 1..max) {
            dp[i] = dp[i - 1].coerceAtLeast(dp[i - 2] + sum[i])
        }
        return dp[max]
    }
}
