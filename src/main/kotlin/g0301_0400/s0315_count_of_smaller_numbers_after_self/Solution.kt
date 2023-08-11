package g0301_0400.s0315_count_of_smaller_numbers_after_self

// #Hard #Top_Interview_Questions #Array #Binary_Search #Ordered_Set #Divide_and_Conquer
// #Segment_Tree #Binary_Indexed_Tree #Merge_Sort
// #2022_11_10_Time_1282_ms_(88.46%)_Space_109.8_MB_(46.15%)

import java.util.LinkedList

@Suppress("NAME_SHADOWING")
class Solution {
    fun countSmaller(nums: IntArray): List<Int> {
        var minVal = 10001
        var maxVal = -10001
        for (a in nums) {
            minVal = Math.min(minVal, a)
            maxVal = Math.max(maxVal, a)
        }
        val range = maxVal - (minVal - 1) + 1
        val offset = -(minVal - 1)
        val bit = FenwickTree(range)
        val ans = LinkedList<Int>()
        val n = nums.size
        var i = n - 1
        while (i >= 0) {
            bit.update(offset + nums[i], 1)
            ans.addFirst(bit.ps(offset + nums[i] - 1))
            i--
        }
        return ans
    }

    private class FenwickTree(n: Int) {
        // binary index tree, index 0 is not used
        var bit: IntArray
        var n: Int

        init {
            this.n = n + 1
            bit = IntArray(this.n)
        }

        fun update(i: Int, v: Int) {
            var i = i
            while (i < n) {
                bit[i] += v
                i += Integer.lowestOneBit(i)
            }
        }

        // prefix sum query
        fun ps(j: Int): Int {
            var j = j
            var ps = 0
            while (j != 0) {
                ps += bit[j]
                j -= Integer.lowestOneBit(j)
            }
            return ps
        }
    }
}
