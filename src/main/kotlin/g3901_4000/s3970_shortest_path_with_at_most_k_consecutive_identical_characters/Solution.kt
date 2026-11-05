package g3901_4000.s3970_shortest_path_with_at_most_k_consecutive_identical_characters

// #Medium #String #Heap_Priority_Queue #Shortest_Path #Graph_Theory #Staff #Weekly_Contest_507
// #2026_11_03_Time_40_ms_(97.73%)_Space_198.21_MB_(98.49%)

import java.util.PriorityQueue

class Solution {
    private class Node(var city: Int, var w: Long, var ch: Int)

    fun shortestPath(n: Int, edges: Array<IntArray>, labelschars: String, k: Int): Int {
        val chars = IntArray(n)
        val labels = labelschars.toCharArray()
        chars.fill(Int.MAX_VALUE)
        val adj: MutableList<MutableList<IntArray>?> = ArrayList<MutableList<IntArray>?>()
        for (i in 0..<n) {
            adj.add(ArrayList<IntArray>())
        }
        for (edge in edges) {
            adj[edge[0]]!!.add(intArrayOf(edge[1], edge[2]))
        }
        val pq = PriorityQueue<Node>(Comparator { a: Node, b: Node -> a.w.compareTo(b.w) })
        pq.add(Node(0, 0, 1))
        while (pq.isNotEmpty()) {
            val nd = pq.poll()
            if (nd.ch >= chars[nd.city]) {
                continue
            }
            chars[nd.city] = nd.ch
            if (nd.city == n - 1) {
                return nd.w.toInt()
            }
            addNeighbors(nd, adj, labels, k, pq)
        }
        return -1
    }

    private fun addNeighbors(
        nd: Node,
        adj: MutableList<MutableList<IntArray>?>,
        labels: CharArray,
        k: Int,
        pq: PriorityQueue<Node>,
    ) {
        for (nbr in adj[nd.city]!!) {
            val nextCity = nbr[0]
            val totalCh = getNextCharCount(nd.ch, labels[nd.city], labels[nextCity])
            if (nd.city != nextCity && totalCh <= k) {
                val totalWeight = nd.w + nbr[1]
                pq.add(Node(nextCity, totalWeight, totalCh))
            }
        }
    }

    private fun getNextCharCount(ch: Int, current: Char, next: Char): Int = if (current == next) ch + 1 else 1
}
