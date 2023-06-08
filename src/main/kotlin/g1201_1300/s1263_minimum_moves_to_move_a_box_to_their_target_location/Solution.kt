package g1201_1300.s1263_minimum_moves_to_move_a_box_to_their_target_location

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue
// #2023_06_08_Time_183_ms_(100.00%)_Space_36.4_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private var n = 0
    private var m = 0
    private lateinit var grid: Array<CharArray>
    private val dirs = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1))

    fun minPushBox(grid: Array<CharArray>): Int {
        n = grid.size
        m = grid[0].size
        this.grid = grid
        val box = IntArray(2)
        val target = IntArray(2)
        val player = IntArray(2)
        findLocations(box, target, player)
        val q: Queue<IntArray> = LinkedList()
        q.offer(intArrayOf(box[0], box[1], player[0], player[1]))
        // for 4 directions
        val visited = Array(n) { Array(m) { BooleanArray(4) } }
        var steps = 0
        while (q.isNotEmpty()) {
            var size = q.size
            while (size-- > 0) {
                val cur = q.poll()
                if (cur != null && cur[0] == target[0] && cur[1] == target[1]) {
                    return steps
                }
                for (i in 0..3) {
                    if (cur != null) {
                        val newPlayerLoc = intArrayOf(cur[0] + dirs[i][0], cur[1] + dirs[i][1])
                        val newBoxLoc = intArrayOf(cur[0] - dirs[i][0], cur[1] - dirs[i][1])
                        if (visited[cur[0]][cur[1]][i] ||
                            isOutOfBounds(newPlayerLoc, newBoxLoc) ||
                            !isReachable(newPlayerLoc, cur)
                        ) {
                            continue
                        }
                        visited[cur[0]][cur[1]][i] = true
                        q.offer(intArrayOf(newBoxLoc[0], newBoxLoc[1], cur[0], cur[1]))
                    }
                }
            }
            steps++
        }
        return -1
    }

    private fun isReachable(targetPlayerLoc: IntArray, cur: IntArray): Boolean {
        val visited = Array(n) { BooleanArray(m) }
        visited[cur[0]][cur[1]] = true
        visited[cur[2]][cur[3]] = true
        val q: Queue<IntArray> = LinkedList()
        q.offer(intArrayOf(cur[2], cur[3]))
        while (q.isNotEmpty()) {
            val playerLoc = q.poll()
            if (playerLoc[0] == targetPlayerLoc[0] && playerLoc[1] == targetPlayerLoc[1]) {
                return true
            }
            for (d in dirs) {
                val x = playerLoc[0] + d[0]
                val y = playerLoc[1] + d[1]
                if (isOutOfBounds(x, y) || visited[x][y]) {
                    continue
                }
                visited[x][y] = true
                q.offer(intArrayOf(x, y))
            }
        }
        return false
    }

    private fun isOutOfBounds(player: IntArray, box: IntArray): Boolean {
        return isOutOfBounds(player[0], player[1]) || isOutOfBounds(box[0], box[1])
    }

    private fun isOutOfBounds(x: Int, y: Int): Boolean {
        return x < 0 || y < 0 || x == n || y == m || grid[x][y] == '#'
    }

    private fun findLocations(box: IntArray, target: IntArray, player: IntArray) {
        var p = false
        var t = false
        var b = false
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (grid[i][j] == 'S') {
                    player[0] = i
                    player[1] = j
                    p = true
                } else if (grid[i][j] == 'T') {
                    target[0] = i
                    target[1] = j
                    t = true
                } else if (grid[i][j] == 'B') {
                    box[0] = i
                    box[1] = j
                    b = true
                }
                if (p && b && t) {
                    // found all
                    return
                }
            }
        }
    }
}
