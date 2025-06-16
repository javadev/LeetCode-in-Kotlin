package g3501_3600.s3585_find_weighted_median_node_in_tree

// #Hard #2025_06_16_Time_169_ms_(100.00%)_Space_171.76_MB_(100.00%)

class Solution {
    private var log = 0
    private lateinit var dist: LongArray
    private lateinit var depth: IntArray
    private lateinit var up: Array<IntArray>

    fun findMedian(n: Int, edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val adj: MutableList<MutableList<IntArray>?> = ArrayList<MutableList<IntArray>?>()
        for (i in 0..<n) {
            adj.add(ArrayList<IntArray>())
        }
        for (edge in edges) {
            adj[edge[0]]!!.add(intArrayOf(edge[1], edge[2]))
            adj[edge[1]]!!.add(intArrayOf(edge[0], edge[2]))
        }
        dist = LongArray(n)
        depth = IntArray(n)
        log = 0
        while (1 shl log < n) {
            log++
        }
        up = Array(n) { IntArray(log) }
        for (u in up) {
            u.fill(-1)
        }
        dfs(0, -1, adj, 0, 0)
        val ans = IntArray(queries.size)
        for (i in queries.indices) {
            val query = queries[i]
            var first = query[0]
            var second = query[1]
            val distance = getDistance(first, second)
            var needed = (distance + 1) / 2
            val mid = lca(first, second)
            if (getDistance(first, mid) < needed) {
                needed -= getDistance(first, mid)
                first = mid
            } else {
                second = mid
            }
            if (depth[first] <= depth[second]) {
                var curDistance = getDistance(first, second)
                for (j in log - 1 downTo 0) {
                    if (up[second][j] == -1 ||
                        curDistance - getDistance(up[second][j], second) < needed
                    ) {
                        continue
                    }
                    curDistance -= getDistance(up[second][j], second)
                    second = up[second][j]
                }
                ans[i] = second
            } else {
                var curDistance: Long = 0
                for (j in log - 1 downTo 0) {
                    if (up[first][j] == -1 ||
                        curDistance + getDistance(up[first][j], first) >= needed
                    ) {
                        continue
                    }
                    curDistance += getDistance(up[first][j], first)
                    first = up[first][j]
                }
                ans[i] = up[first][0]
            }
        }
        return ans
    }

    private fun getDistance(from: Int, to: Int): Long {
        if (from == to) {
            return 0
        }
        val ancesor = lca(from, to)
        return dist[from] + dist[to] - 2 * dist[ancesor]
    }

    private fun lca(first: Int, second: Int): Int {
        var first = first
        var second = second
        if (depth[first] < depth[second]) {
            return lca(second, first)
        }
        for (i in log - 1 downTo 0) {
            if (depth[first] - (1 shl i) >= depth[second]) {
                first = up[first][i]
            }
        }
        if (first == second) {
            return second
        }
        for (i in log - 1 downTo 0) {
            if (depth[first] != -1 && up[first][i] != up[second][i]) {
                first = up[first][i]
                second = up[second][i]
            }
        }
        first = up[first][0]
        return first
    }

    private fun dfs(current: Int, parent: Int, adj: MutableList<MutableList<IntArray>?>, curDist: Long, curDepth: Int) {
        up[current][0] = parent
        for (i in 1..<log) {
            if (up[current][i - 1] != -1) {
                up[current][i] = up[up[current][i - 1]][i - 1]
            }
        }
        dist[current] = curDist
        depth[current] = curDepth
        for (next in adj[current]!!) {
            if (next[0] == parent) {
                continue
            }
            dfs(next[0], current, adj, curDist + next[1], curDepth + 1)
        }
    }
}
