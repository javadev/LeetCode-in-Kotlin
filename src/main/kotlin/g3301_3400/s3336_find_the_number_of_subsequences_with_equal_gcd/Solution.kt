package g3301_3400.s3336_find_the_number_of_subsequences_with_equal_gcd

// #Hard #Array #Dynamic_Programming #Math #Number_Theory
// #2024_10_29_Time_324_ms_(100.00%)_Space_109.1_MB_(33.33%)

class Solution {
    private lateinit var dp: Array<Array<IntArray>>

    fun subsequencePairCount(nums: IntArray): Int {
        dp = Array<Array<IntArray>>(nums.size) { Array<IntArray>(201) { IntArray(201) } }
        for (each in dp) {
            for (each1 in each) {
                each1.fill(-1)
            }
        }
        return findPairs(nums, 0, 0, 0)
    }

    private fun findPairs(nums: IntArray, index: Int, gcd1: Int, gcd2: Int): Int {
        if (index == nums.size) {
            if (gcd1 > 0 && gcd2 > 0 && gcd1 == gcd2) {
                return 1
            }
            return 0
        }
        if (dp[index][gcd1][gcd2] != -1) {
            return dp[index][gcd1][gcd2]
        }
        val currentNum = nums[index]
        var count: Long = 0
        count += findPairs(nums, index + 1, gcd(gcd1, currentNum), gcd2).toLong()
        count += findPairs(nums, index + 1, gcd1, gcd(gcd2, currentNum)).toLong()
        count += findPairs(nums, index + 1, gcd1, gcd2).toLong()
        dp[index][gcd1][gcd2] = ((count % MOD) % MOD).toInt()
        return dp[index][gcd1][gcd2]
    }

    private fun gcd(a: Int, b: Int): Int {
        return if ((b == 0)) a else gcd(b, a % b)
    }

    companion object {
        private const val MOD = 1000000007
    }
}
