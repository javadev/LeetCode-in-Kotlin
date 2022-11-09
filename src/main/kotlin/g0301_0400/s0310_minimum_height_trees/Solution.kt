package g0301_0400.s0310_minimum_height_trees

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
// #2022_11_09_Time_521_ms_(97.56%)_Space_64_MB_(90.24%)

class Solution {
    fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
        if (n == 1) return mutableListOf(0)
        val degrees = IntArray(n) { 0 }
        val graph = buildGraph(degrees, n, edges)
        val queue = ArrayDeque<Int>()
        for ((idxNode, degree) in degrees.withIndex()) {
            if (degree == 1) {
                queue.addLast(idxNode)
            }
        }
        var ans = mutableListOf<Int>()
        while (queue.isNotEmpty()) {
            val size = queue.size
            val newLeaves = mutableListOf<Int>()
            for (_sz in 0 until size) {
                val cur = queue.removeFirst()
                newLeaves.add(cur)
                for (next in graph[cur]) {
                    if (--degrees[next] == 1) {
                        queue.addLast(next)
                    }
                }
            }
            ans = newLeaves
        }
        return ans
    }

    private fun buildGraph(degrees: IntArray, n: Int, edges: Array<IntArray>): Array<ArrayList<Int>> {
        val graph = Array(n) { arrayListOf<Int>() }
        for (edge in edges) {
            val (u, v) = edge
            graph[u].add(v)
            graph[v].add(u)
            ++degrees[u]
            ++degrees[v]
        }
        return graph
    }
}
