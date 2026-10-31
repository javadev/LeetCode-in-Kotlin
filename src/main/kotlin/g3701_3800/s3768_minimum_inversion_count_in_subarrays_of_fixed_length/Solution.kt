package g3701_3800.s3768_minimum_inversion_count_in_subarrays_of_fixed_length

// #Hard #Array #Sliding_Window #Segment_Tree #Senior_Staff #Biweekly_Contest_171
// #2026_05_08_Time_157_ms_(94.34%)_Space_125.70_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minInversionCount(nums: IntArray, k: Int): Long {
        val n = nums.size
        // discretization of coordinates
        val sorted = nums.clone()
        sorted.sort()
        for (i in 0..<n) {
            nums[i] = sorted.binarySearch(nums[i]) + 1
        }
        val bit = BinaryIndexedTree(n)
        var invCount = 0L
        var ans = Long.MAX_VALUE
        for (i in 0..<n) {
            bit.add(nums[i], 1)
            invCount += (min(i + 1, k) - bit.presum(nums[i])).toLong()
            if (i < k - 1) {
                continue
            }
            ans = min(ans, invCount)
            invCount -= bit.presum(nums[i - k + 1] - 1).toLong()
            bit.add(nums[i - k + 1], -1)
        }
        return ans
    }

    private inner class BinaryIndexedTree(n: Int) {
        private val tree: IntArray

        init {
            tree = IntArray(n + 1)
        }

        fun add(i: Int, `val`: Int) {
            var i = i
            while (i < tree.size) {
                tree[i] += `val`
                i += lowbit(i)
            }
        }

        fun presum(i: Int): Int {
            var i = i
            var sum = 0
            while (i > 0) {
                sum += tree[i]
                i -= lowbit(i)
            }
            return sum
        }

        fun lowbit(n: Int): Int = n and (-n)
    }
}
