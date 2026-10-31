package g3701_3800.s3767_maximize_points_after_choosing_k_tasks

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Staff #Biweekly_Contest_171
// #2026_05_08_Time_21_ms_(100.00%)_Space_130.40_MB_(85.82%)

import java.util.PriorityQueue

class Solution {
    fun maxPoints(technique1: IntArray, technique2: IntArray, k: Int): Long {
        val n = technique1.size
        val use2 = n - k
        val min = PriorityQueue<Int>()
        var ans: Long = 0
        for (i in 0..<n) {
            val diff = technique2[i] - technique1[i]
            if (diff > 0) {
                if (min.size < use2) {
                    min.offer(diff)
                    ans += diff.toLong()
                } else if (min.isNotEmpty() && min.peek()!! < diff) {
                    ans -= min.poll()!!.toLong()
                    min.offer(diff)
                    ans += diff.toLong()
                }
            }
            ans += technique1[i].toLong()
        }
        return ans
    }
}
