package g3701_3800.s3788_maximum_score_of_a_split

// #Medium #Array #Prefix_Sum #Senior #Weekly_Contest_482
// #2026_05_22_Time_2_ms_(100.00%)_Space_113.41_MB_(96.82%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maximumScore(nums: IntArray): Long {
        var ans = nums[0] - nums[1].toLong()
        var prefixSum: Long = 0
        val n = nums.size
        var min = nums[n - 1]
        for (i in 0..<n - 1) {
            prefixSum += nums[i].toLong()
        }
        for (i in n - 2 downTo 0) {
            ans = max(ans, prefixSum - min)
            min = min(min, nums[i])
            prefixSum -= nums[i].toLong()
        }
        return ans
    }
}
