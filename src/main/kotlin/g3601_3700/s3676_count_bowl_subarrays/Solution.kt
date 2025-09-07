package g3601_3700.s3676_count_bowl_subarrays

// #Medium #Weekly_Contest_466 #2025_09_07_Time_26_ms_(100.00%)_Space_84.36_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun bowlSubarrays(nums: IntArray): Long {
        val l = nums.size
        var ans = 0
        val stack: java.util.Deque<Int> = java.util.ArrayDeque<Int>()
        for (i in 0..<l) {
            while (stack.isNotEmpty() && nums[stack.peek()!!] < nums[i]) {
                val mid: Int = stack.pop()!!
                if (stack.isNotEmpty()) {
                    val left: Int = stack.peek()!!
                    if (min(nums[left], nums[i]) > nums[mid]) {
                        ++ans
                    }
                }
            }
            stack.push(i)
        }
        return ans.toLong()
    }
}
