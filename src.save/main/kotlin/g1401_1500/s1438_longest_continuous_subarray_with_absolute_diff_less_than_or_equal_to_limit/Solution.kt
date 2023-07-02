package g1401_1500.s1438_longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit

// #Medium #Array #Heap_Priority_Queue #Sliding_Window #Ordered_Set #Queue #Monotonic_Queue
// #2023_06_07_Time_479_ms_(75.00%)_Space_50.3_MB_(100.00%)

import java.util.ArrayDeque

class Solution {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        val maxQ = ArrayDeque<Int>()
        val minQ = ArrayDeque<Int>()
        var best = 0
        var left = 0
        for (right in nums.indices) {
            while (maxQ.isNotEmpty() && nums[right] > nums[maxQ.peekLast()]) {
                maxQ.removeLast()
            }
            maxQ.offerLast(right)
            while (minQ.isNotEmpty() && nums[right] < nums[minQ.peekLast()]) {
                minQ.removeLast()
            }
            minQ.offerLast(right)
            while (nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > limit) {
                if (maxQ.peekFirst() == left) {
                    maxQ.removeFirst()
                }
                if (minQ.peekFirst() == left) {
                    minQ.removeFirst()
                }
                left++
            }
            best = Math.max(best, right - left + 1)
        }
        return best
    }
}
