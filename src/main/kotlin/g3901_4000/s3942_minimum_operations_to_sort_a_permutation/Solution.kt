package g3901_4000.s3942_minimum_operations_to_sort_a_permutation

// #Medium #Array #Staff #Weekly_Contest_503 #2026_09_29_Time_2_ms_(100.00%)_Space_94.88_MB_(91.76%)

import kotlin.math.min

class Solution {
    fun minOperations(nums: IntArray): Int {
        var ans = -1
        var zeroIdx = 0
        var prev = nums[0]
        var forward = true
        for (i in 1..<nums.size) {
            if (nums[i] == 0) {
                zeroIdx = i
                // new start
            } else if (nums[i] != (prev + 1)) {
                forward = false
                break
            }
            prev = nums[i]
        }
        if (forward) {
            ans = min(zeroIdx, nums.size - zeroIdx + 2)
        }
        zeroIdx = nums.size - 1
        prev = nums[nums.size - 1]
        var backward = true
        for (i in nums.size - 2 downTo 0) {
            if (nums[i] == 0) {
                zeroIdx = i
                // new start
            } else if (nums[i] != (prev + 1)) {
                backward = false
                break
            }
            prev = nums[i]
        }
        if (backward) {
            val b = min(nums.size - zeroIdx, zeroIdx + 2)
            ans = if (ans == -1) {
                b
            } else {
                min(ans, b)
            }
        }
        return ans
    }
}
