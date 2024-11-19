package g1501_1600.s1519_number_of_nodes_in_the_sub_tree_with_the_same_label

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Counting
// #2023_06_12_Time_1130_ms_(87.50%)_Space_290.4_MB_(12.50%)

class Solution {
    fun countSubTrees(n: Int, edges: Array<IntArray>, labelsString: String): IntArray {
        val labelsCount = IntArray(n)
        if (n <= 0) {
            return labelsCount
        }
        val labels = IntArray(n)
        var nodeNumber = 0
        for (label in labelsString.toCharArray()) {
            labels[nodeNumber++] = label.code - 'a'.code
        }
        val graph = ArrayList<ArrayList<Int>>()
        for (i in 0 until n) {
            graph.add(ArrayList())
        }
        for (edge in edges) {
            val parent = edge[0]
            val child = edge[1]
            graph[parent].add(child)
            graph[child].add(parent)
        }
        getLabelsFrequency(0, graph, labels, labelsCount, 0)
        return labelsCount
    }

    private fun getLabelsFrequency(
        root: Int,
        graph: ArrayList<ArrayList<Int>>,
        labels: IntArray,
        labelsCount: IntArray,
        parent: Int,
    ): IntArray {
        val labelsFrequency = IntArray(26)
        val rootLabel = labels[root]
        labelsFrequency[rootLabel]++
        for (child in graph[root]) {
            if (child == parent) {
                continue
            }
            val childLabelsFrequency = getLabelsFrequency(child, graph, labels, labelsCount, root)
            for (i in childLabelsFrequency.indices) {
                labelsFrequency[i] += childLabelsFrequency[i]
            }
        }
        labelsCount[root] = labelsFrequency[rootLabel]
        return labelsFrequency
    }
}
