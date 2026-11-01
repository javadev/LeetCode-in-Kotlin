package g3801_3900.s3878_count_good_subarrays

// #Hard #Array #Bit_Manipulation #Stack #Monotonic_Stack #Senior_Staff #Weekly_Contest_494
// #2026_08_13_Time_6_ms_(100.00%)_Space_105.66_MB_(98.88%)

class Solution {
    fun countGoodSubarrays(nums: IntArray): Long {
        val n = nums.size
        var ans: Long = 0
        val prev = IntArray(n)
        for (i in 0..<n) {
            var left = i - 1
            while (left >= 0 && (nums[left] or nums[i]) == nums[i]) {
                left = prev[left]
            }
            prev[i] = left
            var right = i + 1
            while (right < n && nums[right] != nums[i] && (nums[right] or nums[i]) == nums[i]) {
                right++
            }
            ans += (i - left).toLong() * (right - i)
        }
        return ans
    }
}
