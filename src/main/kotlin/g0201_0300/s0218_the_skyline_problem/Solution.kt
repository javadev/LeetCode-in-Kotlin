package g0201_0300.s0218_the_skyline_problem

import java.util.TreeMap

// #Hard #Top_Interview_Questions #Array #Heap_Priority_Queue #Ordered_Set #Divide_and_Conquer
// #Segment_Tree #Binary_Indexed_Tree #Line_Sweep
// #2022_07_02_Time_22_ms_(76.93%)_Space_52.3_MB_(45.14%)
class Solution {
    fun getSkyline(buildings: Array<IntArray>): List<List<Int>> {
        val list: MutableList<List<Int>> = ArrayList()
        val lines: MutableList<IntArray> = ArrayList()
        for (building in buildings) {
            lines.add(intArrayOf(building[0], building[2]))
            lines.add(intArrayOf(building[1], -building[2]))
        }
        lines.sortWith { a: IntArray, b: IntArray -> if (a[0] == b[0]) b[1] - a[1] else a[0] - b[0] }
        val map = TreeMap<Int, Int>()
        map[0] = 1
        var prev = 0
        for (line in lines) {
            if (line[1] > 0) {
                map[line[1]] = map.getOrDefault(line[1], 0) + 1
            } else {
                val f = map[-line[1]]!!
                if (f == 1) {
                    map.remove(-line[1])
                } else {
                    map[-line[1]] = f - 1
                }
            }
            val curr = map.lastKey()
            if (curr != prev) {
                list.add(listOf(line[0], curr))
                prev = curr
            }
        }
        return list
    }
}
