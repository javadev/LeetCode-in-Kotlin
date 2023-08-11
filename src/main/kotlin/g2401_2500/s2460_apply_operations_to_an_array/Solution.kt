package g2401_2500.s2460_apply_operations_to_an_array

// #Easy #Array #Simulation #2023_07_05_Time_165_ms_(100.00%)_Space_37.1_MB_(77.78%)

class Solution {
    fun applyOperations(nums: IntArray): IntArray {
        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2
                nums[i + 1] = 0
            }
        }
        var index = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[index] = nums[i]
                index++
            }
        }
        for (i in index until nums.size) {
            nums[i] = 0
        }
        return nums
    }
}
