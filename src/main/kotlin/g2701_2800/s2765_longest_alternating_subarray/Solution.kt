package g2701_2800.s2765_longest_alternating_subarray

// #Easy #Array #Enumeration #2023_08_11_Time_191_ms_(97.92%)_Space_42.2_MB_(41.67%)

import kotlin.math.abs

class Solution {
    fun alternatingSubarray(nums: IntArray): Int {
        var result = -1
        var prious = 0
        var sum = 1
        for (i in 1..nums.lastIndex) {
            val s = nums[i] - nums[i - 1]
            if (abs(s) != 1) {
                sum = 1
                continue
            }
            if (s == prious) {
                sum = 2
            }
            if (s != prious) {
                if (s != if (sum % 2 == 0) -1 else 1) continue
                sum++
                prious = s
            }
            result = maxOf(result, sum)
        }
        return result
    }
}
