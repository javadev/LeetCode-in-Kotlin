package g3601_3700.s3659_partition_array_into_k_distinct_groups

// #Medium #Array #Hash_Table #Counting #Weekly_Contest_464
// #2025_08_29_Time_6_ms_(100.00%)_Space_80.65_MB_(71.43%)

import kotlin.math.max

class Solution {
    fun partitionArray(nums: IntArray, k: Int): Boolean {
        val n = nums.size
        if (n % k != 0) {
            return false
        }
        var max = 0
        for (x in nums) {
            max = max(max, x)
        }
        val count = IntArray(max + 1)
        val limit = n / k
        for (x in nums) {
            if (++count[x] > limit) {
                return false
            }
        }
        return true
    }
}
