package g2401_2500.s2462_total_cost_to_hire_k_workers

// #Medium #Array #Two_Pointers #Heap_Priority_Queue #Simulation #LeetCode_75_Heap/Priority_Queue
// #2023_07_05_Time_588_ms_(81.43%)_Space_61.5_MB_(41.43%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
        // Hint: Maintain two minheaps, one for the left end and one for the right end
        // This problem is intentionally made complex but actually we don't have to record the
        // indices
        var k = k
        val n = costs.size
        val leftMinHeap = PriorityQueue<Int>()
        val rightMinHeap = PriorityQueue<Int>()
        var res: Long = 0
        if (2 * candidates >= n) {
            for (i in 0..n / 2) {
                leftMinHeap.add(costs[i])
            }
            for (i in n / 2 + 1 until n) {
                rightMinHeap.add(costs[i])
            }
            while (leftMinHeap.isNotEmpty() && rightMinHeap.isNotEmpty() && k > 0) {
                res += if (leftMinHeap.peek() <= rightMinHeap.peek()) {
                    leftMinHeap.poll().toLong()
                } else {
                    rightMinHeap.poll().toLong()
                }
                k -= 1
            }
        } else {
            var left = candidates
            var right = n - candidates - 1
            for (i in 0 until candidates) {
                leftMinHeap.add(costs[i])
            }
            for (i in n - candidates until n) {
                rightMinHeap.add(costs[i])
            }
            while (leftMinHeap.isNotEmpty() && rightMinHeap.isNotEmpty() && k > 0) {
                if (leftMinHeap.peek() <= rightMinHeap.peek()) {
                    res += leftMinHeap.poll().toLong()
                    if (left <= right) {
                        leftMinHeap.add(costs[left])
                    }
                    left += 1
                } else {
                    res += rightMinHeap.poll().toLong()
                    if (right >= left) {
                        rightMinHeap.add(costs[right])
                    }
                    right -= 1
                }
                k -= 1
            }
        }
        if (k > 0 && leftMinHeap.isEmpty()) {
            while (k > 0) {
                res += rightMinHeap.poll().toLong()
                k -= 1
            }
        }
        if (k > 0 && rightMinHeap.isEmpty()) {
            while (k > 0) {
                res += leftMinHeap.poll().toLong()
                k -= 1
            }
        }
        return res
    }
}
