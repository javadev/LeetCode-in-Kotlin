package g3601_3700.s3676_count_bowl_subarrays

// #Medium #Array #Stack #Monotonic_Stack #Weekly_Contest_466
// #2025_09_14_Time_3_ms_(100.00%)_Space_79.40_MB_(50.00%)

class Solution {
    fun bowlSubarrays(nums: IntArray): Long {
        val n = nums.size
        var res = n
        var pre = 0
        for (a in nums) {
            if (a > pre) {
                res--
                pre = a
            }
        }
        pre = 0
        for (i in n - 1 downTo 0) {
            if (nums[i] > pre) {
                res--
                pre = nums[i]
            }
        }
        return res + 1L
    }
}
