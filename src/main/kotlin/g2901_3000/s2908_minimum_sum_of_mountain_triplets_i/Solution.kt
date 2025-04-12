package g2901_3000.s2908_minimum_sum_of_mountain_triplets_i

// #Easy #Array #2023_12_27_Time_174_ms_(73.33%)_Space_35.1_MB_(86.67%)

import kotlin.math.min

class Solution {
    fun minimumSum(nums: IntArray): Int {
        var output = Int.MAX_VALUE
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                if (nums[i] > nums[j]) {
                    break
                }
                for (k in j + 1 until nums.size) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        val min = nums[i] + nums[k] + nums[j]
                        output = min(min, output)
                    }
                }
            }
        }
        return if (output == Int.MAX_VALUE) -1 else output
    }
}
