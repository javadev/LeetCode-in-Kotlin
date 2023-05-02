package g0801_0900.s0862_shortest_subarray_with_sum_at_least_k

// #Hard #Array #Binary_Search #Heap_Priority_Queue #Prefix_Sum #Sliding_Window #Queue
// #Monotonic_Queue #2023_04_04_Time_563_ms_(84.62%)_Space_51.6_MB_(38.46%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    internal class Pair(var index: Int, var value: Long)

    fun shortestSubarray(nums: IntArray, k: Int): Int {
        val n = nums.size
        val dq: Deque<Pair> = LinkedList()
        var ans = Int.MAX_VALUE
        var sum: Long = 0
        for (i in 0 until n) {
            sum += nums[i].toLong()
            // Keep dq in incrementing order
            while (!dq.isEmpty() && sum <= dq.peekLast().value) dq.removeLast()
            // Add current sum and index
            dq.add(Pair(i, sum))
            // Calculate your answer here
            if (sum >= k) ans = Math.min(ans, i + 1)

            // Check if Contraction is possible or not
            while (!dq.isEmpty() && sum - dq.peekFirst().value >= k) {
                ans = ans.coerceAtMost(i - dq.peekFirst().index)
                dq.removeFirst()
            }
        }
        return if (ans == Int.MAX_VALUE) -1 else ans
    }
}
