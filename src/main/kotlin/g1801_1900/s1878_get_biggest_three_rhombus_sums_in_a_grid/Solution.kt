package g1801_1900.s1878_get_biggest_three_rhombus_sums_in_a_grid

import java.util.PriorityQueue

// #Medium #Array #Math #Sorting #Matrix #Heap_Priority_Queue #Prefix_Sum
class Solution {
    fun getBiggestThree(grid: Array<IntArray>): IntArray {
        val capicity = 3
        val minHeap = PriorityQueue<Int>()
        val m = grid.size
        val n = grid[0].size
        val preSum = Array(m) { Array(n) { IntArray(2) } }
        val maxLen = Math.min(m, n) / 2
        for (r in 0 until m) {
            for (c in 0 until n) {
                addToMinHeap(minHeap, grid[r][c], capicity)
                preSum[r][c][0] += if (valid(m, n, r - 1, c - 1)) grid[r][c] + preSum[r - 1][c - 1][0] else grid[r][c]
                preSum[r][c][1] += if (valid(m, n, r - 1, c + 1)) grid[r][c] + preSum[r - 1][c + 1][1] else grid[r][c]
            }
        }
        for (r in 0 until m) {
            for (c in 0 until n) {
                for (l in 1..maxLen) {
                    if (!valid(m, n, r - l, c - l) ||
                        !valid(m, n, r - l, c + l) ||
                        !valid(m, n, r - 2 * l, c)
                    ) {
                        break
                    }
                    var rhombus = preSum[r][c][0] - preSum[r - l][c - l][0]
                    rhombus += preSum[r][c][1] - preSum[r - l][c + l][1]
                    rhombus += preSum[r - l][c - l][1] - preSum[r - 2 * l][c][1]
                    rhombus += preSum[r - l][c + l][0] - preSum[r - 2 * l][c][0]
                    rhombus += -grid[r][c] + grid[r - 2 * l][c]
                    addToMinHeap(minHeap, rhombus, capicity)
                }
            }
        }
        val size = minHeap.size
        val res = IntArray(size)
        for (i in size - 1 downTo 0) {
            res[i] = minHeap.poll()
        }
        return res
    }

    private fun addToMinHeap(minHeap: PriorityQueue<Int>, num: Int, capicity: Int) {
        if (minHeap.isEmpty() || minHeap.size < capicity && !minHeap.contains(num)) {
            minHeap.offer(num)
        } else {
            if (num > minHeap.peek() && !minHeap.contains(num)) {
                minHeap.poll()
                minHeap.offer(num)
            }
        }
    }

    private fun valid(m: Int, n: Int, r: Int, c: Int): Boolean {
        return 0 <= r && r < m && 0 <= c && c < n
    }
}
