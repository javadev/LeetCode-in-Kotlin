package g1301_1400.s1383_maximum_performance_of_a_team

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2023_06_06_Time_427_ms_(100.00%)_Space_50.2_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun maxPerformance(n: Int, speed: IntArray, efficiency: IntArray, k: Int): Int {
        val engineers = Array(n) { IntArray(2) }
        for (i in 0 until n) {
            engineers[i][0] = speed[i]
            engineers[i][1] = efficiency[i]
        }
        engineers.sortWith { engineer1: IntArray, engineer2: IntArray -> engineer2[1] - engineer1[1] }
        var speedSum: Long = 0
        var maximumPerformance: Long = 0
        val minHeap = PriorityQueue<Int>()
        for (engineer in engineers) {
            if (minHeap.size == k) {
                speedSum -= minHeap.poll().toLong()
            }
            speedSum += engineer[0].toLong()
            minHeap.offer(engineer[0])
            maximumPerformance = Math.max(maximumPerformance, speedSum * engineer[1])
        }
        return (maximumPerformance % 1000000007).toInt()
    }
}
