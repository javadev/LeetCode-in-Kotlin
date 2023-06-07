package g1401_1500.s1443_minimum_time_to_collect_all_apples_in_a_tree

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree
@Suppress("UNUSED_PARAMETER")
class Solution {
    fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
        val visited: MutableSet<Int> = HashSet()
        val graph: MutableMap<Int, MutableList<Int>> = HashMap()
        for (edge in edges) {
            val vertexA = edge[0]
            val vertexB = edge[1]
            graph.computeIfAbsent(vertexA) { _: Int? -> ArrayList() }.add(vertexB)
            graph.computeIfAbsent(vertexB) { _: Int? -> ArrayList() }.add(vertexA)
        }
        visited.add(0)
        val steps = helper(graph, hasApple, 0, visited)
        return if (steps > 0) steps - 2 else 0
    }

    private fun helper(
        graph: Map<Int, MutableList<Int>>,
        hasApple: List<Boolean>,
        node: Int,
        visited: MutableSet<Int>
    ): Int {
        var steps = 0
        for (child in graph.getOrDefault(node, emptyList<Int>())) {
            if (visited.contains(child)) {
                continue
            } else {
                visited.add(child)
            }
            steps += helper(graph, hasApple, child, visited)
        }
        return if (steps > 0) {
            steps + 2
        } else if (java.lang.Boolean.TRUE == hasApple[node]) {
            2
        } else {
            0
        }
    }
}
