package g2501_2600.s2593_find_score_of_an_array_after_marking_all_elements

// #Medium #Array #Sorting #Heap_Priority_Queue #Simulation
// #2023_07_12_Time_738_ms_(100.00%)_Space_58.5_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun findScore(nums: IntArray): Long {
        var ans: Long = 0
        val pq = PriorityQueue { a: IntArray, b: IntArray ->
            if (a[0] == b[0]
            ) a[1] - b[1] else a[0] - b[0]
        }
        val vis = BooleanArray(nums.size)
        for (i in nums.indices) {
            pq.offer(intArrayOf(nums[i], i))
        }
        while (pq.isNotEmpty()) {
            val it = pq.poll()
            if (!vis[it[1]]) {
                vis[it[1]] = true
                ans += it[0].toLong()
                if (it[1] > 0) {
                    vis[it[1] - 1] = true
                }
                if (it[1] < nums.size - 1) {
                    vis[it[1] + 1] = true
                }
            }
        }
        return ans
    }
}
