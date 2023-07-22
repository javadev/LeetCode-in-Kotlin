package g0801_0900.s0813_largest_sum_of_averages

// #Medium #Array #Dynamic_Programming #2023_03_17_Time_160_ms_(100.00%)_Space_35.3_MB_(100.00%)

class Solution {
    fun largestSumOfAverages(nums: IntArray, k: Int): Double {
        return helper(nums, k, 0, Array(k + 1) { arrayOfNulls(nums.size) })
    }

    private fun helper(nums: IntArray, k: Int, idx: Int, memo: Array<Array<Double?>>): Double {
        if (memo[k][idx] != null) {
            return memo[k][idx]!!
        }
        var maxAvg = 0.0
        var sum = 0.0
        for (i in idx..nums.size - k) {
            sum += nums[i].toDouble()
            if (k - 1 > 0) {
                maxAvg = maxAvg.coerceAtLeast(sum / (i - idx + 1) + helper(nums, k - 1, i + 1, memo))
            } else if (i == nums.size - 1) {
                maxAvg = maxAvg.coerceAtLeast(sum / (i - idx + 1))
            }
        }
        memo[k][idx] = maxAvg
        return maxAvg
    }
}
