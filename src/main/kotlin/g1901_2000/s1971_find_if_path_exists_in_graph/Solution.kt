package g1901_2000.s1971_find_if_path_exists_in_graph

// #Easy #Depth_First_Search #Breadth_First_Search #Graph
// #2023_06_21_Time_949_ms_(86.89%)_Space_123_MB_(93.44%)

class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, end: Int): Boolean {
        val visited = BooleanArray(n)
        visited[source] = true
        var newVisit = true
        while (!visited[end] && newVisit) {
            newVisit = false
            for (i in edges.indices.reversed()) {
                if (visited[edges[i][0]]) {
                    if (!visited[edges[i][1]]) {
                        newVisit = true
                        visited[edges[i][1]] = newVisit
                    }
                } else if (visited[edges[i][1]]) {
                    newVisit = true
                    visited[edges[i][0]] = newVisit
                }
            }
        }
        return visited[end]
    }
}
