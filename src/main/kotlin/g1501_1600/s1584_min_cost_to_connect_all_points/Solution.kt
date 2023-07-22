package g1501_1600.s1584_min_cost_to_connect_all_points

// #Medium #Array #Union_Find #Minimum_Spanning_Tree
// #2023_06_14_Time_331_ms_(95.12%)_Space_44.5_MB_(95.12%)

import java.util.PriorityQueue

class Solution {
    fun minCostConnectPoints(points: Array<IntArray>): Int {
        val v = points.size
        if (v == 2) {
            return getDistance(points[0], points[1])
        }
        val pq = PriorityQueue(v, Pair())
        val mst = BooleanArray(v)
        val dist = IntArray(v)
        val parent = IntArray(v)
        dist.fill(1000000)
        parent.fill(-1)
        dist[0] = 0
        parent[0] = 0
        for (i in 0 until v) {
            pq.add(Pair(dist[i], i))
        }
        constructMST(parent, points, mst, pq, dist)
        var cost = 0
        for (i in 1 until parent.size) {
            cost += getDistance(points[parent[i]], points[i])
        }
        return cost
    }

    private fun constructMST(
        parent: IntArray,
        points: Array<IntArray>,
        mst: BooleanArray,
        pq: PriorityQueue<Pair>,
        dist: IntArray
    ) {
        if (!containsFalse(mst)) {
            return
        }
        val newPair = pq.poll()
        val pointIndex: Int = newPair.v
        mst[pointIndex] = true
        for (i in parent.indices) {
            val d = getDistance(points[pointIndex], points[i])
            if (!mst[i] && d < dist[i]) {
                dist[i] = d
                pq.add(Pair(dist[i], i))
                parent[i] = pointIndex
            }
        }
        constructMST(parent, points, mst, pq, dist)
    }

    private fun containsFalse(mst: BooleanArray): Boolean {
        for (b in mst) {
            if (!b) {
                return true
            }
        }
        return false
    }

    private fun getDistance(p1: IntArray, p2: IntArray): Int {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1])
    }

    class Pair : Comparator<Pair> {
        var dis = 0
        var v = 0

        constructor()
        constructor(dis: Int, v: Int) {
            this.dis = dis
            this.v = v
        }

        override fun compare(p1: Pair, p2: Pair): Int {
            return p1.dis - p2.dis
        }
    }
}
