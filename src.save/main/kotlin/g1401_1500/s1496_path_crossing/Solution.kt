package g1401_1500.s1496_path_crossing

// #Easy #String #Hash_Table #2023_06_13_Time_120_ms_(100.00%)_Space_34.9_MB_(93.33%)

import java.util.Stack

class Solution {
    fun isPathCrossing(path: String): Boolean {
        val visited = Stack<Coord>()
        visited.add(Coord(0, 0))
        for (c in path.toCharArray()) {
            val last = visited.peek()
            if (c == 'N') {
                val nextStep = Coord(last.x, last.y + 1)
                if (visited.contains(nextStep)) {
                    return true
                }
                visited.add(nextStep)
            } else if (c == 'S') {
                val nextStep = Coord(last.x, last.y - 1)
                if (visited.contains(nextStep)) {
                    return true
                }
                visited.add(nextStep)
            } else if (c == 'E') {
                val nextStep = Coord(last.x - 1, last.y)
                if (visited.contains(nextStep)) {
                    return true
                }
                visited.add(nextStep)
            } else if (c == 'W') {
                val nextStep = Coord(last.x + 1, last.y)
                if (visited.contains(nextStep)) {
                    return true
                }
                visited.add(nextStep)
            }
        }
        return false
    }

    internal data class Coord(var x: Int, var y: Int)
}
