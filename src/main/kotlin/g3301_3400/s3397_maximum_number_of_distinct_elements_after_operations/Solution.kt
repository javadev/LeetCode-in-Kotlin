package g3301_3400.s3397_maximum_number_of_distinct_elements_after_operations

// #Medium #Array #Sorting #Greedy #2024_12_22_Time_517_ms_(100.00%)_Space_61.2_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxDistinctElements(nums: IntArray, k: Int): Int {
        nums.sort()
        var next = nums[0] - k + 1
        val n = nums.size
        var ans = 1
        for (i in 1..<n) {
            if (nums[i] + k < next) {
                continue
            }
            next = max(next, (nums[i] - k))
            ans++
            next++
        }
        return ans
    }
}
