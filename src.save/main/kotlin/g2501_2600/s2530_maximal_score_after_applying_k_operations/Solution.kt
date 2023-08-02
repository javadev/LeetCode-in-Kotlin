package g2501_2600.s2530_maximal_score_after_applying_k_operations

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2023_07_04_Time_726_ms_(100.00%)_Space_62.4_MB_(100.00%)

import java.util.Collections
import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxKelements(nums: IntArray, k: Int): Long {
        var k = k
        val p = PriorityQueue(Collections.reverseOrder<Int>())
        nums.sort()
        for (i in nums.indices) {
            p.add(nums[nums.size - i - 1])
        }
        var score: Long = 0
        while (k != 0) {
            val v1 = p.poll()
            score += v1.toLong()
            val v2 = Math.ceil(v1.toDouble() / 3).toInt()
            p.add(v2)
            k--
        }
        return score
    }
}
