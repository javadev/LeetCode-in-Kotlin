package g2301_2400.s2359_find_closest_node_to_given_two_nodes

// #Medium #Depth_First_Search #Graph
@Suppress("NAME_SHADOWING")
class Solution {
    fun closestMeetingNode(edges: IntArray, node1: Int, node2: Int): Int {
        val n = edges.size
        val m1 = arrayOfNulls<Int>(n)
        val m2 = arrayOfNulls<Int>(n)
        dfs(edges, m1, node1)
        dfs(edges, m2, node2)
        var index = -1
        var dist = Int.MAX_VALUE
        for (i in 0 until n) {
            if (m1[i] != null && m2[i] != null && dist > Math.max(m1[i]!!, m2[i]!!)) {
                dist = Math.max(m1[i]!!, m2[i]!!)
                index = i
            }
        }
        return index
    }

    private fun dfs(edges: IntArray, memo: Array<Int?>, node: Int) {
        var node = node
        var dist = 0
        while (node != -1 && memo[node] == null) {
            memo[node] = dist++
            node = edges[node]
        }
    }
}
