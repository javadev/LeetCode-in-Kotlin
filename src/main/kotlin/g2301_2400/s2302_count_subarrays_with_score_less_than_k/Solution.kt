package g2301_2400.s2302_count_subarrays_with_score_less_than_k

// #Hard #Array #Binary_Search #Prefix_Sum #Sliding_Window
// #2023_06_29_Time_556_ms_(100.00%)_Space_55.3_MB_(100.00%)

class Solution {
    fun countSubarrays(nums: IntArray, k: Long): Long {
        var sum: Long = 0
        var count: Long = 0
        var i = 0
        var j = 0
        while (i < nums.size) {
            sum += nums[i].toLong()
            while (sum * (i - j + 1) >= k) {
                sum -= nums[j++].toLong()
            }
            count += (i++ - j + 1).toLong()
        }
        return count
    }
}
