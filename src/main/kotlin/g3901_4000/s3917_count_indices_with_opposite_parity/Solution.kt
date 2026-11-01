package g3901_4000.s3917_count_indices_with_opposite_parity

// #Easy #Array #Mid_Level #Weekly_Contest_500
// #2026_09_15_Time_1_ms_(100.00%)_Space_46.74_MB_(66.61%)

class Solution {
    fun countOppositeParity(nums: IntArray): IntArray {
        val n = nums.size
        var odd = 0
        var even = 0
        val result = IntArray(n)
        for (i in n - 1 downTo 0) {
            if ((nums[i] and 1) == 1) {
                result[i] = even
                odd++
            } else {
                result[i] = odd
                even++
            }
        }
        return result
    }
}
