package g3901_4000.s3924_minimum_threshold_path_with_limited_heavy_edges

// #Hard #Breadth_First_Search #Binary_Search #Graph_Theory #Senior_Staff #Biweekly_Contest_182
// #2026_09_29_Time_30_ms_(98.28%)_Space_47.81_MB_(58.62%)

class Solution {
    private lateinit var head: IntArray
    private lateinit var to: IntArray
    private lateinit var weight: IntArray
    private lateinit var next: IntArray
    private var n = 0
    private var source = 0
    private var target = 0
    private var k = 0

    fun minimumThreshold(n: Int, edges: Array<IntArray>, source: Int, target: Int, k: Int): Int {
        if (source == target) {
            return 0
        }
        this.n = n
        this.source = source
        this.target = target
        this.k = k
        // make adj list (you dont have to do this fancy version, standard adj list works)
        val m = edges.size
        this.head = IntArray(n)
        this.to = IntArray(m shl 1)
        this.weight = IntArray(m shl 1)
        this.next = IntArray(m shl 1)
        head.fill(-1)
        for (i in 0..<m) {
            val a = edges[i][0]
            val b = edges[i][1]
            val c = edges[i][2]
            to[i shl 1] = b
            next[i shl 1] = head[a]
            head[a] = i shl 1
            to[i shl 1 or 1] = a
            next[i shl 1 or 1] = head[b]
            head[b] = i shl 1 or 1
            weight[i shl 1 or 1] = c
            weight[i shl 1] = weight[i shl 1 or 1]
        }
        // check if it's possible to reach the target at all
        if (!check(Int.MAX_VALUE)) {
            return -1
        }
        if (k == m) {
            return 0
        }
        var left = 0
        var right = 0
        // set right pointer to max edge weight, cuz any threshold larger than that is pointless
        for (edge in edges) {
            if (edge[2] > right) {
                right = edge[2]
            }
        }
        // binary search on the answer
        while (left < right) {
            val mid = left + right ushr 1
            if (check(mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun check(threshold: Int): Boolean {
        // 0-1 BFS
        val dist = IntArray(n)
        dist.fill(k + 1)
        dist[source] = 0
        val queue = java.util.ArrayDeque<Int>(n)
        queue.add(source)
        while (queue.isNotEmpty()) {
            val current: Int = queue.poll()!!
            if (current == target) {
                return true
            }
            val currentDist = dist[current]
            // go through each adj node (a regular adj list works here as well)
            var i = head[current]
            while (i != -1) {
                val node = to[i]
                val newWeight = if (weight[i] > threshold) 1 else 0
                val newDist = newWeight + currentDist
                if (newDist < dist[node]) {
                    dist[node] = newDist
                    if (newWeight == 0) {
                        queue.addFirst(node)
                    } else {
                        queue.addLast(node)
                    }
                }
                i = next[i]
            }
        }
        return false
    }
}
