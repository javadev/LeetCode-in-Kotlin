package g3501_3600.s3588_find_maximum_area_of_a_triangle

// #Medium #Array #Hash_Table #Math #Greedy #Enumeration #Geometry
// #2025_06_23_Time_470_ms_(100.00%)_Space_194.74_MB_(100.00%)

import java.util.TreeSet
import kotlin.math.abs
import kotlin.math.max

class Solution {
    fun maxArea(coords: Array<IntArray>): Long {
        val xMap: MutableMap<Int, TreeSet<Int>> = HashMap<Int, TreeSet<Int>>()
        val yMap: MutableMap<Int, TreeSet<Int>> = HashMap<Int, TreeSet<Int>>()
        val allX = TreeSet<Int>()
        val allY = TreeSet<Int>()
        for (coord in coords) {
            val x = coord[0]
            val y = coord[1]
            xMap.computeIfAbsent(x) { _: Int -> TreeSet<Int>() }.add(y)
            yMap.computeIfAbsent(y) { _: Int -> TreeSet<Int>() }.add(x)
            allX.add(x)
            allY.add(y)
        }
        var ans = Long.Companion.MIN_VALUE
        for (entry in xMap.entries) {
            val x: Int = entry.key
            val ySet: TreeSet<Int> = entry.value
            if (ySet.size < 2) {
                continue
            }
            val minY: Int = ySet.first()!!
            val maxY: Int = ySet.last()!!
            val base = maxY - minY
            val minX: Int = allX.first()!!
            val maxX: Int = allX.last()!!
            if (minX != x) {
                ans = max(ans, abs(x - minX).toLong() * base)
            }
            if (maxX != x) {
                ans = max(ans, abs(x - maxX).toLong() * base)
            }
        }

        for (entry in yMap.entries) {
            val y: Int = entry.key
            val xSet: TreeSet<Int> = entry.value
            if (xSet.size < 2) {
                continue
            }
            val minX: Int = xSet.first()!!
            val maxX: Int = xSet.last()!!
            val base = maxX - minX
            val minY: Int = allY.first()!!
            val maxY: Int = allY.last()!!
            if (minY != y) {
                ans = max(ans, abs(y - minY).toLong() * base)
            }
            if (maxY != y) {
                ans = max(ans, abs(y - maxY).toLong() * base)
            }
        }
        return if (ans == Long.Companion.MIN_VALUE) -1 else ans
    }
}
