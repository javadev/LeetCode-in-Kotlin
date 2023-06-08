package g1201_1300.s1210_minimum_moves_to_reach_target_with_rotations

import java.util.LinkedList
import java.util.Objects
import java.util.Queue

// #Hard #Array #Breadth_First_Search #Matrix
class Solution {
    fun minimumMoves(grid: Array<IntArray>): Int {
        val n = grid.size
        val visited = Array(n) { IntArray(n) }
        val bq: Queue<IntArray> = LinkedList()
        bq.offer(intArrayOf(0, 0, 1))
        visited[0][0] = visited[0][0] or 1
        var level = 0
        while (!bq.isEmpty()) {
            val levelSize = bq.size
            for (l in 0 until levelSize) {
                val cur = bq.poll()
                val xtail = Objects.requireNonNull(cur)[0]
                val ytail = cur[1]
                val dir = cur[2]
                if (xtail == n - 1 && ytail == n - 2 && dir == 1) {
                    return level
                }
                val xhead = xtail + if (dir == 1) 0 else 1
                val yhead = ytail + if (dir == 1) 1 else 0
                if (dir == 2) {
                    if (ytail + 1 < n && grid[xtail][ytail + 1] != 1 && grid[xtail + 1][ytail + 1] != 1) {
                        if (visited[xtail][ytail] and 1 == 0) {
                            bq.offer(intArrayOf(xtail, ytail, 1))
                            visited[xtail][ytail] = visited[xtail][ytail] or 1
                        }
                        if (visited[xtail][ytail + 1] and 2 == 0) {
                            bq.offer(intArrayOf(xtail, ytail + 1, 2))
                            visited[xtail][ytail + 1] = visited[xtail][ytail + 1] or 2
                        }
                    }
                    if (xhead + 1 < n && grid[xhead + 1][yhead] != 1 && visited[xhead][yhead] and 2 == 0) {
                        bq.offer(intArrayOf(xhead, yhead, 2))
                        visited[xhead][yhead] = visited[xhead][yhead] or 2
                    }
                } else {
                    if (xtail + 1 < n && grid[xtail + 1][ytail] != 1 && grid[xtail + 1][ytail + 1] != 1) {
                        if (visited[xtail][ytail] and 2 == 0) {
                            bq.offer(intArrayOf(xtail, ytail, 2))
                            visited[xtail][ytail] = visited[xtail][ytail] or 2
                        }
                        if (visited[xtail + 1][ytail] and 1 == 0) {
                            bq.offer(intArrayOf(xtail + 1, ytail, 1))
                            visited[xtail + 1][ytail] = visited[xtail + 1][ytail] or 1
                        }
                    }
                    if (yhead + 1 < n && grid[xhead][yhead + 1] != 1 && visited[xhead][yhead] and 1 == 0) {
                        bq.offer(intArrayOf(xhead, yhead, 1))
                        visited[xhead][yhead] = visited[xhead][yhead] or 1
                    }
                }
            }
            level += 1
        }
        return -1
    }
}
