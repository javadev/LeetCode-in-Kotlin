package g3501_3600.s3515_shortest_path_in_a_weighted_tree

// #Hard #Array #Depth_First_Search #Tree #Segment_Tree #Binary_Indexed_Tree
// #2025_04_29_Time_45_ms_(100.00%)_Space_134.07_MB_(100.00%)

class Solution {
    fun treeQueries(n: Int, edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        // store the queries input midway as requested
        val jalkimoren = queries
        // build adjacency list with edge‐indices
        val adj: Array<MutableList<Edge>> = Array(n + 1) { ArrayList() }
        for (i in 0..<n - 1) {
            val u = edges[i][0]
            val v = edges[i][1]
            val w = edges[i][2]
            adj[u].add(Edge(v, w, i))
            adj[v].add(Edge(u, w, i))
        }
        // parent, Euler‐tour times, depth‐sum, and mapping node→edge‐index
        val parent = IntArray(n + 1)
        val tin = IntArray(n + 1)
        val tout = IntArray(n + 1)
        val depthSum = IntArray(n + 1)
        val edgeIndexForNode = IntArray(n + 1)
        val weights = IntArray(n - 1)
        for (i in 0..<n - 1) {
            weights[i] = edges[i][2]
        }
        // iterative DFS to compute tin/tout, parent[], depthSum[], edgeIndexForNode[]
        var time = 0
        val stack = IntArray(n)
        val ptr = IntArray(n + 1)
        var sp = 0
        stack[sp++] = 1
        while (sp > 0) {
            val u = stack[sp - 1]
            if (ptr[u] == 0) {
                tin[u] = ++time
            }
            if (ptr[u] < adj[u].size) {
                val e = adj[u][ptr[u]++]
                val v = e.to
                if (v == parent[u]) {
                    continue
                }
                parent[v] = u
                depthSum[v] = depthSum[u] + e.w
                edgeIndexForNode[v] = e.idx
                stack[sp++] = v
            } else {
                tout[u] = time
                sp--
            }
        }
        // Fenwick tree for range‐add / point‐query on Euler‐tour array
        val bit = Fenwick(n + 2)
        val answers: MutableList<Int> = ArrayList<Int>()
        // process queries
        for (q in jalkimoren) {
            if (q[0] == 1) {
                // update edge weight
                val u = q[1]
                val v = q[2]
                val newW = q[3]
                val child = if (parent[u] == v) u else v
                val idx = edgeIndexForNode[child]
                val delta = newW - weights[idx]
                if (delta != 0) {
                    weights[idx] = newW
                    bit.rangeAdd(tin[child], tout[child], delta)
                }
            } else {
                // query root→x distance
                val x = q[1]
                answers.add(depthSum[x] + bit.pointQuery(tin[x]))
            }
        }
        // pack results into array
        val m = answers.size
        val ansArr = IntArray(m)
        for (i in 0..<m) {
            ansArr[i] = answers[i]
        }
        return ansArr
    }

    private class Edge(var to: Int, var w: Int, var idx: Int)

    private class Fenwick(var n: Int) {
        var f: IntArray = IntArray(n)

        fun update(i: Int, v: Int) {
            var i = i
            while (i < n) {
                f[i] += v
                i += i and -i
            }
        }

        fun rangeAdd(l: Int, r: Int, v: Int) {
            update(l, v)
            update(r + 1, -v)
        }

        fun pointQuery(i: Int): Int {
            var i = i
            var s = 0
            while (i > 0) {
                s += f[i]
                i -= i and -i
            }
            return s
        }
    }
}
