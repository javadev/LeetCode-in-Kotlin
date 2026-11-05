package g3901_4000.s3977_minimum_time_to_reach_target_with_limited_power

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Shortest_Path #Graph_Theory #Senior_Staff
// #Weekly_Contest_508 #2026_11_03_Time_7_ms_(98.67%)_Space_47.66_MB_(96.00%)

class Solution {
    private class Graph(n: Int, edges: Array<IntArray>) {
        var head: IntArray
        var next: IntArray
        var to: IntArray
        var time: IntArray

        init {
            val m = edges.size
            head = IntArray(n)
            next = IntArray(m + 1)
            to = IntArray(m + 1)
            time = IntArray(m + 1)
            for (i in 0..<m) {
                val u = edges[i][0]
                to[i + 1] = edges[i][1]
                time[i + 1] = edges[i][2]
                next[i + 1] = head[u]
                head[u] = i + 1
            }
        }
    }

    private class MinHeap {
        var heap: LongArray = LongArray(2048)
        var size: Int = 0

        fun push(value: Long) {
            if (++size == heap.size) {
                heap = heap.copyOf(heap.size shl 1)
            }
            var j = size
            while (j > 1) {
                val p = j ushr 1
                if (heap[p] <= value) {
                    break
                }
                heap[j] = heap[p]
                j = p
            }
            heap[j] = value
        }

        fun pop(): Long {
            val result = heap[1]
            val `val` = heap[size--]
            var i = 1
            while ((i shl 1) <= size) {
                val left = i shl 1
                val right = left + 1
                val min = if (right <= size && heap[right] < heap[left]) right else left
                if (`val` <= heap[min]) {
                    break
                }
                heap[i] = heap[min]
                i = min
            }
            if (size > 0) {
                heap[i] = `val`
            }
            return result
        }

        val isEmpty: Boolean
            get() = size == 0
    }

    fun minTimeMaxPower(
        n: Int,
        edges: Array<IntArray>,
        power: Int,
        cost: IntArray,
        source: Int,
        target: Int,
    ): LongArray {
        val graph = Graph(n, edges)
        val bestPower = IntArray(n)
        bestPower.fill(-1)
        val pq = MinHeap()
        val startPowerComp = 1024L - power
        pq.push((startPowerComp shl 11) or source.toLong())
        while (!pq.isEmpty) {
            val curr = pq.pop()
            val currTime = curr ushr 22
            val currPower = 1024 - ((curr ushr 11) and 0x7FFL).toInt()
            val u = (curr and 0x7FFL).toInt()
            if (u == target) {
                return longArrayOf(currTime, currPower.toLong())
            }
            if (currPower > bestPower[u]) {
                bestPower[u] = currPower
                if (currPower >= cost[u]) {
                    addNeighbors(pq, currTime, currPower, u, graph, cost)
                }
            }
        }
        return longArrayOf(-1, -1)
    }

    private fun addNeighbors(pq: MinHeap, currTime: Long, currPower: Int, u: Int, graph: Graph, cost: IntArray) {
        val nextPower = currPower - cost[u]
        val nextPowerComp = 1024L - nextPower
        var e = graph.head[u]
        while (e != 0) {
            val nextPacked =
                ((currTime + graph.time[e]) shl 22) or (nextPowerComp shl 11) or graph.to[e].toLong()
            pq.push(nextPacked)
            e = graph.next[e]
        }
    }
}
