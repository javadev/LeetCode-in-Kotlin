package g0801_0900.s0870_advantage_shuffle

// #Medium #Array #Sorting #Greedy #2023_04_05_Time_698_ms_(100.00%)_Space_51.1_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun advantageCount(nums1: IntArray, nums2: IntArray): IntArray {
        val n = nums1.size
        nums1.sort()
        val maxpq = PriorityQueue { pair1: IntArray, pair2: IntArray ->
            pair2[1] - pair1[1]
        }
        for (i in 0 until n) {
            maxpq.offer(intArrayOf(i, nums2[i]))
        }
        var left = 0
        var right = n - 1
        val res = IntArray(n)
        while (maxpq.isNotEmpty()) {
            val pair = maxpq.poll()
            val i = pair[0]
            val `val` = pair[1]
            if (nums1[right] > `val`) {
                res[i] = nums1[right]
                right--
            } else {
                res[i] = nums1[left]
                left++
            }
        }
        return res
    }
}
