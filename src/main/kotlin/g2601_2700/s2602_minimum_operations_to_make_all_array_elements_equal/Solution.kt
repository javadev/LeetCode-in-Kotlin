package g2601_2700.s2602_minimum_operations_to_make_all_array_elements_equal

// #Medium #Array #Sorting #Binary_Search #Prefix_Sum
// #2023_07_13_Time_790_ms_(100.00%)_Space_63.8_MB_(100.00%)

import java.util.ArrayList
import java.util.Arrays

class Solution {
    fun minOperations(nums: IntArray, queries: IntArray): List<Long> {
        nums.sort()
        val sum = LongArray(nums.size)
        sum[0] = nums[0].toLong()
        for (i in 1 until nums.size) {
            sum[i] = sum[i - 1] + nums[i].toLong()
        }
        val res: MutableList<Long> = ArrayList()
        for (query in queries) {
            res.add(getOperations(sum, nums, query))
        }
        return res
    }

    private fun getOperations(sum: LongArray, nums: IntArray, target: Int): Long {
        var res: Long = 0
        val index = getIndex(nums, target)
        val rightCounts = nums.size - 1 - index
        if (index > 0) {
            res += index.toLong() * target - sum[index - 1]
        }
        if (rightCounts > 0) {
            res += sum[nums.size - 1] - sum[index] - rightCounts.toLong() * target
        }
        res += kotlin.math.abs(target - nums[index]).toLong()
        return res
    }

    private fun getIndex(nums: IntArray, target: Int): Int {
        var index = Arrays.binarySearch(nums, target)
        if (index < 0) index = -(index + 1)
        if (index == nums.size) --index
        return index
    }
}
