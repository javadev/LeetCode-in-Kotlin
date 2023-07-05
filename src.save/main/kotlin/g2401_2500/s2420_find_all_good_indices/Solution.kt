package g2401_2500.s2420_find_all_good_indices

// #Medium #Array #Dynamic_Programming #Prefix_Sum
// #2023_07_04_Time_621_ms_(100.00%)_Space_50.8_MB_(100.00%)

class Solution {
    fun goodIndices(nums: IntArray, k: Int): List<Int> {
        var amount = 1
        val result: MutableList<Int> = ArrayList()
        if (k == 1) {
            for (i in 1 until nums.size - 1) {
                result.add(i)
            }
            return result
        }
        var left = 1
        var right = k + 2
        while (right < nums.size) {
            if (nums[left - 1] >= nums[left] && nums[right - 1] <= nums[right]) {
                amount++
                if (amount >= k) {
                    result.add(left + 1)
                }
            } else {
                amount = 1
            }
            left++
            right++
        }
        return result
    }
}
