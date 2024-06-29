package g3101_3200.s3196_maximize_total_cost_of_alternating_subarrays

// #Medium #Array #Dynamic_Programming #2024_06_29_Time_496_ms_(73.81%)_Space_64.2_MB_(80.95%)

import kotlin.math.max

class Solution {
    fun maximumTotalCost(nums: IntArray): Long {
        val n = nums.size
        var addResult = nums[0].toLong()
        var subResult = nums[0].toLong()
        for (i in 1 until n) {
            val tempAdd = (max(addResult.toDouble(), subResult.toDouble()) + nums[i]).toLong()
            val tempSub = addResult - nums[i]
            addResult = tempAdd
            subResult = tempSub
        }
        return max(addResult, subResult)
    }
}
