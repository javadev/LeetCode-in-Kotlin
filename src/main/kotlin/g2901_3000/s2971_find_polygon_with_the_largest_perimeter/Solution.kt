package g2901_3000.s2971_find_polygon_with_the_largest_perimeter

// #Medium #Array #Sorting #Greedy #Prefix_Sum
// #2024_01_19_Time_534_ms_(97.06%)_Space_68.3_MB_(76.47%)

import java.util.Collections
import java.util.PriorityQueue

class Solution {
    fun largestPerimeter(nums: IntArray): Long {
        var sum = 0L
        val pq = PriorityQueue(Collections.reverseOrder<Long>())
        for (i in nums) {
            pq.add(i.toLong())
            sum = (sum + i)
        }
        while (pq.size >= 3) {
            val curr = pq.poll()
            if (sum - curr > curr) {
                return sum
            } else {
                sum -= curr
            }
        }
        return -1
    }
}
