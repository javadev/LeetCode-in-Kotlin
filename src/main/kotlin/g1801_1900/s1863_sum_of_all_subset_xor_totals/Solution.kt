package g1801_1900.s1863_sum_of_all_subset_xor_totals

// #Easy #Array #Math #Bit_Manipulation #Backtracking #Combinatorics
class Solution {
    fun subsetXORSum(nums: IntArray): Int {
        return if (nums.size == 0) {
            0
        } else subsetXORSum(nums, 0, 0)
    }

    private fun subsetXORSum(nums: IntArray, currIndex: Int, res: Int): Int {
        if (currIndex == nums.size) {
            return res
        }
        val sum1 = subsetXORSum(nums, currIndex + 1, nums[currIndex] xor res)
        val sum2 = subsetXORSum(nums, currIndex + 1, res)
        return sum1 + sum2
    }
}
