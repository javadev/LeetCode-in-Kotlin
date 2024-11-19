package g2701_2800.s2736_maximum_sum_queries

// #Hard #Array #Sorting #Binary_Search #Stack #Monotonic_Stack #Segment_Tree #Binary_Indexed_Tree
// #2023_08_05_Time_1043_ms_(100.00%)_Space_126.2_MB_(9.09%)

import java.util.TreeMap

class Solution {
    private fun update(map: TreeMap<Int, Int>, num: Int, sum: Int) {
        var entry = map.floorEntry(num)
        while (entry != null && entry.value <= sum) {
            map.remove(entry.key)
            val x = entry.key
            entry = map.floorEntry(x)
        }
        entry = map.ceilingEntry(num)
        if (entry == null || entry.value < sum) map.put(num, sum)
    }

    private fun queryVal(map: TreeMap<Int, Int>, num: Int): Int {
        val (_, value) = map.ceilingEntry(num) ?: return -1
        return value
    }

    fun maximumSumQueries(nums1: IntArray, nums2: IntArray, queries: Array<IntArray>): IntArray {
        val n = nums1.size
        val m = queries.size
        val v: MutableList<IntArray> = ArrayList()
        for (i in 0 until n) {
            v.add(intArrayOf(nums1[i], nums2[i]))
        }
        v.sortWith(
            Comparator { a: IntArray, b: IntArray ->
                a[0] - b[0]
            },
        )
        val ind: MutableList<Int> = ArrayList()
        for (i in 0 until m) ind.add(i)
        ind.sortWith(Comparator { a: Int?, b: Int? -> queries[b!!][0] - queries[a!!][0] })
        val values = TreeMap<Int, Int>()
        var j = n - 1
        val ans = IntArray(m)
        for (i in ind) {
            val a = queries[i][0]
            val b = queries[i][1]
            while (j >= 0 && v[j][0] >= a) {
                update(values, v[j][1], v[j][0] + v[j][1])
                j--
            }
            ans[i] = queryVal(values, b)
        }
        return ans
    }
}
