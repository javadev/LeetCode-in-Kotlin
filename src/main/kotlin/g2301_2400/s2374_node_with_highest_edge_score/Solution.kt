package g2301_2400.s2374_node_with_highest_edge_score

// #Medium #Hash_Table #Graph #2023_07_02_Time_673_ms_(100.00%)_Space_66.7_MB_(100.00%)

class Solution {
    fun edgeScore(edges: IntArray): Int {
        val a = LongArray(edges.size)
        var max = 0
        for (i in edges.indices) {
            a[edges[i]] += i.toLong()
            if (a[edges[i]] > a[max]) {
                max = edges[i]
            } else if (a[edges[i]] == a[max] && edges[i] < max) max = edges[i]
        }
        return max
    }
}
