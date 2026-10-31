package g3801_3900.s3812_minimum_edge_toggles_on_a_tree

// #Hard #Sorting #Depth_First_Search #Tree #Topological_Sort #Graph_Theory #Senior_Staff
// #Biweekly_Contest_174 #2026_06_09_Time_89_ms_(86.67%)_Space_303.92_MB_(28.33%)

class Solution {
    private lateinit var visited: BooleanArray
    private lateinit var adjList: Array<ArrayList<IntArray>>
    private lateinit var flips: IntArray
    private lateinit var ans: MutableList<Int>
    private lateinit var s: String
    private lateinit var t: String

    fun minimumFlips(n: Int, edges: Array<IntArray>, start: String, target: String): MutableList<Int> {
        s = start
        t = target
        flips = IntArray(n)
        adjList = Array(n) { ArrayList<IntArray>() }
        for (i in edges.indices) {
            val edge = edges[i]
            adjList[edge[0]].add(intArrayOf(edge[1], i))
            adjList[edge[1]].add(intArrayOf(edge[0], i))
        }
        ans = ArrayList()
        visited = BooleanArray(n)
        dfs(0, -1, -1)
        // Sort indices as required
        val sortedAns = ans.sorted().toMutableList()
        // If root is still mismatched, it's impossible (no parent to flip)
        if (mismatch(0)) {
            sortedAns.clear()
            sortedAns.add(-1)
        }
        return sortedAns
    }

    // Helper to check if current state matches target
    // Logic: If flips is even, bit is original. If flips is odd, bit is inverted.
    private fun mismatch(u: Int): Boolean = ((flips[u] % 2 == 0) && s[u] != t[u]) ||
        ((flips[u] % 2 == 1) && s[u] == t[u])

    private fun dfs(u: Int, parent: Int, index: Int) {
        visited[u] = true
        for (v in adjList[u]) {
            if (!visited[v[0]]) {
                dfs(v[0], u, v[1])
            }
        }
        if (parent != -1 && mismatch(u)) {
            ans.add(index)
            flips[u]++
            flips[parent]++
        }
    }
}
