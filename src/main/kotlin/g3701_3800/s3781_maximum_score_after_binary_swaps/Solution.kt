package g3701_3800.s3781_maximum_score_after_binary_swaps

import java.util.PriorityQueue

// #Medium #Array #String #Greedy #Heap_Priority_Queue #Staff #Biweekly_Contest_172
// #2026_05_06_Time_39_ms_(96.47%)_Space_118.00_MB_(29.41%)

class Solution {
    fun maximumScore(nums: IntArray, s: String): Long {
        var sum: Long = 0
        val pq = PriorityQueue<Int>(Comparator { a: Int?, b: Int? -> Integer.compare(b!!, a!!) })
        for (i in nums.indices) {
            if (s[i] == '1') {
                if (pq.isEmpty() || pq.peek()!! <= nums[i]) {
                    sum += nums[i].toLong()
                } else {
                    sum += pq.poll()!!.toLong()
                    pq.add(nums[i])
                }
            } else {
                pq.add(nums[i])
            }
        }
        return sum
    }
}
