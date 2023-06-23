package g2001_2100.s2044_count_number_of_maximum_bitwise_or_subsets

// #Medium #Array #Bit_Manipulation #Backtracking
// #2023_06_23_Time_140_ms_(100.00%)_Space_33.9_MB_(100.00%)

class Solution {
    private var count = 0
    fun countMaxOrSubsets(nums: IntArray): Int {
        var lookfor = 0
        for (i in nums) {
            lookfor = lookfor or i
        }
        countsub(nums, 0, lookfor, 0)
        return count
    }

    private fun countsub(nums: IntArray, index: Int, lookfor: Int, sofar: Int) {
        if (lookfor == sofar) {
            count++
        }
        if (index >= nums.size) {
            return
        }
        for (start in index until nums.size) {
            countsub(nums, start + 1, lookfor, sofar or nums[start])
        }
    }
}
