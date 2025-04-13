package g3501_3600.s3515_shortest_path_in_a_weighted_tree

// #Hard #2025_04_13_Time_72_ms_(100.00%)_Space_188.48_MB_(100.00%)

class Solution {
    private lateinit var `in`: IntArray
    private lateinit var out: IntArray
    private lateinit var baseDist: IntArray
    private lateinit var parent: IntArray
    private lateinit var depth: IntArray
    private var timer = 0
    private lateinit var edgeWeight: IntArray
    private lateinit var adj: Array<MutableList<IntArray>>

    fun treeQueries(n: Int, edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        adj = Array<MutableList<IntArray>>(n + 1) { ArrayList<IntArray>() }
        for (e in edges) {
            val u = e[0]
            val v = e[1]
            val w = e[2]
            adj[u].add(intArrayOf(v, w))
            adj[v].add(intArrayOf(u, w))
        }
        `in` = IntArray(n + 1)
        out = IntArray(n + 1)
        baseDist = IntArray(n + 1)
        parent = IntArray(n + 1)
        depth = IntArray(n + 1)
        edgeWeight = IntArray(n + 1)
        dfs(1, 0, 0)
        val fenw = Fen(n)
        val ansList: MutableList<Int?> = ArrayList<Int?>()
        for (query in queries) {
            if (query[0] == 1) {
                val u = query[1]
                val v = query[2]
                val newW = query[3]
                val child: Int
                if (parent[v] == u) {
                    child = v
                } else if (parent[u] == v) {
                    child = u
                } else {
                    continue
                }
                val diff = newW - edgeWeight[child]
                edgeWeight[child] = newW
                fenw.updateRange(`in`[child], out[child], diff)
            } else {
                val x = query[1]
                val delta = fenw.query(`in`[x])
                ansList.add(baseDist[x] + delta)
            }
        }
        val answer = IntArray(ansList.size)
        for (i in ansList.indices) {
            answer[i] = ansList.get(i)!!
        }
        return answer
    }

    private fun dfs(node: Int, par: Int, dist: Int) {
        parent[node] = par
        baseDist[node] = dist
        depth[node] = if (par == 0) 0 else depth[par] + 1
        `in`[node] = ++timer
        for (neighborInfo in adj[node]) {
            val neighbor = neighborInfo[0]
            val w = neighborInfo[1]
            if (neighbor == par) {
                continue
            }
            edgeWeight[neighbor] = w
            dfs(neighbor, node, dist + w)
        }
        out[node] = timer
    }

    private class Fen(var n: Int) {
        var fenw: IntArray

        init {
            fenw = IntArray(n + 2)
        }

        fun update(i: Int, delta: Int) {
            var i = i
            while (i <= n) {
                fenw[i] += delta
                i += i and -i
            }
        }

        fun updateRange(l: Int, r: Int, delta: Int) {
            update(l, delta)
            update(r + 1, -delta)
        }

        fun query(i: Int): Int {
            var i = i
            var sum = 0
            while (i > 0) {
                sum += fenw[i]
                i -= i and -i
            }
            return sum
        }
    }
}
