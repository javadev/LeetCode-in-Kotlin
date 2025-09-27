package g3601_3700.s3644_maximum_k_to_sort_a_permutation

// #Medium #Array #Bit_Manipulation #Weekly_Contest_462
// #2025_09_27_Time_2_ms_(100.00%)_Space_68.51_MB_(79.31%)

class Solution {
    fun sortPermutation(nums: IntArray): Int {
        val n = nums.size
        var res = -1
        for (i in 0..<n) {
            if (nums[i] == i) {
                continue
            }
            if (res == -1) {
                res = nums[i]
            } else {
                res = res and nums[i]
            }
        }
        if (res == -1) {
            return 0
        }
        return res
    }
}
