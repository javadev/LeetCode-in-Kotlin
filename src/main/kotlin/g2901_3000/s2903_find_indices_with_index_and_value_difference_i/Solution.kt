package g2901_3000.s2903_find_indices_with_index_and_value_difference_i

import kotlin.math.abs

class Solution {
    fun findIndices(nums: IntArray, indexDifference: Int, valueDifference: Int): IntArray {
        for (i in nums.indices) {
            for (j in i until nums.size) {
                if (j - i >= indexDifference && abs((nums[i] - nums[j]).toDouble()) >= valueDifference) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(-1, -1)
    }
}
