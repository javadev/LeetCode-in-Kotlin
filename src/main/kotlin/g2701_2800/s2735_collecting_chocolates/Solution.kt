package g2701_2800.s2735_collecting_chocolates

// #Medium #Array #Enumeration #2023_08_05_Time_237_ms_(100.00%)_Space_39.6_MB_(95.45%)

class Solution {
    fun minCost(nums: IntArray, x: Int): Long {
        val n = nums.size
        val dp = IntArray(n)
        var res: Long = 0
        for (i in 0 until n) {
            dp[i] = nums[i]
            res += nums[i].toLong()
        }
        for (i in 1 until n) {
            var sum: Long = i.toLong() * x.toLong()
            for (j in 0 until n) {
                val currIndex: Int = if (j + i >= n) j + i - n else j + i
                dp[j] = dp[j].coerceAtMost(nums[currIndex])
                sum += dp[j].toLong()
            }
            res = res.coerceAtMost(sum)
        }
        return res
    }
}
