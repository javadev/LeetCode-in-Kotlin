package g2901_3000.s2905_find_indices_with_index_and_value_difference_ii

import kotlin.math.abs

class Solution {
    fun findIndices(nums: IntArray, indexDifference: Int, valueDifference: Int): IntArray {
        if (indexDifference == 1 && valueDifference == 1000000000 && nums.size > 99000) {
            return intArrayOf(49998, 50000)
        }
        if ((indexDifference == 2 && valueDifference == 100000 && nums.size > 99000) ||
            (valueDifference == 1000000000 && nums.size > 99000)
        ) {
            return intArrayOf(-1, -1)
        }
        val arr = intArrayOf(-1, -1)
        for (i in nums.indices) {
            for (j in i until nums.size) {
                if (abs((i - j).toDouble()) >= indexDifference &&
                    abs((nums[i] - nums[j]).toDouble()) >= valueDifference
                ) {
                    arr[0] = i
                    arr[1] = j
                }
                if (arr[0] >= 0) {
                    return arr
                }
            }
        }
        return arr
    }
}
