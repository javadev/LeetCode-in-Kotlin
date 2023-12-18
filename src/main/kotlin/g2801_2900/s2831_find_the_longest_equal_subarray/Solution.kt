package g2801_2900.s2831_find_the_longest_equal_subarray

// #Medium #Array #Hash_Table #Binary_Search #Sliding_Window
// #2023_12_18_Time_663_ms_(100.00%)_Space_57.7_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun longestEqualSubarray(nums: List<Int>, k: Int): Int {
        val count = IntArray(nums.size + 1)
        var i = 0
        var maxCount = 0
        for (j in nums.indices) {
            count[nums[j]]++
            maxCount = max(maxCount.toDouble(), count[nums[j]].toDouble()).toInt()
            if ((j - i + 1) - maxCount > k) {
                count[nums[i]]--
                i++
            }
        }
        return maxCount
    }
}
