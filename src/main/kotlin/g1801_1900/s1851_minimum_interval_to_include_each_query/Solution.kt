package g1801_1900.s1851_minimum_interval_to_include_each_query

// #Hard #Array #Sorting #Binary_Search #Heap_Priority_Queue #Line_Sweep
// #2023_06_22_Time_1612_ms_(87.50%)_Space_129.5_MB_(75.00%)

import java.util.PriorityQueue

class Solution {
    fun minInterval(intervals: Array<IntArray>, queries: IntArray): IntArray {
        val numQuery = queries.size
        val queriesWithIndex = Array(numQuery) { IntArray(2) }
        for (i in 0 until numQuery) {
            queriesWithIndex[i] = intArrayOf(queries[i], i)
        }
        intervals.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
        queriesWithIndex.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
        val minHeap = PriorityQueue({ a: IntArray, b: IntArray -> (a[1] - a[0]).compareTo(b[1] - b[0]) })
        val result = IntArray(numQuery)
        var j = 0
        for (i in queries.indices) {
            val queryVal = queriesWithIndex[i][0]
            val queryIndex = queriesWithIndex[i][1]
            while (j < intervals.size && intervals[j][0] <= queryVal) {
                minHeap.add(intervals[j])
                j++
            }
            while (minHeap.isNotEmpty() && minHeap.peek()[1] < queryVal) {
                minHeap.remove()
            }
            result[queryIndex] = if (minHeap.isEmpty()) -1 else minHeap.peek()[1] - minHeap.peek()[0] + 1
        }
        return result
    }
}
