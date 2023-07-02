package g1601_1700.s1675_minimize_deviation_in_array

// #Hard #Array #Greedy #Heap_Priority_Queue #Ordered_Set
// #2023_06_15_Time_769_ms_(100.00%)_Space_49.8_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun minimumDeviation(nums: IntArray): Int {
        val pq = PriorityQueue { a: Int, b: Int -> b - a }
        var min = Int.MAX_VALUE
        for (num in nums) {
            val localNum = if (num % 2 == 1) {
                num * 2
            } else {
                num
            }
            min = Math.min(min, localNum)
            pq.offer(localNum)
        }
        var diff = Int.MAX_VALUE
        while (pq.peek() % 2 == 0) {
            val max = pq.poll()
            diff = Math.min(diff, max - min)
            min = Math.min(max / 2, min)
            pq.offer(max / 2)
        }
        return Math.min(diff, pq.peek() - min)
    }
}
