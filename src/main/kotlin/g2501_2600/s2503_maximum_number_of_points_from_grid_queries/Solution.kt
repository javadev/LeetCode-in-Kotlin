package g2501_2600.s2503_maximum_number_of_points_from_grid_queries

import java.util.ArrayDeque
import java.util.Arrays
import java.util.PriorityQueue
import java.util.Queue

// #Hard #Array #Sorting #Breadth_First_Search #Heap_Priority_Queue #Union_Find
class Solution {
    private val dirs = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1))
    fun maxPoints(grid: Array<IntArray>, q: IntArray): IntArray {
        val r = grid.size
        val c = grid[0].size
        val res = IntArray(q.size)
        val index = arrayOfNulls<Int>(q.size)
        for (i in q.indices) {
            index[i] = i
        }
        Arrays.sort(index, Comparator.comparingInt { o: Int? -> q[o!!] })
        val q1: Queue<IntArray> = ArrayDeque()
        val q2 = PriorityQueue(Comparator.comparingInt { a: IntArray -> a[2] })
        q2.offer(intArrayOf(0, 0, grid[0][0]))
        val visited = Array(r) { BooleanArray(c) }
        var count = 0
        visited[0][0] = true
        for (i in q.indices) {
            val currLimit = q[index[i]!!]
            while (!q2.isEmpty() && q2.peek()[2] < currLimit) {
                q1.offer(q2.poll())
            }
            while (!q1.isEmpty()) {
                val curr = q1.poll()
                count++
                for (dir in dirs) {
                    val x = dir[0] + curr[0]
                    val y = dir[1] + curr[1]
                    if (x < 0 || y < 0 || x >= r || y >= c || visited[x][y]) {
                        continue
                    }
                    if (!visited[x][y] && grid[x][y] < currLimit) {
                        q1.offer(intArrayOf(x, y, grid[x][y]))
                    } else {
                        q2.offer(intArrayOf(x, y, grid[x][y]))
                    }
                    visited[x][y] = true
                }
            }
            res[index[i]!!] = count
        }
        return res
    }
}
