package g3501_3600.s3505_minimum_operations_to_make_elements_within_k_subarrays_equal

// #Hard #Array #Hash_Table #Dynamic_Programming #Math #Heap_Priority_Queue #Sliding_Window
// #2025_04_01_Time_537_ms_(100.00%)_Space_115.99_MB_(20.00%)

import java.util.Collections
import java.util.PriorityQueue
import kotlin.math.min

class Solution {
    private class SlidingMedian {
        // max-heap for smaller half
        var leftHeap: PriorityQueue<Int>

        // min-heap for larger half
        var rightHeap: PriorityQueue<Int>
        var delayedRemovals: MutableMap<Int, Int>
        var sumLeft: Long
        var sumRight: Long = 0
        var sizeLeft: Int
        var sizeRight: Int

        init {
            leftHeap = PriorityQueue<Int>(Collections.reverseOrder<Int?>())
            rightHeap = PriorityQueue<Int>()
            delayedRemovals = HashMap<Int, Int>()
            sumLeft = sumRight
            sizeRight = 0
            sizeLeft = sizeRight
        }

        fun add(num: Int) {
            if (leftHeap.isEmpty() || num <= leftHeap.peek()!!) {
                leftHeap.offer(num)
                sumLeft += num
                sizeLeft++
            } else {
                rightHeap.offer(num)
                sumRight += num
                sizeRight++
            }
            balanceHeaps()
        }

        fun remove(num: Int) {
            delayedRemovals.put(num, delayedRemovals.getOrDefault(num, 0) + 1)
            if (leftHeap.isNotEmpty() && num <= leftHeap.peek()!!) {
                sumLeft -= num
                sizeLeft--
            } else {
                sumRight -= num
                sizeRight--
            }
            balanceHeaps()
            pruneHeap(leftHeap)
            pruneHeap(rightHeap)
        }

        fun balanceHeaps() {
            if (sizeLeft > sizeRight + 1) {
                val num = leftHeap.poll()!!
                sumLeft -= num
                sizeLeft--
                rightHeap.offer(num)
                sumRight += num
                sizeRight++
            } else if (sizeRight > sizeLeft) {
                val num = rightHeap.poll()!!
                sumRight -= num
                sizeRight--
                leftHeap.offer(num)
                sumLeft += num
                sizeLeft++
            }
        }

        fun pruneHeap(heap: PriorityQueue<Int>) {
            while (heap.isNotEmpty() && delayedRemovals.containsKey(heap.peek())) {
                val num: Int = heap.peek()!!
                if (delayedRemovals[num]!! > 0) {
                    heap.poll()
                    delayedRemovals.put(num, delayedRemovals[num]!! - 1)
                    if (delayedRemovals[num] == 0) {
                        delayedRemovals.remove(num)
                    }
                } else {
                    break
                }
            }
        }

        val median: Int
            get() = leftHeap.peek()!!

        val cost: Long
            get() {
                val median = this.median
                return median * sizeLeft - sumLeft + sumRight - median * sizeRight
            }
    }

    fun minOperations(nums: IntArray, x: Int, k: Int): Long {
        val n = nums.size
        val windowCount = n - x + 1
        val costs = LongArray(windowCount)
        val sm = SlidingMedian()
        // Compute costs for all windows
        for (i in 0..<x) {
            sm.add(nums[i])
        }
        costs[0] = sm.cost
        for (i in 1..<windowCount) {
            sm.remove(nums[i - 1])
            sm.add(nums[i + x - 1])
            costs[i] = sm.cost
        }
        // Dynamic programming table
        val dp: Array<LongArray> = Array<LongArray>(windowCount) { LongArray(k + 1) }
        for (row in dp) {
            row.fill(Long.Companion.MAX_VALUE / 2)
        }
        dp[0][0] = 0
        for (i in 0..<windowCount) {
            for (j in 0..k) {
                if (i > 0) {
                    dp[i][j] = min(dp[i][j], dp[i - 1][j])
                }
                if (j > 0 && i >= x) {
                    dp[i][j] = min(dp[i][j], (dp[i - x][j - 1] + costs[i]))
                } else if (j == 1) {
                    dp[i][j] = min(dp[i][j], costs[i])
                }
            }
        }
        return dp[windowCount - 1][k]
    }
}
