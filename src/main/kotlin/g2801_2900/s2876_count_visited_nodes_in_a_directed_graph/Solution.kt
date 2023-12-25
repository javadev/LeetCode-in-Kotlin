package g2801_2900.s2876_count_visited_nodes_in_a_directed_graph

// #Hard #Dynamic_Programming #Graph #Memoization
// #2023_12_25_Time_922_ms_(100.00%)_Space_76.6_MB_(100.00%)

class Solution {
    fun countVisitedNodes(edges: List<Int>): IntArray {
        val n = edges.size
        val visited = BooleanArray(n)
        val ans = IntArray(n)
        val level = IntArray(n)
        for (i in 0 until n) {
            if (!visited[i]) {
                visit(edges, 0, i, ans, visited, level)
            }
        }
        return ans
    }

    private fun visit(
        edges: List<Int>,
        count: Int,
        curr: Int,
        ans: IntArray,
        visited: BooleanArray,
        level: IntArray
    ): IntArray {
        if (ans[curr] != 0) {
            return intArrayOf(-1, ans[curr])
        }
        if (visited[curr]) {
            return intArrayOf(level[curr], count - level[curr])
        }
        level[curr] = count
        visited[curr] = true
        val ret = visit(edges, count + 1, edges[curr], ans, visited, level)
        if (ret[0] == -1 || count < ret[0]) {
            ret[1]++
        }
        ans[curr] = ret[1]
        return ret
    }
}
