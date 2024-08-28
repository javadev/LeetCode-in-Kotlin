package g3201_3300.s3264_final_array_state_after_k_multiplication_operations_i

// #Easy #2024_08_28_Time_226_ms_(68.00%)_Space_38.5_MB_(66.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        var k = k
        while (k-- > 0) {
            var min = nums[0]
            var index = 0
            for (i in nums.indices) {
                if (min > nums[i]) {
                    min = nums[i]
                    index = i
                }
            }
            nums[index] = nums[index] * multiplier
        }
        return nums
    }
}
