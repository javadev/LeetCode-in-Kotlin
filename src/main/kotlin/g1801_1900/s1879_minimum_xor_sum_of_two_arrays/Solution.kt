package g1801_1900.s1879_minimum_xor_sum_of_two_arrays

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
class Solution {
    fun minimumXORSum(nums1: IntArray, nums2: IntArray): Int {
        val l = nums1.size
        val dp = IntArray(1 shl l)
        dp.fill(-1)
        dp[0] = 0
        return dfs(dp.size - 1, l, nums1, nums2, dp, l)
    }

    private fun dfs(state: Int, length: Int, nums1: IntArray, nums2: IntArray, dp: IntArray, totalLength: Int): Int {
        if (dp[state] >= 0) {
            return dp[state]
        }
        var min = Int.MAX_VALUE
        val currIndex = totalLength - length
        var i = 0
        var index = 0
        while (i < length) {
            if (state shr index and 1 == 1) {
                val result = dfs(state xor (1 shl index), length - 1, nums1, nums2, dp, totalLength)
                min = Math.min(min, (nums2[currIndex] xor nums1[index]) + result)
                i++
            }
            index++
        }
        dp[state] = min
        return min
    }
}
