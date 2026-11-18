package g4001_4100.s4003_minimum_cost_path_with_alternating_directions_iii

// #Hard #Array #Matrix #Heap_Priority_Queue #Shortest_Path #Graph_Theory #Senior_Staff
// #Weekly_Contest_512 #2026_11_17_Time_349_ms_(100.00%)_Space_139.73_MB_(84.00%)

import java.util.PriorityQueue
import java.util.function.ToLongFunction

class Solution {
    fun minCost(m: Int, n: Int, penalty: Array<IntArray>): Long {
        val inf = Long.MAX_VALUE / 4
        val dist = LongArray(m * n * 2)
        dist.fill(inf)
        val pq =
            PriorityQueue<LongArray>(Comparator.comparingLong<LongArray>(ToLongFunction { a: LongArray? -> a!![0] }))
        dist[0] = 1
        pq.add(longArrayOf(1, 0))
        val dx = intArrayOf(1, 0, -1, 0)
        val dy = intArrayOf(0, 1, 0, -1)
        while (!pq.isEmpty()) {
            val top: LongArray = pq.poll()!!
            val state = top[1].toInt()
            if (top[0] > dist[state]) {
                continue
            }
            val parity = state and 1
            val cell = state shr 1
            val i = cell / n
            val j = cell % n
            if (i == m - 1 && j == n - 1) {
                return top[0]
            }
            val np = parity xor 1
            // wait
            val wait = top[0] + penalty[i][j]
            val ws = (cell shl 1) or np
            if (wait < dist[ws]) {
                dist[ws] = wait
                pq.add(longArrayOf(wait, ws.toLong()))
            }
            for (d in 0..3) {
                val x = i + dx[d]
                val y = j + dy[d]
                if (x < 0 || y < 0 || x >= m || y >= n) {
                    continue
                }
                // right/down
                val forward = d < 2
                // parity 0: next action is odd-numbered
                val follows = (parity == 0) == forward
                val c = top[0] + (x + 1).toLong() * (y + 1) + (if (follows) 0 else penalty[i][j])
                val ns = ((x * n + y) shl 1) or np
                if (c < dist[ns]) {
                    dist[ns] = c
                    pq.add(longArrayOf(c, ns.toLong()))
                }
            }
        }
        return -1
    }
}
