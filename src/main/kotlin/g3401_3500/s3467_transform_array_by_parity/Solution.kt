package g3401_3500.s3467_transform_array_by_parity

// #Easy #2025_03_02_Time_11_ms_(100.00%)_Space_42.68_MB_(100.00%)

class Solution {
    fun transformArray(nums: IntArray): IntArray {
        for (i in nums.indices) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0
            } else {
                nums[i] = 1
            }
        }
        nums.sort()
        return nums
    }
}
