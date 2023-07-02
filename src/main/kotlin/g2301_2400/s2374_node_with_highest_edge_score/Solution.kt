package g2301_2400.s2374_node_with_highest_edge_score

// #Medium #Hash_Table #Graph
class Solution {
    fun edgeScore(edges: IntArray): Int {
        val n = edges.size
        val score = IntArray(n)
        var maxScore = 0
        var node = 0
        for (i in 0 until n) {
            score[edges[i]] += i
            if (score[edges[i]] >= maxScore) {
                node = if (score[edges[i]] == maxScore) {
                    Math.min(node, edges[i])
                } else {
                    edges[i]
                }
                maxScore = score[edges[i]]
            }
        }
        return node
    }
}
