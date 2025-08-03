package g3601_3700.s3637_trionic_array_i

// #Easy #Weekly_Contest_461 #2025_08_03_Time_1_ms_(100.00%)_Space_43.69_MB_(100.00%)

class Solution {
    fun isTrionic(nums: IntArray): Boolean {
        var p = 0
        var q = 0
        val n = nums.size
        for (i in 1..<n - 1) {
            if (nums[i - 1] == nums[i]) {
                return false
            }
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                if (p != 0) {
                    return false
                }
                p = i
            }
            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                if (p == 0 || q != 0) {
                    return false
                }
                q = i
            }
        }
        return q > 0
    }
}
