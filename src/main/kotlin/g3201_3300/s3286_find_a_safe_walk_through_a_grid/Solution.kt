package g3201_3300.s3286_find_a_safe_walk_through_a_grid

// #Medium #2024_09_17_Time_357_ms_(48.28%)_Space_48.2_MB_(58.62%)

import java.util.LinkedList
import java.util.Objects
import java.util.Queue

class Solution {
    fun findSafeWalk(grid: List<List<Int>>, health: Int): Boolean {
        val n = grid.size
        val m = grid[0].size
        val dr = intArrayOf(0, 0, 1, -1)
        val dc = intArrayOf(1, -1, 0, 0)
        val visited = Array<Array<BooleanArray>?>(n) { Array<BooleanArray>(m) { BooleanArray(health + 1) } }
        val bfs: Queue<IntArray?> = LinkedList<IntArray>()
        bfs.add(intArrayOf(0, 0, health - grid[0][0]))
        visited[0]!![0][health - grid[0][0]] = true
        while (bfs.isNotEmpty()) {
            var size = bfs.size
            while (size-- > 0) {
                val currNode = bfs.poll()
                val r = Objects.requireNonNull<IntArray>(currNode)[0]
                val c = currNode!![1]
                val h = currNode[2]
                if (r == n - 1 && c == m - 1 && h > 0) {
                    return true
                }
                for (k in 0..3) {
                    val nr = r + dr[k]
                    val nc = c + dc[k]
                    if (isValidMove(nr, nc, n, m)) {
                        val nh: Int = h - grid[nr][nc]
                        if (nh >= 0 && !visited[nr]!![nc][nh]) {
                            visited[nr]!![nc][nh] = true
                            bfs.add(intArrayOf(nr, nc, nh))
                        }
                    }
                }
            }
        }
        return false
    }

    private fun isValidMove(r: Int, c: Int, n: Int, m: Int): Boolean {
        return r >= 0 && c >= 0 && r < n && c < m
    }
}
