package g2701_2800.s2789_largest_element_in_an_array_after_merge_operations

// #Medium #Array #Greedy #Prefix_Sum #2023_08_08_Time_683_ms_(73.68%)_Space_70.8_MB_(42.10%)

class Solution {
    fun maxArrayValue(nums: IntArray): Long {
        var ans = nums[nums.size - 1].toLong()
        for (i in nums.size - 1 downTo 1) {
            if (ans >= nums[i - 1]) {
                ans += nums[i - 1].toLong()
            } else {
                ans = nums[i - 1].toLong()
            }
        }
        return ans
    }
}
