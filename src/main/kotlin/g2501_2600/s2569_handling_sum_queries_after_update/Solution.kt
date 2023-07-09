package g2501_2600.s2569_handling_sum_queries_after_update

// #Hard #Array #Segment_Tree #2023_07_09_Time_1751_ms_(100.00%)_Space_100.6_MB_(100.00%)

import java.util.BitSet

class Solution {
    fun handleQuery(nums1: IntArray, nums2: IntArray, queries: Array<IntArray>): LongArray {
        val results: MutableList<Long> = ArrayList()
        val n = nums1.size
        val bs = BitSet(n)
        var sum: Long = 0
        for (i in 0 until n) {
            sum += 1L * nums2[i]
            if (nums1[i] == 1) {
                bs.set(i)
            }
        }
        for (query in queries) {
            when (query[0]) {
                1 -> bs.flip(query[1], query[2] + 1)
                2 -> sum += 1L * query[1] * bs.cardinality()
                else -> results.add(sum)
            }
        }
        val ans = LongArray(results.size)
        for (i in ans.indices) {
            ans[i] = results[i]
        }
        return ans
    }
}
