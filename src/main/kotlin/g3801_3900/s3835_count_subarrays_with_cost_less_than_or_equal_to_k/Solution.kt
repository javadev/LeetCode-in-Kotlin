package g3801_3900.s3835_count_subarrays_with_cost_less_than_or_equal_to_k

// #Medium #Array #Queue #Monotonic_Queue #Staff #Weekly_Contest_488
// #2026_07_21_Time_53_ms_(79.87%)_Space_134.00_MB_(91.28%)

import java.util.ArrayDeque

class Solution {
    fun countSubarrays(nums: IntArray, k: Long): Long {
        val n = nums.size
        val maxq = ArrayDeque<Int>()
        val minq = ArrayDeque<Int>()
        var res: Long = 0
        var l = 0
        for (r in 0..<n) {
            pushMax(maxq, nums, r)
            pushMin(minq, nums, r)
            while (l <= r && rangeTooLarge(nums, maxq, minq, l, r, k)) {
                l = shrinkWindow(maxq, minq, l)
            }
            res += (r - l + 1).toLong()
        }
        return res
    }

    private fun pushMax(maxq: ArrayDeque<Int>, nums: IntArray, r: Int) {
        while (maxq.isNotEmpty() && nums[maxq.peekLast()!!] <= nums[r]) {
            maxq.pollLast()
        }
        maxq.addLast(r)
    }

    private fun pushMin(minq: ArrayDeque<Int>, nums: IntArray, r: Int) {
        while (!minq.isEmpty() && nums[minq.peekLast()!!] >= nums[r]) {
            minq.pollLast()
        }
        minq.addLast(r)
    }

    private fun rangeTooLarge(
        nums: IntArray,
        maxq: ArrayDeque<Int>,
        minq: ArrayDeque<Int>,
        l: Int,
        r: Int,
        k: Long,
    ): Boolean {
        val range = nums[maxq.peekFirst()!!].toLong() - nums[minq.peekFirst()!!].toLong()
        return (r - l + 1) * range > k
    }

    private fun shrinkWindow(maxq: ArrayDeque<Int>, minq: ArrayDeque<Int>, l: Int): Int {
        if (!maxq.isEmpty() && maxq.peekFirst() == l) {
            maxq.pollFirst()
        }
        if (!minq.isEmpty() && minq.peekFirst() == l) {
            minq.pollFirst()
        }
        return l + 1
    }
}
