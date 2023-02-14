package g0601_0700.s0665_non_decreasing_array

// #Medium #Array #2023_02_14_Time_256_ms_(85.71%)_Space_39.8_MB_(28.57%)

class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
        val n = nums.size
        if (n <= 2) {
            return true
        }

        var isModified = false
        for (i in 0..(n - 2)) {
            if (nums[i] <= nums[i + 1]) {
                continue
            }
            if (isModified) {
                return false
            }

            when {
                i == 0 || nums[i - 1] <= nums[i + 1] -> {
                    nums[i] = nums[i + 1]
                    isModified = true
                }
                i == n - 2 || nums[i] <= nums[i + 2] -> {
                    nums[i + 1] = nums[i]
                    isModified = true
                }
                else -> {
                    return false
                }
            }
        }
        return true
    }
}
