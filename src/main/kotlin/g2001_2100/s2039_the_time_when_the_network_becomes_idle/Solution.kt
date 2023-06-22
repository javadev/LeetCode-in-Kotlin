package g2001_2100.s2039_the_time_when_the_network_becomes_idle

import java.util.PriorityQueue

// #Medium #Array #Breadth_First_Search #Graph
class Solution {
    fun networkBecomesIdle(edges: Array<IntArray>, pat: IntArray): Int {
        val n = pat.size
        val adj = ArrayList<ArrayList<Int>>()
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        for (arr in edges) {
            adj[arr[0]].add(arr[1])
            adj[arr[1]].add(arr[0])
        }
        val distance = IntArray(n)
        distance.fill(99999)
        distance[0] = 0
        val pq = PriorityQueue { a1: IntArray, a2: IntArray ->
            Integer.compare(
                a1[1], a2[1]
            )
        }
        pq.add(intArrayOf(0, 0))
        while (!pq.isEmpty()) {
            val a = pq.poll()
            val node = a[0]
            for (nn in adj[node]) {
                if (distance[node] + 1 < distance[nn]) {
                    distance[nn] = 1 + distance[node]
                    pq.add(intArrayOf(nn, distance[nn]))
                }
            }
        }
        var max = 0
        for (i in 1 until n) {
            val num1 = 2 * distance[i]
            var num2 = num1 / pat[i]
            if (num1 % pat[i] != 0) {
                num2++
            }
            num2--
            num2 *= pat[i]
            max = Math.max(max, num2 + num1)
        }
        return max + 1
    }
}
