package g3401_3500.s3467_transform_array_by_parity

// #Easy #2025_03_06_Time_1_ms_(100.00%)_Space_38.10_MB_(100.00%)

class Solution {
    fun transformArray(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(size)
        var countEven = 0
        for (i in nums.indices) {
            if (nums[i] and 1 == 0) {
                countEven++
            }
        }
        for (i in countEven until size) {
            ans[i] = 1
        }
        return ans
    }
}
