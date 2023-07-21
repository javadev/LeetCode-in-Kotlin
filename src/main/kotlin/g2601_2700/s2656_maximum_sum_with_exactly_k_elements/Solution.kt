package g2601_2700.s2656_maximum_sum_with_exactly_k_elements

// #Easy #Array #Greedy #2023_07_21_Time_241_ms_(93.94%)_Space_40.5_MB_(63.64%)

class Solution {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        return k * (nums.max() ?: 0) + k * (k - 1) / 2
    }
}
