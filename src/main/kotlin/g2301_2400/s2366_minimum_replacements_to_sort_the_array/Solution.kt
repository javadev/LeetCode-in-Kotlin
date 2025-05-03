package g2301_2400.s2366_minimum_replacements_to_sort_the_array

// #Hard #Array #Math #Greedy #2025_05_03_Time_4_ms_(100.00%)_Space_60.26_MB_(66.67%)

class Solution {
    fun minimumReplacement(nums: IntArray): Long {
        val n = nums.size
        var prev = nums[n - 1]
        var ans: Long = 0
        for (i in n - 2 downTo 0) {
            var noOfTime = nums[i] / prev
            if (nums[i] % prev != 0) {
                noOfTime++
                prev = nums[i] / noOfTime
            }
            ans += (noOfTime - 1).toLong()
        }
        return ans
    }
}
