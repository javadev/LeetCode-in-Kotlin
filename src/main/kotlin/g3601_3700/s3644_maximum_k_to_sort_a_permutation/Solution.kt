package g3601_3700.s3644_maximum_k_to_sort_a_permutation

// #Medium #Weekly_Contest_462 #2025_08_11_Time_4_ms_(100.00%)_Space_83.96_MB_(100.00%)

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
