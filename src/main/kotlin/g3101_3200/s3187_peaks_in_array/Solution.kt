package g3101_3200.s3187_peaks_in_array

// #Hard #Array #Segment_Tree #Binary_Indexed_Tree
// #2024_06_22_Time_1339_ms_(80.00%)_Space_135.1_MB_(70.00%)

import kotlin.math.max

@Suppress("NAME_SHADOWING")
class Solution {
    fun countOfPeaks(nums: IntArray, queries: Array<IntArray>): List<Int> {
        val peaks = BooleanArray(nums.size)
        val binaryIndexedTree = IntArray(Integer.highestOneBit(peaks.size) * 2 + 1)
        for (i in 1 until peaks.size - 1) {
            if (nums[i] > max(nums[i - 1], nums[i + 1])) {
                peaks[i] = true
                update(binaryIndexedTree, i + 1, 1)
            }
        }
        val result: MutableList<Int> = ArrayList()
        for (query in queries) {
            if (query[0] == 1) {
                val leftIndex = query[1]
                val rightIndex = query[2]
                result.add(computeRangeSum(binaryIndexedTree, leftIndex + 2, rightIndex))
            } else {
                val index = query[1]
                val value = query[2]
                nums[index] = value
                for (i in -1..1) {
                    val affected = index + i
                    if (affected >= 1 && affected <= nums.size - 2) {
                        val peak =
                            nums[affected] > max(nums[affected - 1], nums[affected + 1])
                        if (peak != peaks[affected]) {
                            if (peak) {
                                update(binaryIndexedTree, affected + 1, 1)
                            } else {
                                update(binaryIndexedTree, affected + 1, -1)
                            }
                            peaks[affected] = peak
                        }
                    }
                }
            }
        }
        return result
    }

    private fun computeRangeSum(binaryIndexedTree: IntArray, beginIndex: Int, endIndex: Int): Int {
        return if (beginIndex <= endIndex) {
            query(binaryIndexedTree, endIndex) - query(binaryIndexedTree, beginIndex - 1)
        } else {
            0
        }
    }

    private fun query(binaryIndexedTree: IntArray, index: Int): Int {
        var index = index
        var result = 0
        while (index != 0) {
            result += binaryIndexedTree[index]
            index -= index and -index
        }

        return result
    }

    private fun update(binaryIndexedTree: IntArray, index: Int, delta: Int) {
        var index = index
        while (index < binaryIndexedTree.size) {
            binaryIndexedTree[index] += delta
            index += index and -index
        }
    }
}
