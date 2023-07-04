package g2501_2600.s2532_time_to_cross_a_bridge

// #Hard #Array #Heap_Priority_Queue #Simulation
// #2023_07_04_Time_420_ms_(100.00%)_Space_47.1_MB_(50.00%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun findCrossingTime(n: Int, k: Int, time: Array<IntArray>): Int {
        // create 2 PQ
        var n = n
        val leftBridgePQ = PriorityQueue { a: IntArray, b: IntArray -> if (a[1] == b[1]) b[0] - a[0] else b[1] - a[1] }
        val rightBridgePQ = PriorityQueue { a: IntArray, b: IntArray -> if (a[1] == b[1]) b[0] - a[0] else b[1] - a[1] }
        val leftWHPQ = PriorityQueue { a: IntArray, b: IntArray -> a[1].compareTo(b[1]) }
        val rightWHPQ = PriorityQueue { a: IntArray, b: IntArray -> a[1].compareTo(b[1]) }
        for (i in 0 until k) {
            val efficiency = time[i][0] + time[i][2]
            leftBridgePQ.offer(intArrayOf(i, efficiency))
        }
        var duration = 0
        while (n > 0 || rightBridgePQ.isNotEmpty() || rightWHPQ.isNotEmpty()) {
            while (leftWHPQ.isNotEmpty() && leftWHPQ.peek()[1] <= duration) {
                val id = leftWHPQ.poll()[0]
                val e = time[id][0] + time[id][2]
                leftBridgePQ.offer(intArrayOf(id, e))
            }
            while (rightWHPQ.isNotEmpty() && rightWHPQ.peek()[1] <= duration) {
                val id = rightWHPQ.poll()[0]
                val e = time[id][0] + time[id][2]
                rightBridgePQ.offer(intArrayOf(id, e))
            }
            if (rightBridgePQ.isNotEmpty()) {
                val id = rightBridgePQ.poll()[0]
                duration += time[id][2]
                leftWHPQ.offer(intArrayOf(id, duration + time[id][3]))
            } else if (leftBridgePQ.isNotEmpty() && n > 0) {
                val id = leftBridgePQ.poll()[0]
                duration += time[id][0]
                rightWHPQ.offer(intArrayOf(id, duration + time[id][1]))
                --n
            } else {
                // update duration
                var left = Int.MAX_VALUE
                if (leftWHPQ.isNotEmpty() && n > 0) {
                    left = leftWHPQ.peek()[1]
                }
                var right = Int.MAX_VALUE
                if (rightWHPQ.isNotEmpty()) {
                    right = rightWHPQ.peek()[1]
                }
                duration = Math.min(left, right)
            }
        }
        return duration
    }
}
