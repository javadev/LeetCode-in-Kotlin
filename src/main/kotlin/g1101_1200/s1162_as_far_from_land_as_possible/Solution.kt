package g1101_1200.s1162_as_far_from_land_as_possible

// #Medium #Array #Dynamic_Programming #Breadth_First_Search #Matrix
// #Graph_Theory_I_Day_4_Matrix_Related_Problems

import java.util.LinkedList
import java.util.Objects
import java.util.Queue

class Solution {
    fun maxDistance(grid: Array<IntArray>): Int {
        val q: Queue<IntArray> = LinkedList()
        val n = grid.size
        val m = grid[0].size
        val vis = Array(n) { BooleanArray(m) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (grid[i][j] == 1) {
                    q.add(intArrayOf(i, j))
                    vis[i][j] = true
                }
            }
        }
        if (q.isEmpty() || q.size == n * m) {
            return -1
        }
        val dir = intArrayOf(-1, 0, 1, 0, -1)
        var maxDistance = 0
        var level = 1
        while (!q.isEmpty()) {
            val size = q.size
            for (i in 0 until size) {
                val top = q.poll()
                val currX = Objects.requireNonNull(top)[0]
                val currY = top[1]
                for (j in 0 until dir.size - 1) {
                    val x = currX + dir[j]
                    val y = currY + dir[j + 1]
                    if (x >= 0 && x != n && y >= 0 && y != n && !vis[x][y]) {
                        maxDistance = Math.max(maxDistance, level)
                        vis[x][y] = true
                        q.add(intArrayOf(x, y))
                    }
                }
            }
            level++
        }
        return maxDistance
    }
}
