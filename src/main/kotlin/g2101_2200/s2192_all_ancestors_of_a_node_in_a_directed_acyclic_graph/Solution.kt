package g2101_2200.s2192_all_ancestors_of_a_node_in_a_directed_acyclic_graph

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
class Solution {
    private lateinit var adjList: MutableList<MutableList<Int>>
    private lateinit var result: MutableList<MutableList<Int>>

    fun getAncestors(n: Int, edges: Array<IntArray>): List<MutableList<Int>> {
        adjList = ArrayList()
        result = ArrayList()
        for (i in 0 until n) {
            adjList.add(ArrayList())
            result.add(ArrayList())
        }
        for (edge in edges) {
            val start = edge[0]
            val end = edge[1]
            adjList[start].add(end)
        }
        //  DFS for each node from 0 --> n , and add that node as root/parent into each reachable
        // node and their child
        //  Use visited[] to identify if any of the child or their childs are already visited for
        // that perticular root/parent,
        //  so will not add the root to avoid duplicacy and call reduction .
        for (i in 0 until n) {
            val visited = BooleanArray(n)
            val childList: List<Int> = adjList[i]
            for (child in childList) {
                if (!visited[child]) {
                    dfs(i, child, visited)
                }
            }
        }
        return result
    }

    private fun dfs(root: Int, node: Int, visited: BooleanArray) {
        if (visited[node]) {
            return
        }
        visited[node] = true
        result[node].add(root)
        val childList: List<Int> = adjList[node]
        for (child in childList) {
            if (!visited[child]) {
                dfs(root, child, visited)
            }
        }
    }
}
