package g2001_2100.s2009_minimum_number_of_operations_to_make_array_continuous

// #Hard #Array #Binary_Search #2023_06_23_Time_603_ms_(100.00%)_Space_60.9_MB_(100.00%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        nums.sort()
        val n = nums.size
        var duplicates = 0
        var maxContinuous = 0
        var start = 0
        var end = 0
        while (end < n) {
            if (end > 0 && nums[end] == nums[end - 1]) {
                duplicates++
            }
            while (nums[start] + n <= nums[end]) {
                start++
                if (nums[start] == nums[start - 1]) {
                    duplicates--
                }
            }
            maxContinuous = maxContinuous.coerceAtLeast(end - start + 1 - duplicates)
            end++
        }
        return n - maxContinuous
    }
}
