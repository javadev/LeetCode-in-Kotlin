package g2201_2300.s2202_maximize_the_topmost_element_after_k_moves

// #Medium #Array #Greedy #2023_06_27_Time_491_ms_(50.00%)_Space_58_MB_(100.00%)

class Solution {
    fun maximumTop(nums: IntArray, k: Int): Int {
        var max = -1
        val maxTravers = Math.min(k + 1, nums.size)
        if (nums.size == 1) {
            return if (k % 2 == 0) {
                nums[0]
            } else {
                max
            }
        }
        for (i in 0 until maxTravers) {
            if (nums[i] > max && i != k - 1) {
                max = nums[i]
            }
        }
        return max
    }
}
