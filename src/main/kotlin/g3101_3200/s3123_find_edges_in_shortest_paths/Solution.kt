package g3101_3200.s3123_find_edges_in_shortest_paths

// #Hard #Depth_First_Search #Breadth_First_Search #Heap_Priority_Queue #Graph #Shortest_Path
// #2024_04_27_Time_931_ms_(100.00%)_Space_90_MB_(89.47%)

import java.util.PriorityQueue

class Solution {
    private lateinit var edge: IntArray
    private lateinit var weight: IntArray
    private lateinit var next: IntArray
    private lateinit var head: IntArray
    private var index = 0

    private fun add(u: Int, v: Int, w: Int) {
        edge[index] = v
        weight[index] = w
        next[index] = head[u]
        head[u] = index++
    }

    fun findAnswer(n: Int, edges: Array<IntArray>): BooleanArray {
        val m = edges.size
        edge = IntArray(m shl 1)
        weight = IntArray(m shl 1)
        next = IntArray(m shl 1)
        head = IntArray(n)
        for (i in 0 until n) {
            head[i] = -1
        }
        index = 0
        for (localEdge in edges) {
            val u = localEdge[0]
            val v = localEdge[1]
            val w = localEdge[2]
            add(u, v, w)
            add(v, u, w)
        }
        val pq = PriorityQueue { a: LongArray, b: LongArray -> if (a[1] < b[1]) -1 else 1 }
        val distances = LongArray(n)
        distances.fill(1e12.toLong())
        pq.offer(longArrayOf(0, 0))
        distances[0] = 0
        while (pq.isNotEmpty()) {
            val cur = pq.poll()
            val u = cur[0].toInt()
            val distance = cur[1]
            if (distance > distances[u]) {
                continue
            }
            if (u == n - 1) {
                break
            }
            var localIndex = head[u]
            while (localIndex != -1) {
                val v = edge[localIndex]
                val w = weight[localIndex]
                val newDistance = distance + w
                if (newDistance < distances[v]) {
                    distances[v] = newDistance
                    pq.offer(longArrayOf(v.toLong(), newDistance))
                }
                localIndex = next[localIndex]
            }
        }
        val ans = BooleanArray(m)
        if (distances[n - 1] >= 1e12.toLong()) {
            return ans
        }
        dfs(distances, n - 1, -1, ans)
        return ans
    }

    private fun dfs(distances: LongArray, u: Int, pre: Int, ans: BooleanArray) {
        var localIndex = head[u]
        while (localIndex != -1) {
            val v = edge[localIndex]
            val w = weight[localIndex]
            val i = localIndex shr 1
            if (distances[v] + w != distances[u]) {
                localIndex = next[localIndex]
                continue
            }
            ans[i] = true
            if (v == pre) {
                localIndex = next[localIndex]
                continue
            }
            dfs(distances, v, u, ans)
            localIndex = next[localIndex]
        }
    }
}
