package g0901_1000.s0939_minimum_area_rectangle

// #Medium #Array #Hash_Table #Math #Sorting #Geometry
// #2023_04_29_Time_461_ms_(100.00%)_Space_74.8_MB_(20.00%)

import java.util.Arrays
import kotlin.math.abs

class Solution {
    fun minAreaRect(points: Array<IntArray>): Int {
        if (points.size < 4) {
            return 0
        }
        val map: MutableMap<Int, MutableSet<Int>> = HashMap()
        for (p in points) {
            map.putIfAbsent(p[0], HashSet())
            map[p[0]]!!.add(p[1])
        }
        Arrays.sort(
            points
        ) { a: IntArray, b: IntArray ->
            if (a[0] == b[0]) Integer.compare(
                a[1],
                b[1]
            ) else Integer.compare(a[0], b[0])
        }
        var min = Int.MAX_VALUE
        for (i in 0 until points.size - 2) {
            for (j in i + 1 until points.size - 1) {
                val p1 = points[i]
                val p2 = points[j]
                val area = abs((p1[0] - p2[0]) * (p1[1] - p2[1]))
                if (area >= min || area == 0) {
                    continue
                }
                if (map[p1[0]]!!.contains(p2[1]) && map[p2[0]]!!.contains(p1[1])) {
                    min = area
                }
            }
        }
        return if (min == Int.MAX_VALUE) 0 else min
    }
}
