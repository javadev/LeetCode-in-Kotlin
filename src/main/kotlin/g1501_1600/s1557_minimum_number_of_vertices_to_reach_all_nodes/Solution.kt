package g1501_1600.s1557_minimum_number_of_vertices_to_reach_all_nodes

// #Medium #Graph #Data_Structure_II_Day_19_Graph #Graph_Theory_I_Day_13_Graph_Theory
// #2023_06_13_Time_792_ms_(99.29%)_Space_85.3_MB_(100.00%)

class Solution {
    fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
        val indegree = IntArray(n)
        for (edge in edges) {
            indegree[edge[1]]++
        }
        val ans: MutableList<Int> = ArrayList()
        for (i in indegree.indices) {
            if (indegree[i] == 0) {
                ans.add(i)
            }
        }
        return ans
    }
}
