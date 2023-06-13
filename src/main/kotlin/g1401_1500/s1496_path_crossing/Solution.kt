package g1401_1500.s1496_path_crossing

import java.util.ArrayDeque
import java.util.Deque
import java.util.Objects

// #Easy #String #Hash_Table
class Solution {
    fun isPathCrossing(path: String): Boolean {
        val visited: Deque<Coord> = ArrayDeque()
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

    private class Coord(var x: Int, var y: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }
            if (other == null || javaClass != other.javaClass) {
                return false
            }
            val coord = other as Coord
            return x == coord.x && y == coord.y
        }

        override fun hashCode(): Int {
            return Objects.hash(x, y)
        }
    }
}
