package g3301_3400.s3342_find_minimum_time_to_reach_last_room_ii

// #Medium #Array #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2024_11_05_Time_122_ms_(100.00%)_Space_136.2_MB_(72.73%)

import java.util.Comparator
import java.util.PriorityQueue
import kotlin.math.max

class Solution {
    private class Node {
        var x: Int = 0
        var y: Int = 0
        var t: Int = 0
        var turn: Int = 0
    }

    private val dir = arrayOf<IntArray?>(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))

    fun minTimeToReach(moveTime: Array<IntArray>): Int {
        val pq = PriorityQueue<Node>(Comparator { a: Node, b: Node -> a.t - b.t })
        val m = moveTime.size
        val n = moveTime[0].size
        val node = Node()
        node.x = 0
        node.y = 0
        var t = 0
        node.t = t
        node.turn = 0
        pq.add(node)
        moveTime[0][0] = -1
        while (pq.isNotEmpty()) {
            val curr = pq.poll()
            for (i in 0..3) {
                val x = curr.x + dir[i]!![0]
                val y = curr.y + dir[i]!![1]
                if (x == m - 1 && y == n - 1) {
                    t = max(curr.t, moveTime[x][y]) + 1 + curr.turn
                    return t
                }
                if (x >= 0 && x < m && y < n && y >= 0 && moveTime[x][y] != -1) {
                    val newNode = Node()
                    t = max(curr.t, moveTime[x][y]) + 1 + curr.turn
                    newNode.x = x
                    newNode.y = y
                    newNode.t = t
                    newNode.turn = if (curr.turn == 1) 0 else 1
                    pq.add(newNode)
                    moveTime[x][y] = -1
                }
            }
        }
        return -1
    }
}
