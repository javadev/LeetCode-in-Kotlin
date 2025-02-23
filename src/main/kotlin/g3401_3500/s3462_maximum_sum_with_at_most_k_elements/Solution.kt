package g3401_3500.s3462_maximum_sum_with_at_most_k_elements

// #Medium #2025_02_23_Time_202_ms_(100.00%)_Space_107.52_MB_(100.00%)

import java.util.Collections
import java.util.PriorityQueue

class Solution {
    fun maxSum(grid: Array<IntArray>, limits: IntArray, k: Int): Long {
        if (grid.isEmpty()) {
            return 0
        }
        val pq = PriorityQueue<Int>(Collections.reverseOrder<Int>())
        var temp: PriorityQueue<Int>?
        for (i in grid.indices) {
            temp = PriorityQueue<Int>(Collections.reverseOrder<Int>())
            for (j in grid[i].indices) {
                temp.add(grid[i][j])
            }
            var cnt = 0
            while (temp.isNotEmpty() && cnt < limits[i]) {
                pq.add(temp.poll())
                cnt += 1
            }
        }
        var result: Long = 0
        var count: Long = 0
        while (pq.isNotEmpty() && count < k) {
            result += pq.poll()!!.toLong()
            count += 1
        }
        return result
    }
}
