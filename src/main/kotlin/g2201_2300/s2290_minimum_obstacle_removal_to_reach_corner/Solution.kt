package g2201_2300.s2290_minimum_obstacle_removal_to_reach_corner

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_06_28_Time_765_ms_(100.00%)_Space_66.1_MB_(100.00%)

import java.util.PriorityQueue
import java.util.Queue

class Solution {
    fun minimumObstacles(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))
        val q: Queue<State> = PriorityQueue { a: State, b: State -> a.removed - b.removed }
        q.add(State(0, 0, 0))
        val visited = Array(n) { BooleanArray(m) }
        visited[0][0] = true
        while (q.isNotEmpty()) {
            val state = q.poll()
            if (state.r == n - 1 && state.c == m - 1) {
                return state.removed
            }
            for (d in dirs) {
                val nr = state.r + d[0]
                val nc = state.c + d[1]
                if (nr < 0 || nc < 0 || nr == n || nc == m || visited[nr][nc]) {
                    continue
                }
                visited[nr][nc] = true
                val next = State(nr, nc, state.removed)
                if (grid[nr][nc] == 1) {
                    next.removed++
                }
                q.add(next)
            }
        }
        return -1
    }

    private class State(var r: Int, var c: Int, var removed: Int)
}
