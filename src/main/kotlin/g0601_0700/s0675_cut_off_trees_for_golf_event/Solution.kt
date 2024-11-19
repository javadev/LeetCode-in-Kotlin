package g0601_0700.s0675_cut_off_trees_for_golf_event

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue
// #2023_02_15_Time_777_ms_(100.00%)_Space_43.4_MB_(100.00%)

import java.util.LinkedList
import java.util.Objects
import java.util.PriorityQueue
import java.util.Queue

class Solution {
    private var r = 0
    private var c = 0
    fun cutOffTree(forest: List<List<Int>>): Int {
        val pq = PriorityQueue<Int>()
        for (integers in forest) {
            for (v in integers) {
                if (v > 1) {
                    pq.add(v)
                }
            }
        }
        var steps = 0
        while (pq.isNotEmpty()) {
            val count = minSteps(forest, pq.poll())
            if (count == -1) {
                return -1
            }
            steps += count
        }
        return steps
    }

    private fun minSteps(forest: List<List<Int>>, target: Int): Int {
        var steps = 0
        val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))
        val visited = Array(forest.size) {
            BooleanArray(
                forest[0].size,
            )
        }
        val q: Queue<IntArray> = LinkedList()
        q.add(intArrayOf(r, c))
        visited[r][c] = true
        while (q.isNotEmpty()) {
            val qSize = q.size
            for (i in 0 until qSize) {
                val curr = q.poll()
                if (forest[Objects.requireNonNull(curr)[0]][curr[1]] == target) {
                    r = curr[0]
                    c = curr[1]
                    return steps
                }
                for (k in 0..3) {
                    val dir = dirs[k]
                    val nr = dir[0] + curr[0]
                    val nc = dir[1] + curr[1]
                    if (nr < 0 || nr == visited.size || nc < 0 || nc == visited[0].size ||
                        visited[nr][nc] || forest[nr][nc] == 0
                    ) {
                        continue
                    }
                    q.add(intArrayOf(nr, nc))
                    visited[nr][nc] = true
                }
            }
            steps++
        }
        return -1
    }
}
