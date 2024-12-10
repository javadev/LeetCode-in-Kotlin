package g3301_3400.s3382_maximum_area_rectangle_with_point_constraints_ii

// #Hard #Array #Math #Sorting #Geometry #Segment_Tree #Binary_Indexed_Tree
// #2024_12_10_Time_518_ms_(100.00%)_Space_103.7_MB_(100.00%)

import java.util.TreeSet
import kotlin.math.max

class Solution {
    fun maxRectangleArea(xCoord: IntArray, yCoord: IntArray): Long {
        if (xCoord.size < 4) {
            return -1
        }
        val pair = xCoord.zip(yCoord) { x, y -> Pair(x, y) }.toTypedArray()
        pair.sort()
        val map = HashMap<Int?, Pair>()
        val yVals = TreeSet<Int?>()
        var best: Long = -1
        for (i in 0..<pair.size - 1) {
            if (yVals.isNotEmpty()) {
                val y0 = pair[i].y
                var y1 = yVals.floor(y0)
                while (y1 != null) {
                    val p1: Pair = map[y1]!!
                    if (p1.y < y0) {
                        break
                    }
                    if (y1 == y0 && pair[i + 1].x == pair[i].x && pair[i + 1].y == p1.y) {
                        val dY = p1.y - y0.toLong()
                        val dX = pair[i].x - p1.x.toLong()
                        best = max(dY * dX, best)
                    }
                    if (p1.x != pair[i].x) {
                        yVals.remove(y1)
                    }
                    y1 = yVals.lower(y1)
                }
            }
            if (pair[i].x == pair[i + 1].x) {
                yVals.add(pair[i].y)
                map.put(pair[i].y, pair[i + 1])
            }
        }
        return best
    }

    private class Pair(val x: Int, val y: Int) : Comparable<Pair> {
        override fun compareTo(p: Pair): Int {
            return if (x == p.x) y - p.y else x - p.x
        }
    }
}
