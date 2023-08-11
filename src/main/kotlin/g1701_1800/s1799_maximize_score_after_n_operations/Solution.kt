package g1701_1800.s1799_maximize_score_after_n_operations

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Backtracking #Bitmask #Number_Theory
// #2023_06_18_Time_347_ms_(73.17%)_Space_36.4_MB_(81.30%)

class Solution {
    fun maxScore(nums: IntArray): Int {
        val n = nums.size
        val memo = arrayOfNulls<Int>(1 shl n)
        return helper(1, 0, nums, memo)
    }

    private fun helper(operationNumber: Int, mask: Int, nums: IntArray, memo: Array<Int?>): Int {
        val n = nums.size
        if (memo[mask] != null) {
            return memo[mask]!!
        }
        if (operationNumber > n / 2) {
            return 0
        }
        var maxScore = Int.MIN_VALUE
        for (i in 0 until n) {
            if (mask and (1 shl i) == 0) {
                for (j in i + 1 until n) {
                    if (mask and (1 shl j) == 0) {
                        val score = operationNumber * gcd(nums[i], nums[j])
                        val score2 = helper(operationNumber + 1, mask or (1 shl i) or (1 shl j), nums, memo)
                        maxScore = Math.max(maxScore, score + score2)
                    }
                }
            }
        }
        memo[mask] = maxScore
        return maxScore
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else gcd(b, a % b)
    }
}
