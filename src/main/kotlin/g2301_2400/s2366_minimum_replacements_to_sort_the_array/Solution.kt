package g2301_2400.s2366_minimum_replacements_to_sort_the_array

// #Hard #Array #Math #Greedy #2023_07_02_Time_433_ms_(100.00%)_Space_57.9_MB_(100.00%)

class Solution {
    fun minimumReplacement(nums: IntArray): Long {
        var limit = nums[nums.size - 1]
        var ans: Long = 0
        for (i in nums.size - 2 downTo 0) {
            var replacements = nums[i] / limit - 1
            if (nums[i] % limit != 0) {
                replacements++
            }
            ans += replacements.toLong()
            limit = nums[i] / (replacements + 1)
        }
        return ans
    }
}
