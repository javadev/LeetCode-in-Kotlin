package g0701_0800.s0724_find_pivot_index

// #Easy #Array #Prefix_Sum #Level_1_Day_1_Prefix_Sum
// #2023_02_28_Time_255_ms_(88.92%)_Space_38.7_MB_(93.26%)

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return -1
        }
        val sums = IntArray(nums.size)
        sums[0] = nums[0]
        for (i in 1 until nums.size) {
            sums[i] = sums[i - 1] + nums[i]
        }
        for (i in nums.indices) {
            val temp = sums[nums.size - 1] - sums[i]
            if (i == 0 && 0 == temp || i > 0 && sums[i - 1] == temp) {
                return i
            }
        }
        return -1
    }
}
