package g1401_1500.s1425_constrained_subsequence_sum

import java.util.LinkedList

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
class Solution {
    fun constrainedSubsetSum(nums: IntArray, k: Int): Int {
        val n = nums.size
        var res = Int.MIN_VALUE
        val mono = LinkedList<IntArray>()
        for (i in 0 until n) {
            var take = nums[i]
            while (!mono.isEmpty() && i - mono.first[0] > k) {
                mono.removeFirst()
            }
            if (!mono.isEmpty()) {
                val mx = Math.max(0, mono.first[1])
                take += mx
            }
            while (!mono.isEmpty() && take > mono.last[1]) {
                mono.removeLast()
            }
            mono.add(intArrayOf(i, take))
            res = Math.max(res, take)
        }
        return res
    }
}
