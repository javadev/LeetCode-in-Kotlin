package g1401_1500.s1425_constrained_subsequence_sum

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
// #2023_06_07_Time_649_ms_(33.33%)_Space_51.4_MB_(100.00%)

import java.util.LinkedList

class Solution {
    fun constrainedSubsetSum(nums: IntArray, k: Int): Int {
        val n = nums.size
        var res = Int.MIN_VALUE
        val mono = LinkedList<IntArray>()
        for (i in 0 until n) {
            var take = nums[i]
            while (mono.isNotEmpty() && i - mono.first[0] > k) {
                mono.removeFirst()
            }
            if (mono.isNotEmpty()) {
                val mx = Math.max(0, mono.first[1])
                take += mx
            }
            while (mono.isNotEmpty() && take > mono.last[1]) {
                mono.removeLast()
            }
            mono.add(intArrayOf(i, take))
            res = Math.max(res, take)
        }
        return res
    }
}
