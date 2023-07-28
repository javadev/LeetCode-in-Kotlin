package g2601_2700.s2685_count_the_number_of_complete_components

// #Medium #Graph #Depth_First_Search #Breadth_First_Search
// #2023_07_28_Time_378_ms_(100.00%)_Space_58.3_MB_(66.67%)

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var parent: IntArray
    private lateinit var rank: IntArray
    private lateinit var edgeCount: IntArray
    private lateinit var verticesCount: IntArray

    private fun find(i: Int): Int {
        var i = i
        if (parent[i] != i) {
            parent[i] = parent[parent[i]]
            i = parent[i]
        }
        return i
    }

    private fun union(edge: IntArray) {
        val p1 = find(edge[0])
        val p2 = find(edge[1])
        edgeCount[p1]++
        if (p1 == p2) {
            return
        }
        if (rank[p1] < rank[p2]) {
            parent[p1] = p2
            edgeCount[p2] += edgeCount[p1]
            verticesCount[p2] += verticesCount[p1]
        } else {
            parent[p2] = p1
            edgeCount[p1] += edgeCount[p2]
            verticesCount[p1] += verticesCount[p2]
            if (rank[p1] == rank[p2]) {
                rank[p1]++
            }
        }
    }

    private fun init(n: Int) {
        edgeCount = IntArray(n)
        rank = IntArray(n)
        verticesCount = IntArray(n)
        verticesCount.fill(1)
        parent = IntArray(n)
        for (i in 0 until n) {
            parent[i] = i
        }
    }

    fun countCompleteComponents(n: Int, edges: Array<IntArray>): Int {
        init(n)
        for (edge in edges) {
            union(edge)
        }
        var count = 0
        for (i in 0 until n) {
            if (parent[i] == i && edgeCount[i] == verticesCount[i] * (verticesCount[i] - 1) / 2) {
                count++
            }
        }
        return count
    }
}
