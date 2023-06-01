package g0901_1000.s0973_k_closest_points_to_origin

// #Medium #Array #Math #Sorting #Heap_Priority_Queue #Divide_and_Conquer #Geometry #Quickselect
// #Data_Structure_II_Day_21_Heap_Priority_Queue #Programming_Skills_II_Day_8
// #2023_05_06_Time_800_ms_(37.89%)_Space_128.1_MB_(7.45%)

import java.util.PriorityQueue

class Solution {
    internal inner class Points(var x: Int, var y: Int) {
        var distanceFromO: Int = x * x + y * y
    }

    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val p = PriorityQueue { a: Points, b: Points -> a.distanceFromO - b.distanceFromO }
        for (pi in points) {
            p.add(Points(pi[0], pi[1]))
        }
        val n = Array(k) { IntArray(2) }
        var i = 0
        while (i < k) {
            val po = p.remove()
            n[i++] = intArrayOf(po.x, po.y)
        }
        return n
    }
}
