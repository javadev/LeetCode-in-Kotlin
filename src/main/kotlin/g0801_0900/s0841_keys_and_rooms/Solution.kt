package g0801_0900.s0841_keys_and_rooms

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Data_Structure_II_Day_19_Graph
// #Graph_Theory_I_Day_7_Standard_Traversal #2023_03_28_Time_189_ms_(69.23%)_Space_35.5_MB_(97.44%)

import java.util.TreeSet

class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>?>): Boolean {
        val visited: MutableSet<Int> = HashSet()
        visited.add(0)
        val treeSet = TreeSet(rooms[0])
        while (!treeSet.isEmpty()) {
            val key = treeSet.pollFirst()
            if (!visited.add(key)) {
                continue
            }
            if (visited.size == rooms.size) {
                return true
            }
            treeSet.addAll(rooms[key]!!)
        }
        return visited.size == rooms.size
    }
}
