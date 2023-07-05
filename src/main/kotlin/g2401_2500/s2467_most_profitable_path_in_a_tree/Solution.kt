package g2401_2500.s2467_most_profitable_path_in_a_tree

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Tree #Graph
// #2023_07_05_Time_850_ms_(100.00%)_Space_103.8_MB_(100.00%)

class Solution {
    fun mostProfitablePath(edges: Array<IntArray>, bob: Int, amount: IntArray): Int {
        // Time: O(E); Space: O(N + E)
        // build graph
        val graph: Array<MutableList<Int>> = Array(amount.size) { ArrayList<Int>() }
        for (edge in edges) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }
        return helperDfs(graph, 0, bob, amount, BooleanArray(amount.size), 1)[0]
    }

    // Time: O(N); Space: O(N)
    private fun helperDfs(
        graph: Array<MutableList<Int>>,
        node: Int,
        bob: Int,
        amount: IntArray,
        seen: BooleanArray,
        height: Int
    ): IntArray {
        var res = Int.MIN_VALUE
        seen[node] = true
        var bobPathLen = if (node == bob) 1 else 0
        for (nextNode in graph[node]) {
            if (seen[nextNode]) continue
            val tmp = helperDfs(graph, nextNode, bob, amount, seen, height + 1)
            if (tmp[1] > 0) bobPathLen = tmp[1] + 1
            res = Math.max(res, tmp[0])
        }
        if (bobPathLen in 1..height) {
            if (bobPathLen == height) amount[node] = amount[node] / 2 else amount[node] = 0
        }
        return intArrayOf(if (res == Int.MIN_VALUE) amount[node] else amount[node] + res, bobPathLen)
    }
}
