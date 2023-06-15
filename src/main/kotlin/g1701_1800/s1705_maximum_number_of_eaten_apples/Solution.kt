package g1701_1800.s1705_maximum_number_of_eaten_apples

import java.util.*

// #Medium #Array #Greedy #Heap_Priority_Queue
class Solution {
    fun eatenApples(apples: IntArray, days: IntArray): Int {
        val minHeap = PriorityQueue { a: IntArray, b: IntArray -> a[0] - b[0] }
        var eatenApples = 0
        var i = 0
        while (i < apples.size || !minHeap.isEmpty()) {
            if (i < apples.size) {
                minHeap.offer(intArrayOf(i + days[i], apples[i]))
            }
            while (!minHeap.isEmpty() && (minHeap.peek()[0] <= i || minHeap.peek()[1] <= 0)) {
                minHeap.poll()
            }
            if (!minHeap.isEmpty()) {
                eatenApples++
                minHeap.peek()[1]--
            }
            i++
        }
        return eatenApples
    }
}
