package g3201_3300.s3235_check_if_the_rectangle_corner_is_reachable

// #Hard #Array #Math #Depth_First_Search #Breadth_First_Search #Union_Find #Geometry
// #2024_08_03_Time_612_ms_(66.67%)_Space_50.5_MB_(88.89%)

import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun canReachCorner(x: Int, y: Int, circles: Array<IntArray>): Boolean {
        val n = circles.size
        val ds = DisjointSet(n + 5)

        // Special nodes for boundaries
        val leftBoundary = n + 3
        val topBoundary = n
        val rightBoundary = n + 1
        val bottomBoundary = n + 2

        var i = 0
        for (it in circles) {
            val xi = it[0]
            val yi = it[1]
            val ri = it[2]
            if (yi - ri >= y || xi - ri >= x) {
                continue
            }
            if (((xi > (x + y) || yi > y) && (xi > x || yi > x + y))) {
                continue
            }
            if (xi <= ri) {
                ds.dsu(i, leftBoundary)
            }
            if (yi <= ri) {
                ds.dsu(i, topBoundary)
            }
            if (x - xi <= ri) {
                ds.dsu(i, rightBoundary)
            }
            if (y - yi <= ri) {
                ds.dsu(i, bottomBoundary)
            }
            i++
        }

        // Union circles that overlap
        i = 0
        while (i < n) {
            val x1 = circles[i][0]
            val y1 = circles[i][1]
            val r1 = circles[i][2]
            if (y1 - r1 >= y || x1 - r1 >= x) {
                i++
                continue
            }
            if (((x1 > (x + y) || y1 > y) && (x1 > x || y1 > x + y))) {
                i++
                continue
            }

            for (j in i + 1 until n) {
                val x2 = circles[j][0]
                val y2 = circles[j][1]
                val r2 = circles[j][2]
                val dist = sqrt(
                    (x1 - x2.toDouble()).pow(2.0) + (y1 - y2.toDouble()).pow(2.0)
                )
                if (dist <= (r1 + r2)) {
                    ds.dsu(i, j)
                }
            }
            i++
        }

        // Check if left is connected to right or top is connected to bottom
        if (ds.findUpar(leftBoundary) == ds.findUpar(rightBoundary) ||
            ds.findUpar(leftBoundary) == ds.findUpar(topBoundary)
        ) {
            return false
        }
        return (
            ds.findUpar(bottomBoundary) != ds.findUpar(rightBoundary) &&
                ds.findUpar(bottomBoundary) != ds.findUpar(topBoundary)
            )
    }

    private class DisjointSet(n: Int) {
        private val parent: IntArray
        private val size = IntArray(n + 1)

        init {
            size.fill(1)
            parent = IntArray(n + 1)
            for (i in 0..n) {
                parent[i] = i
            }
        }

        fun findUpar(u: Int): Int {
            if (u == parent[u]) {
                return u
            }
            parent[u] = findUpar(parent[u])
            return parent[u]
        }

        fun dsu(u: Int, v: Int) {
            val ulpu = findUpar(u)
            val ulpv = findUpar(v)
            if (ulpv == ulpu) {
                return
            }
            if (size[ulpu] < size[ulpv]) {
                parent[ulpu] = ulpv
                size[ulpv] += size[ulpu]
            } else {
                parent[ulpv] = ulpu
                size[ulpu] += size[ulpv]
            }
        }
    }
}
