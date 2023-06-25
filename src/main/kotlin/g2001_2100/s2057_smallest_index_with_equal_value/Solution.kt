package g2001_2100.s2057_smallest_index_with_equal_value

// #Easy #Array #2023_06_25_Time_178_ms_(100.00%)_Space_37.8_MB_(80.00%)

class Solution {
    fun smallestEqual(nums: IntArray): Int {
        for (i in nums.indices) {
            if (i % 10 == nums[i]) {
                return i
            }
        }
        return -1
    }
}
