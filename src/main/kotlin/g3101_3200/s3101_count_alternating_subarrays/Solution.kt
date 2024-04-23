package g3101_3200.s3101_count_alternating_subarrays

// #Medium #Array #Math #2024_04_23_Time_499_ms_(97.78%)_Space_70.3_MB_(80.00%)

class Solution {
    fun countAlternatingSubarrays(nums: IntArray): Long {
        var count: Long = 0
        var length: Long
        var start = 0
        var end = 1
        while (end < nums.size) {
            if (nums[end] != nums[end - 1]) {
                end++
            } else {
                length = end - start.toLong()
                count += (length * (length + 1)) / 2
                start = end
                end++
            }
        }
        length = end - start.toLong()
        count += (length * (length + 1)) / 2
        return count
    }
}
