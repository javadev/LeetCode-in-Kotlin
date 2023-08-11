package g2101_2200.s2163_minimum_difference_in_sums_after_removal_of_elements

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue
// #2023_06_26_Time_854_ms_(100.00%)_Space_79.2_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun minimumDifference(nums: IntArray): Long {
        val n = nums.size / 3
        val minHeap = PriorityQueue<Int>()
        val maxHeap = PriorityQueue { a: Int, b: Int -> b - a }
        val leftMemo = LongArray(nums.size)
        val rightMemo = LongArray(nums.size)
        var current = 0L
        for (i in 0..2 * n - 1) {
            current += nums[i].toLong()
            maxHeap.add(nums[i])
            if (maxHeap.size > n) {
                val removed = maxHeap.poll()
                current -= removed.toLong()
                leftMemo[i] = current
            }
            if (maxHeap.size == n) {
                leftMemo[i] = current
            }
        }
        current = 0
        for (i in nums.size - 1 downTo n) {
            current += nums[i].toLong()
            minHeap.add(nums[i])
            if (minHeap.size > n) {
                val removed = minHeap.poll()
                current -= removed.toLong()
            }
            if (minHeap.size == n) {
                rightMemo[i] = current
            }
        }
        var min = Long.MAX_VALUE
        for (i in n - 1..2 * n - 1) {
            min = Math.min(min, leftMemo[i] - rightMemo[i + 1])
        }
        return min
    }
}
