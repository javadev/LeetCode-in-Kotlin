package g3101_3200.s3149_find_the_minimum_cost_array_permutation

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2024_05_15_Time_329_ms_(100.00%)_Space_40.9_MB_(66.67%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    private fun findMinScore(mask: Int, prevNum: Int, nums: IntArray, dp: Array<IntArray>): Int {
        val n = nums.size
        if (Integer.bitCount(mask) == n) {
            dp[mask][prevNum] = abs((prevNum - nums[0]))
            return dp[mask][prevNum]
        }
        if (dp[mask][prevNum] != -1) {
            return dp[mask][prevNum]
        }
        var minScore = Int.MAX_VALUE
        for (currNum in 0 until n) {
            if ((mask shr currNum and 1 xor 1) == 1) {
                val currScore = (
                    abs((prevNum - nums[currNum])) + findMinScore(
                        mask or (1 shl currNum),
                        currNum,
                        nums,
                        dp
                    )
                    )
                minScore = min(minScore, currScore)
            }
        }
        return minScore.also { dp[mask][prevNum] = it }
    }

    private fun constructMinScorePermutation(n: Int, nums: IntArray, dp: Array<IntArray>): IntArray {
        val permutation = IntArray(n)
        var i = 0
        permutation[i++] = 0
        var prevNum = 0
        var mask = 1
        while (i < n) {
            for (currNum in 0 until n) {
                if ((mask shr currNum and 1 xor 1) == 1) {
                    val currScore =
                        (abs((prevNum - nums[currNum])) + dp[mask or (1 shl currNum)][currNum])
                    val minScore = dp[mask][prevNum]
                    if (currScore == minScore) {
                        permutation[i++] = currNum
                        prevNum = currNum
                        break
                    }
                }
            }
            mask = mask or (1 shl prevNum)
        }
        return permutation
    }

    fun findPermutation(nums: IntArray): IntArray {
        val n = nums.size
        val dp = Array(1 shl n) { IntArray(n) }
        for (row in dp) {
            row.fill(-1)
        }
        findMinScore(1, 0, nums, dp)
        return constructMinScorePermutation(n, nums, dp)
    }
}
