package g2601_2700.s2612_minimum_reverse_operations

// #Hard #Array #Breadth_First_Search #Ordered_Set
// #2023_07_14_Time_923_ms_(100.00%)_Space_66.3_MB_(66.67%)

class Solution {
    fun minReverseOperations(n: Int, p: Int, banned: IntArray, k: Int): IntArray {
        val out = IntArray(n)
        out.fill(-1)
        for (node in banned) {
            out[node] = -2
        }
        var nodes: MutableList<Int> = ArrayList()
        nodes.add(p)
        var depth = 0
        out[p] = depth
        val step = k - 1
        val nextNode2s = IntArray(n + 1)
        for (i in 0 until n + 1) {
            nextNode2s[i] = i + 2
        }
        while (nodes.isNotEmpty()) {
            depth++
            val newNodes: MutableList<Int> = ArrayList()
            for (node1 in nodes) {
                val loReverseStart = Math.max(node1 - step, 0)
                val hiReverseStart = Math.min(node1, n - k)
                val loNode2 = 2 * loReverseStart + k - 1 - node1
                val hiNode2 = 2 * hiReverseStart + k - 1 - node1
                val postHiNode2 = hiNode2 + 2
                var node2 = loNode2
                while (node2 <= hiNode2) {
                    val nextNode2 = nextNode2s[node2]
                    nextNode2s[node2] = postHiNode2
                    if (node2 >= 0 && node2 < n && out[node2] == -1) {
                        newNodes.add(node2)
                        out[node2] = depth
                    }
                    node2 = nextNode2
                }
            }
            nodes = newNodes
        }
        for (i in 0 until n) {
            if (out[i] == -2) {
                out[i] = -1
            }
        }
        return out
    }
}
