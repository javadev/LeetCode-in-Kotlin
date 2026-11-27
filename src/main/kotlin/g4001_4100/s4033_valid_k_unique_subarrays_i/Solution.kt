package g4001_4100.s4033_valid_k_unique_subarrays_i

// #Hard #Array #Hash_Table #Bit_Manipulation #Prefix_Sum #Sliding_Window #Segment_Tree
// #Hash_Function #Binary_Indexed_Tree #Senior_Staff #Weekly_Contest_516
// #2026_11_25_Time_20_ms_(100.00%)_Space_235.47_MB_(70.27%)

import kotlin.math.max
import kotlin.math.sqrt

class Solution {
    private var countOdd = 0
    private var countDistinct = 0

    fun validSubarrays(nums: IntArray, k: Int, queries: Array<IntArray>): BooleanArray {
        var maxNum = Int.MIN_VALUE
        val prefixXor = IntArray(nums.size + 1)
        for (i in nums.indices) {
            maxNum = max(maxNum, nums[i])
            prefixXor[i + 1] = prefixXor[i] xor nums[i]
        }
        val sortedQueries: Array<IntArray> = Array<IntArray>(queries.size) { IntArray(0) }
        val queriesCount = this.sortQueries(nums, k, prefixXor, queries, sortedQueries)
        val result = BooleanArray(queries.size)
        if (queriesCount == 0) {
            return result
        }
        var currentLeft = sortedQueries[0][0]
        var currentRight = sortedQueries[0][0] - 1
        countOdd = 0
        countDistinct = 0
        val counts = IntArray(maxNum + 1)
        for (i in 0..<queriesCount) {
            val query: IntArray? = sortedQueries[i]
            while (currentLeft > query!![0]) {
                this.add(counts, nums, --currentLeft)
            }
            while (currentRight < query[1]) {
                this.add(counts, nums, ++currentRight)
            }
            while (currentLeft < query[0]) {
                this.remove(counts, nums, currentLeft++)
            }
            while (currentRight > query[1]) {
                this.remove(counts, nums, currentRight--)
            }
            result[query[2]] = countDistinct == k && countOdd == 0
        }
        return result
    }

    private fun sortQueries(
        nums: IntArray,
        k: Int,
        prefixXor: IntArray,
        queries: Array<IntArray>,
        sortedQueries: Array<IntArray>,
    ): Int {
        val blockSize = max(1, (nums.size / sqrt(queries.size.toDouble())).toInt())
        var queriesCount = 0
        for (i in queries.indices) {
            val query = queries[i]
            val length = query[1] - query[0]
            if (length % 2 == 1 && length + 1 >= 2 * k && (prefixXor[query[1] + 1] xor prefixXor[query[0]]) == 0) {
                sortedQueries[queriesCount++] =
                    intArrayOf(query[0], query[1], i, query[0] / blockSize)
            }
        }
        sortedQueries.sortWith(
            { o1: IntArray?, o2: IntArray? ->
                if (o1!![3] == o2!![3]) {
                    return@sortWith if (o1[3] % 2 == 0) o1[1] - o2[1] else o2[1] - o1[1]
                } else {
                    return@sortWith Integer.compare(o1[3], o2[3])
                }
            },
            0,
            queriesCount,
        )
        return queriesCount
    }

    private fun add(counts: IntArray, nums: IntArray, index: Int) {
        val count = ++counts[nums[index]]
        if (count == 1) {
            countDistinct++
        }
        countOdd += 2 * (count and 1) - 1
    }

    private fun remove(counts: IntArray, nums: IntArray, index: Int) {
        val count = --counts[nums[index]]
        if (count == 0) {
            countDistinct--
        }
        countOdd += 2 * (count and 1) - 1
    }
}
