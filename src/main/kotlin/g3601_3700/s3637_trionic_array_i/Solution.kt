package g3601_3700.s3637_trionic_array_i

// #Easy #Array #Weekly_Contest_461 #2025_08_14_Time_0_ms_(100.00%)_Space_43.15_MB_(44.56%)

class Solution {
    fun isTrionic(nums: IntArray): Boolean {
        var i = 1
        val n = nums.size
        while (i < n && nums[i] > nums[i - 1]) {
            i++
        }
        if (i == n || i == 1) {
            return false
        }
        while (i < n && nums[i] < nums[i - 1]) {
            i++
        }
        if (i == n) {
            return false
        }
        while (i < n && nums[i] > nums[i - 1]) {
            i++
        }
        return i == n
    }
}
