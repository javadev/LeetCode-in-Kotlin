package g0801_0900.s0882_reachable_nodes_in_subdivided_graph

// #Hard #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_04_08_Time_434_ms_(100.00%)_Space_52_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun reachableNodes(edges: Array<IntArray>, maxMoves: Int, n: Int): Int {
        val adList = getAdList(edges, n)
        val pQueue = PriorityQueue { a: IntArray, b: IntArray ->
            a[1] - b[1]
        }
        val minDis = IntArray(n)
        var res = 0
        pQueue.add(intArrayOf(0, 0))
        while (pQueue.isNotEmpty()) {
            val poll = pQueue.poll()
            val node = poll[0]
            val dist = poll[1]
            if (minDis[node] > 0) continue
            res++
            minDis[node] = dist
            for (child in adList[node]!!) {
                val cNode = child!![0]
                val weight = child[1]
                if (cNode != 0 && minDis[cNode] == 0) {
                    res += (maxMoves - dist).coerceAtMost(weight)
                    val cNodeDist = dist + weight + 1
                    if (cNodeDist <= maxMoves) pQueue.add(intArrayOf(cNode, cNodeDist))
                } else {
                    res += (weight - (maxMoves - minDis[cNode]).coerceAtMost(weight)).coerceAtMost(
                        (maxMoves - dist).coerceAtMost(weight)
                    )
                }
            }
        }
        return res
    }

    private fun getAdList(edges: Array<IntArray>, n: Int): Array<ArrayList<IntArray?>?> {
        val adList: Array<ArrayList<IntArray?>?> = arrayOfNulls<ArrayList<IntArray?>?>(n)
        adList[0] = ArrayList()
        for (edge in edges) {
            val s = edge[0]
            val d = edge[1]
            val w = edge[2]
            if (adList[s] == null) adList[s] = ArrayList()
            if (adList[d] == null) adList[d] = ArrayList()
            adList[s]?.add(intArrayOf(d, w))
            adList[d]?.add(intArrayOf(s, w))
        }
        return adList
    }
}
