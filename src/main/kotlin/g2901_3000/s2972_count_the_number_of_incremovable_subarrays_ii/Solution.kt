package g2901_3000.s2972_count_the_number_of_incremovable_subarrays_ii

// #Hard #Array #Binary_Search #Two_Pointers
// #2024_01_19_Time_483_ms_(100.00%)_Space_59.4_MB_(100.00%)

class Solution {
    fun incremovableSubarrayCount(nums: IntArray): Long {
        var ans: Long
        val n = nums.size
        var l = 0
        var r = n - 1
        while (l + 1 < n && nums[l] < nums[l + 1]) {
            l++
        }
        while (r > 0 && nums[r - 1] < nums[r]) {
            r--
        }
        ans = (if ((l == n - 1)) 0 else 1 + (n - r)).toLong()
        for (i in 0..l) {
            while (r < n && nums[r] <= nums[i]) {
                r++
            }
            ans += (n - r + 1).toLong()
        }
        return ans
    }
}
