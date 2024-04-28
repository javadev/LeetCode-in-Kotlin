package g2501_2600.s2542_maximum_subsequence_score

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue
// #2023_07_04_Time_780_ms_(81.97%)_Space_56.7_MB_(99.45%)

import java.util.PriorityQueue

class Solution {
    private class PairInfo(var val1: Int, var val2: Int)

    fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {
        val n = nums1.size
        val nums = arrayOfNulls<PairInfo>(n)
        for (i in 0 until n) {
            nums[i] = PairInfo(nums1[i], nums2[i])
        }

        nums.sortWith sort@{ a: PairInfo?, b: PairInfo? ->
            if (a!!.val2 == b!!.val2) {
                return@sort a.val1 - b.val1
            }
            a.val2 - b.val2
        }
        var sum: Long = 0
        var ans: Long = 0
        val pq = PriorityQueue<Int>()
        for (i in n - 1 downTo 0) {
            val minVal = nums[i]!!.val2
            while (pq.size > k - 1) {
                sum -= pq.poll().toLong()
            }
            sum += nums[i]!!.val1.toLong()
            pq.add(nums[i]!!.val1)
            if (pq.size == k) {
                ans = Math.max(ans, sum * minVal)
            }
        }
        return ans
    }
}
