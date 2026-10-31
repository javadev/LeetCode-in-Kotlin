package g3801_3900.s3820_pythagorean_distance_nodes_in_a_tree

// #Medium #Breadth_First_Search #Tree #Staff #Weekly_Contest_486
// #2026_06_09_Time_96_ms_(90.83%)_Space_234.88_MB_(70.83%)

class Solution {
    fun bfs(n: Int, adj: Array<MutableList<Int>>, start: Int): IntArray {
        val dist = IntArray(n)
        dist.fill(-1)
        dist[start] = 0
        val q = java.util.ArrayDeque<Int>()
        q.add(start)
        while (!q.isEmpty()) {
            val u: Int = q.poll()!!
            for (v in adj[u]) {
                // Check if this neighbour was not visited yet
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1
                    q.add(v)
                }
            }
        }
        return dist
    }

    fun specialNodes(n: Int, edges: Array<IntArray>, x: Int, y: Int, z: Int): Int {
        val adj: Array<MutableList<Int>> = Array<MutableList<Int>>(n) { ArrayList() }
        for (i in 0..<n) {
            adj[i] = ArrayList<Int>()
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            adj[u].add(v)
            adj[v].add(u)
        }
        // Calculate distances from every node to x, y and z
        val dx = bfs(n, adj, x)
        val dy = bfs(n, adj, y)
        val dz = bfs(n, adj, z)
        var result = 0
        for (i in 0..<n) {
            var a = dx[i].toLong()
            var b = dy[i]
            var c = dz[i]
            // Ensure a <= b <= c
            if (a > b) {
                val t = a
                a = b.toLong()
                b = t.toInt()
            }
            if (b > c) {
                val t = b.toLong()
                b = c
                c = t.toInt()
            }
            if (a > b) {
                val t = a
                a = b.toLong()
                b = t.toInt()
            }
            result += if (a * a + b.toLong() * b == c.toLong() * c) 1 else 0
        }
        return result
    }
}
