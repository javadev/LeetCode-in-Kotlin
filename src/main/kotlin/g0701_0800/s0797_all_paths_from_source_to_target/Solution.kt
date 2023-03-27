package g0701_0800.s0797_all_paths_from_source_to_target

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Backtracking
// #Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_7_Standard_Traversal
// #2023_03_15_Time_232_ms_(100.00%)_Space_38.4_MB_(100.00%)

class Solution {
    private var res: MutableList<List<Int>>? = null
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        res = ArrayList()
        val temp: MutableList<Int> = ArrayList()
        temp.add(0)
        // perform DFS
        solve(graph, temp, 0)
        return res as ArrayList<List<Int>>
    }

    private fun solve(graph: Array<IntArray>, temp: MutableList<Int>, lastNode: Int) {
        if (lastNode == graph.size - 1) {
            res!!.add(ArrayList(temp))
        }
        for (link in graph[lastNode]) {
            temp.add(link)
            solve(graph, temp, link)
            temp.removeAt(temp.size - 1)
        }
    }
}
