package g0801_0900.s0834_sum_of_distances_in_tree

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Graph
// #2023_03_27_Time_746_ms_(100.00%)_Space_65.9_MB_(100.00%)

class Solution {
    private var n = 0
    private lateinit var count: IntArray
    private lateinit var answer: IntArray
    private lateinit var graph: Array<MutableList<Int>?>
    private fun postorder(node: Int, parent: Int) {
        for (child in graph[node]!!) {
            if (child != parent) {
                postorder(child, node)
                count[node] += count[child]
                answer[node] += answer[child] + count[child]
            }
        }
    }

    private fun preorder(node: Int, parent: Int) {
        for (child in graph[node]!!) {
            if (child != parent) {
                answer[child] = answer[node] - count[child] + n - count[child]
                preorder(child, node)
            }
        }
    }

    fun sumOfDistancesInTree(n: Int, edges: Array<IntArray>): IntArray {
        this.n = n
        count = IntArray(n)
        answer = IntArray(n)
        graph = arrayOfNulls(n)
        count.fill(1)
        for (i in 0 until n) {
            graph[i] = ArrayList()
        }
        for (edge in edges) {
            graph[edge[0]]?.add(edge[1])
            graph[edge[1]]?.add(edge[0])
        }
        postorder(0, -1)
        preorder(0, -1)
        return answer
    }
}
