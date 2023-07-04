package g2501_2600.s2532_time_to_cross_a_bridge

import java.util.PriorityQueue

// #Hard #Array #Heap_Priority_Queue #Simulation
@Suppress("NAME_SHADOWING")
class Solution {
    fun findCrossingTime(n: Int, k: Int, time: Array<IntArray>): Int {
        // create 2 PQ
        var n = n
        val leftBridgePQ = PriorityQueue { a: IntArray, b: IntArray -> if (a[1] == b[1]) b[0] - a[0] else b[1] - a[1] }
        val rightBridgePQ = PriorityQueue { a: IntArray, b: IntArray -> if (a[1] == b[1]) b[0] - a[0] else b[1] - a[1] }
        val leftWHPQ = PriorityQueue(Comparator.comparingInt { a: IntArray -> a[1] })
        val rightWHPQ = PriorityQueue(Comparator.comparingInt { a: IntArray -> a[1] })
        for (i in 0 until k) {
            val effciency = time[i][0] + time[i][2]
            leftBridgePQ.offer(intArrayOf(i, effciency))
        }
        var duration = 0
        while (n > 0 || !rightBridgePQ.isEmpty() || !rightWHPQ.isEmpty()) {
            while (!leftWHPQ.isEmpty() && leftWHPQ.peek()[1] <= duration) {
                val id = leftWHPQ.poll()[0]
                val e = time[id][0] + time[id][2]
                leftBridgePQ.offer(intArrayOf(id, e))
            }
            while (!rightWHPQ.isEmpty() && rightWHPQ.peek()[1] <= duration) {
                val id = rightWHPQ.poll()[0]
                val e = time[id][0] + time[id][2]
                rightBridgePQ.offer(intArrayOf(id, e))
            }
            if (!rightBridgePQ.isEmpty()) {
                val id = rightBridgePQ.poll()[0]
                duration += time[id][2]
                leftWHPQ.offer(intArrayOf(id, duration + time[id][3]))
            } else if (!leftBridgePQ.isEmpty() && n > 0) {
                val id = leftBridgePQ.poll()[0]
                duration += time[id][0]
                rightWHPQ.offer(intArrayOf(id, duration + time[id][1]))
                --n
            } else {
                // update duration
                var left = Int.MAX_VALUE
                if (!leftWHPQ.isEmpty() && n > 0) {
                    left = leftWHPQ.peek()[1]
                }
                var right = Int.MAX_VALUE
                if (!rightWHPQ.isEmpty()) {
                    right = rightWHPQ.peek()[1]
                }
                duration = Math.min(left, right)
            }
        }
        return duration
    }
}
