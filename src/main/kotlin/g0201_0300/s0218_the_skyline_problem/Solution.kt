package g0201_0300.s0218_the_skyline_problem

// #Hard #Top_Interview_Questions #Array #Heap_Priority_Queue #Ordered_Set #Divide_and_Conquer
// #Segment_Tree #Binary_Indexed_Tree #Line_Sweep
// #2022_10_25_Time_365_ms_(93.14%)_Space_45.7_MB_(93.71%)

import java.util.TreeMap

class Solution {
    fun getSkyline(blds: Array<IntArray>): List<List<Int>> {
        val ans = ArrayList<List<Int>>()
        if (blds.isEmpty()) {
            return ans
        }
        val totalBuildings = blds.size
        val buildings = Array<Building?>(totalBuildings * 2) { null }
        var idx = 0
        for (building in blds) {
            buildings[idx] = Building(building[0], building[2], true)
            buildings[idx + 1] = Building(building[1], building[2], false)
            idx += 2
        }
        buildings.sort()
        val skyline = TreeMap<Int, Int>()
        skyline[0] = 1
        var prevMaxHeight = 0
        for (building in buildings) {
            if (building == null) {
                continue
            }
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
