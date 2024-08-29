package g3201_3300.s3264_final_array_state_after_k_multiplication_operations_i

// #Easy #Array #Math #Heap_Priority_Queue #Simulation
// #2024_08_29_Time_237_ms_(55.55%)_Space_39.5_MB_(51.85%)

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
