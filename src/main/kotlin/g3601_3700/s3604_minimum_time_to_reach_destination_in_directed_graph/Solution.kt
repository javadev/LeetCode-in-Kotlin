package g3601_3700.s3604_minimum_time_to_reach_destination_in_directed_graph

// #Medium #Heap_Priority_Queue #Graph #Shortest_Path
// #2025_07_07_Time_18_ms_(100.00%)_Space_132.61_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minTime(n: Int, edges: Array<IntArray>): Int {
        val head = IntArray(n)
        val to = IntArray(edges.size)
        val start = IntArray(edges.size)
        val end = IntArray(edges.size)
        val next = IntArray(edges.size)
        head.fill(-1)
        for (i in edges.indices) {
            val u = edges[i][0]
            to[i] = edges[i][1]
            start[i] = edges[i][2]
            end[i] = edges[i][3]
            next[i] = head[u]
            head[u] = i
        }
        val heap = IntArray(n)
        val time = IntArray(n)
        val pos = IntArray(n)
        val visited = BooleanArray(n)
        var size = 0
        for (i in 0..<n) {
            time[i] = INF
            pos[i] = -1
        }
        time[0] = 0
        heap[size] = 0
        pos[0] = 0
        size++
        while (size > 0) {
            val u = heap[0]
            heap[0] = heap[--size]
            pos[heap[0]] = 0
            heapifyDown(heap, time, pos, size, 0)
            if (visited[u]) {
                continue
            }
            visited[u] = true
            if (u == n - 1) {
                return time[u]
            }
            var e = head[u]
            while (e != -1) {
                val v = to[e]
                val t0 = time[u]
                if (t0 > end[e]) {
                    e = next[e]
                    continue
                }
                val arrival = max(t0, start[e]) + 1
                if (arrival < time[v]) {
                    time[v] = arrival
                    if (pos[v] == -1) {
                        heap[size] = v
                        pos[v] = size
                        heapifyUp(heap, time, pos, size)
                        size++
                    } else {
                        heapifyUp(heap, time, pos, pos[v])
                    }
                }
                e = next[e]
            }
        }
        return -1
    }

    private fun heapifyUp(heap: IntArray, time: IntArray, pos: IntArray, i: Int) {
        var i = i
        while (i > 0) {
            val p = (i - 1) / 2
            if (time[heap[p]] <= time[heap[i]]) {
                break
            }
            swap(heap, pos, i, p)
            i = p
        }
    }

    private fun heapifyDown(heap: IntArray, time: IntArray, pos: IntArray, size: Int, i: Int) {
        var i = i
        while (2 * i + 1 < size) {
            var j = 2 * i + 1
            if (j + 1 < size && time[heap[j + 1]] < time[heap[j]]) {
                j++
            }
            if (time[heap[i]] <= time[heap[j]]) {
                break
            }
            swap(heap, pos, i, j)
            i = j
        }
    }

    private fun swap(heap: IntArray, pos: IntArray, i: Int, j: Int) {
        val tmp = heap[i]
        heap[i] = heap[j]
        heap[j] = tmp
        pos[heap[i]] = i
        pos[heap[j]] = j
    }

    companion object {
        private const val INF = Int.Companion.MAX_VALUE
    }
}
