package g3301_3400.s3310_remove_methods_from_project

// #Medium #Depth_First_Search #Breadth_First_Search #Graph
// #2024_10_12_Time_1465_ms_(100.00%)_Space_201.7_MB_(14.81%)

class Solution {
    private lateinit var graph: Array<IntArray?>
    private lateinit var suspicious: BooleanArray
    private lateinit var visited: BooleanArray

    fun remainingMethods(n: Int, k: Int, invocations: Array<IntArray>): List<Int> {
        pack(invocations, n)
        suspicious = BooleanArray(n)
        visited = BooleanArray(n)
        dfs(k, true)
        visited.fill(false)
        for (i in 0 until n) {
            if (!suspicious[i] && dfs2(i)) {
                visited.fill(false)
                dfs(k, false)
                break
            }
        }
        val rst = ArrayList<Int>()
        for (i in 0 until n) {
            if (!suspicious[i]) {
                rst.add(i)
            }
        }
        return rst
    }

    fun dfs(u: Int, sus: Boolean) {
        if (visited[u]) {
            return
        }
        visited[u] = true
        suspicious[u] = sus
        for (v in graph[u]!!) {
            dfs(v, sus)
        }
    }

    fun dfs2(u: Int): Boolean {
        if (suspicious[u]) {
            return true
        }
        if (visited[u]) {
            return false
        }
        visited[u] = true
        for (v in graph[u]!!) {
            if (dfs2(v)) {
                return true
            }
        }
        return false
    }

    private fun pack(edges: Array<IntArray>, n: Int) {
        val adj = IntArray(n)
        for (edge in edges) {
            adj[edge[0]]++
        }
        graph = arrayOfNulls<IntArray>(n)
        for (i in 0 until n) {
            graph[i] = IntArray(adj[i])
        }
        for (edge in edges) {
            graph[edge[0]]!![--adj[edge[0]]] = edge[1]
        }
    }
}
