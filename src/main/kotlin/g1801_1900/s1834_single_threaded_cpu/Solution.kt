package g1801_1900.s1834_single_threaded_cpu

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2023_06_21_Time_1050_ms_(100.00%)_Space_96.2_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun getOrder(tasks1: Array<IntArray>): IntArray {
        val n = tasks1.size
        val tasks = Array(n) { IntArray(3) }
        for (i in 0 until n) {
            tasks[i] = intArrayOf(tasks1[i][0], tasks1[i][1], i)
        }
        tasks.sortWith(compareBy { a: IntArray -> a[0] })
        val minHeap = PriorityQueue(
            Comparator { a: IntArray, b: IntArray ->
                if (a[1] == b[1]) {
                    return@Comparator a[2] - b[2]
                } else {
                    return@Comparator a[1] - b[1]
                }
            }
        )
        var time = tasks[0][0]
        val taskOrderResult = IntArray(n)
        var i = 0
        var index = 0
        while (!minHeap.isEmpty() || i < n) {
            while (i < n && time >= tasks[i][0]) {
                minHeap.add(tasks[i++])
            }
            if (!minHeap.isEmpty()) {
                val task = minHeap.remove()
                taskOrderResult[index++] = task[2]
                time += task[1]
            } else {
                time = tasks[i][0]
            }
        }
        return taskOrderResult
    }
}
