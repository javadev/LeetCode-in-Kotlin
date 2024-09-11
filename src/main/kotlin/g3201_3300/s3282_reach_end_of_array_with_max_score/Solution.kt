package g3201_3300.s3282_reach_end_of_array_with_max_score

// #Medium #Array #Greedy #2024_09_11_Time_789_ms_(90.91%)_Space_77.1_MB_(36.36%)

import kotlin.math.max

class Solution {
    fun findMaximumScore(nums: List<Int>): Long {
        var res: Long = 0
        var ma: Long = 0
        for (num in nums) {
            res += ma
            ma = max(ma, num.toLong())
        }
        return res
    }
}
