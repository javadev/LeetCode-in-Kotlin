package g2001_2100.s2097_valid_arrangement_of_pairs

// #Hard #Depth_First_Search #Graph #Eulerian_Circuit
// #2023_06_28_Time_2120_ms_(100.00%)_Space_143.1_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

@Suppress("NAME_SHADOWING")
class Solution {
    fun validArrangement(pairs: Array<IntArray>): Array<IntArray> {
        val inOutedge = HashMap<Int, IntArray>()
        val adList = getAdList(pairs, inOutedge)
        val start = getStart(inOutedge)
        val res = Array(pairs.size) { IntArray(2) }
        getRes(start, adList, res, pairs.size - 1)
        return res
    }

    private fun getAdList(
        pairs: Array<IntArray>,
        inOutEdge: HashMap<Int, IntArray>
    ): HashMap<Int, Queue<Int>> {
        val adList = HashMap<Int, Queue<Int>>()
        for (pair in pairs) {
            val s = pair[0]
            val d = pair[1]
            val set = adList.computeIfAbsent(s) { _: Int? -> LinkedList() }
            set.add(d)
            val sEdgeCnt = inOutEdge.computeIfAbsent(s) { _: Int? -> IntArray(2) }
            val dEdgeCnt = inOutEdge.computeIfAbsent(d) { _: Int? -> IntArray(2) }
            sEdgeCnt[1]++
            dEdgeCnt[0]++
        }
        return adList
    }

    private fun getRes(k: Int, adList: HashMap<Int, Queue<Int>>, res: Array<IntArray>, idx: Int): Int {
        var idx = idx
        val edges = adList[k] ?: return idx
        while (!edges.isEmpty()) {
            val edge = edges.poll()
            idx = getRes(edge, adList, res, idx)
            res[idx--] = intArrayOf(k, edge)
        }
        return idx
    }

    private fun getStart(map: HashMap<Int, IntArray>): Int {
        var start = -1
        for ((k, value) in map) {
            val inEdge = value[0]
            val outEdge = value[1]
            start = k
            if (outEdge - inEdge == 1) {
                return k
            }
        }
        return start
    }
}
