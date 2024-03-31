package g3001_3100.s3067_count_pairs_of_connectable_servers_in_a_weighted_tree_network

// #Medium #Array #Depth_First_Search #Tree #2024_03_31_Time_578_ms_(83.33%)_Space_59.5_MB_(45.83%)

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var adj: Array<ArrayList<Int>>

    fun countPairsOfConnectableServers(edges: Array<IntArray>, signalSpeed: Int): IntArray {
        val n = edges.size + 1
        adj = Array(n) { ArrayList() }
        for (i in 0 until n) {
            adj[i] = ArrayList()
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val w = edge[2]
            adj[u].add(v)
            adj[v].add(u)
            adj[u].add(w)
            adj[v].add(w)
        }
        val res = IntArray(n)
        for (i in 0 until n) {
            if (adj[i].size > 2) {
                val al = ArrayList<Int>()
                var j = 0
                while (j < adj[i].size) {
                    val cnt = IntArray(1)
                    dfs(adj[i][j], i, adj[i][j + 1], cnt, signalSpeed)
                    al.add(cnt[0])
                    j += 2
                }
                var sum = 0
                for (j in al) {
                    res[i] += (sum * j)
                    sum += j
                }
            }
        }
        return res
    }

    fun dfs(node: Int, par: Int, sum: Int, cnt: IntArray, ss: Int) {
        if (sum % ss == 0) {
            cnt[0]++
        }
        var i = 0
        while (i < adj[node].size) {
            val child = adj[node][i]
            if (child != par) {
                dfs(child, node, sum + adj[node][i + 1], cnt, ss)
            }
            i += 2
        }
    }
}
