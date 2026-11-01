package g3801_3900.s3880_minimum_absolute_difference_between_two_values

// #Easy #Array #Enumeration #Mid_Level #Biweekly_Contest_179
// #2026_08_13_Time_1_ms_(99.36%)_Space_46.20_MB_(85.90%)

import kotlin.math.min

class Solution {
    fun minAbsoluteDifference(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        val n = nums.size
        var prev = -1
        var last = -1
        for (i in 0..<n) {
            if (prev == -1) {
                if (nums[i] == 1) {
                    prev = 1
                    last = i
                } else if (nums[i] == 2) {
                    prev = 2
                    last = i
                }
            } else {
                if (nums[i] == 1) {
                    if (prev == 2) {
                        min = min(min, i - last)
                        prev = 1
                    }
                    last = i
                } else if (nums[i] == 2) {
                    if (prev == 1) {
                        min = min(min, i - last)
                        prev = 2
                    }
                    last = i
                }
            }
        }
        return if (min != Int.MAX_VALUE) min else -1
    }
}
