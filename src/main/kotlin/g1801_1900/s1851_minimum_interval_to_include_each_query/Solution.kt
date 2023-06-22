package g1801_1900.s1851_minimum_interval_to_include_each_query

import java.util.Arrays
import java.util.PriorityQueue

// #Hard #Array #Sorting #Binary_Search #Heap_Priority_Queue #Line_Sweep
class Solution {
    fun minInterval(intervals: Array<IntArray>, queries: IntArray): IntArray {
        val numQuery = queries.size
        val queriesWithIndex = Array(numQuery) { IntArray(2) }
        for (i in 0 until numQuery) {
            queriesWithIndex[i] = intArrayOf(queries[i], i)
        }
        Arrays.sort(intervals, Comparator.comparingInt { a: IntArray -> a[0] })
        Arrays.sort(queriesWithIndex, Comparator.comparingInt { a: IntArray -> a[0] })
        val minHeap = PriorityQueue(Comparator.comparingInt { a: IntArray -> a[1] - a[0] })
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
