package g2501_2600.s2518_number_of_great_partitions

// #Hard #Array #Dynamic_Programming #2023_07_04_Time_164_ms_(100.00%)_Space_34.4_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countPartitions(nums: IntArray, k: Int): Int {
        // edge cases
        val n = nums.size
        var sum: Long = 0
        for (num in nums) {
            sum += num.toLong()
        }
        if (sum < 2L * k) {
            return 0
        }
        // normal cases
        val dp = IntArray(k)
        dp[0] = 1
        for (num in nums) {
            for (i in k - 1 downTo num) {
                dp[i] = (dp[i] + dp[i - num]) % MOD
            }
        }
        var smaller = 0
        for (i in 0 until k) {
            smaller = (smaller + dp[i]) % MOD
        }
        return (pow(2, n) - smaller * 2 % MOD + MOD) % MOD
    }

    private fun pow(num: Long, pow: Int): Int {
        var num = num
        var pow = pow
        var result: Long = 1
        while (pow != 0) {
            if (pow % 2 == 1) {
                result = result * num % MOD
            }
            pow /= 2
            num = num * num % MOD
        }
        return result.toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
