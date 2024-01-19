package g2901_3000.s2970_count_the_number_of_incremovable_subarrays_i

// #Easy #Array #Binary_Search #Two_Pointers #Enumeration
// #2024_01_19_Time_170_ms_(100.00%)_Space_36.5_MB_(94.12%)

class Solution {
    fun incremovableSubarrayCount(nums: IntArray): Int {
        val n = nums.size
        var res = 0
        var left = Int.MIN_VALUE
        for (i in 0 until n) {
            var right = Int.MAX_VALUE
            var j = n - 1
            while (i <= j) {
                res++
                if (left >= nums[j] || nums[j] >= right) {
                    break
                }
                right = nums[j]
                j--
            }
            if (left >= nums[i]) {
                break
            }
            left = nums[i]
        }
        return res
    }
}
