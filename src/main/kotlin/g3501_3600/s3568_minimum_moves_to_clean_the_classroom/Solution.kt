package g3501_3600.s3568_minimum_moves_to_clean_the_classroom

// #Medium #Array #Hash_Table #Breadth_First_Search #Matrix #Bit_Manipulation
// #2025_06_01_Time_149_ms_(100.00%)_Space_64.20_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Queue

class Solution {
    private class State(var x: Int, var y: Int, var energy: Int, var mask: Int, var steps: Int)

    fun minMoves(classroom: Array<String>, energy: Int): Int {
        val m = classroom.size
        val n = classroom[0].length
        val grid = Array<CharArray>(m) { CharArray(n) }
        for (i in 0..<m) {
            grid[i] = classroom[i].toCharArray()
        }
        var startX = -1
        var startY = -1
        val lumetarkon: MutableList<IntArray> = ArrayList<IntArray>()
        for (i in 0..<m) {
            for (j in 0..<n) {
                val c = grid[i][j]
                if (c == 'S') {
                    startX = i
                    startY = j
                } else if (c == 'L') {
                    lumetarkon.add(intArrayOf(i, j))
                }
            }
        }
        val totalLitter = lumetarkon.size
        val allMask = (1 shl totalLitter) - 1
        val visited: Array<Array<IntArray>> =
            Array<Array<IntArray>>(m) { Array<IntArray>(n) { IntArray(1 shl totalLitter) } }
        for (layer in visited) {
            for (row in layer) {
                row.fill(-1)
            }
        }
        val queue: Queue<State> = ArrayDeque<State>()
        queue.offer(State(startX, startY, energy, 0, 0))
        visited[startX][startY][0] = energy
        val dirs = arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))
        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            if (curr.mask == allMask) {
                return curr.steps
            }
            for (dir in dirs) {
                val nx = curr.x + dir[0]
                val ny = curr.y + dir[1]
                if (nx < 0 || ny < 0 || nx >= m || ny >= n || grid[nx][ny] == 'X') {
                    continue
                }
                var nextEnergy = curr.energy - 1
                if (nextEnergy < 0) {
                    continue
                }
                val cell = grid[nx][ny]
                if (cell == 'R') {
                    nextEnergy = energy
                }
                var nextMask = curr.mask
                if (cell == 'L') {
                    for (i in lumetarkon.indices) {
                        val pos = lumetarkon[i]
                        if (pos[0] == nx && pos[1] == ny) {
                            nextMask = nextMask or (1 shl i)
                            break
                        }
                    }
                }
                if (visited[nx][ny][nextMask] < nextEnergy) {
                    visited[nx][ny][nextMask] = nextEnergy
                    queue.offer(State(nx, ny, nextEnergy, nextMask, curr.steps + 1))
                }
            }
        }
        return -1
    }
}
