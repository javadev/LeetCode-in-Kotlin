package g0201_0300.s0218_the_skyline_problem

// #Hard #Array #Heap_Priority_Queue #Ordered_Set #Divide_and_Conquer #Segment_Tree
// #Binary_Indexed_Tree #Line_Sweep #2025_03_29_Time_50_ms_(100.00%)_Space_63.12_MB_(10.53%)

import java.util.TreeMap

class Solution {
    fun getSkyline(blds: Array<IntArray>): List<List<Int>> {
        val ans = ArrayList<List<Int>>()
        if (blds.isEmpty()) {
            return ans
        }
        val totalBuildings = blds.size
        val buildings = Array(totalBuildings * 2) { i ->
            if (i % 2 == 0) {
                Building(blds[i/2][0], blds[i/2][2], true)
            } else {
                Building(blds[i/2][1], blds[i/2][2], false)
            }
        }
        buildings.sort()
        val skyline = TreeMap<Int, Int>()
        skyline[0] = 1
        var prevMaxHeight = 0
        for (building in buildings) {
            val height = building.height
            if (building.isStart) {
                skyline[height] = 1 + (skyline[height] ?: 0)
            } else {
                skyline[height] = (skyline[height] ?: 1) - 1
                if (skyline[height] == 0) skyline.remove(height)
            }
            val xCoor = building.xCoor
            val curMaxHeight = skyline.lastKey()
            if (prevMaxHeight != curMaxHeight) {
                ans.add(arrayListOf(xCoor, curMaxHeight))
                prevMaxHeight = curMaxHeight
            }
        }
        return ans
    }

    private class Building(val xCoor: Int, val height: Int, val isStart: Boolean) : Comparable<Building> {
        override fun compareTo(other: Building): Int {
            return COMPARATOR.compare(this, other)
        }

        private companion object {
            private val COMPARATOR = Comparator<Building> { a, b ->
                when {
                    a.xCoor != b.xCoor -> a.xCoor.compareTo(b.xCoor)
                    a.isStart && b.isStart -> b.height.compareTo(a.height)
                    !(a.isStart || b.isStart) -> a.height.compareTo(b.height)
                    else -> if (a.isStart) -1 else 1
                }
            }
        }
    }
}
