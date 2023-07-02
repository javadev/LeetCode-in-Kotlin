package g2101_2200.s2104_sum_of_subarray_ranges

// #Medium #Array #Stack #Monotonic_Stack #2023_06_25_Time_212_ms_(100.00%)_Space_38_MB_(30.77%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    fun subArrayRanges(nums: IntArray): Long {
        val n = nums.size
        var sum: Long = 0
        val q: Deque<Int> = ArrayDeque()
        q.add(-1)
        for (i in 0..n) {
            while (q.peekLast() != -1 && (i == n || nums[q.peekLast()] <= nums[i])) {
                val cur = q.removeLast()
                val left = q.peekLast()
                sum += 1L * (cur - left) * (i - cur) * nums[cur]
            }
            q.add(i)
        }
        q.clear()
        q.add(-1)
        for (i in 0..n) {
            while (q.peekLast() != -1 && (i == n || nums[q.peekLast()] >= nums[i])) {
                val cur = q.removeLast()
                val left = q.peekLast()
                sum -= 1L * (cur - left) * (i - cur) * nums[cur]
            }
            q.add(i)
        }
        return sum
    }
}
