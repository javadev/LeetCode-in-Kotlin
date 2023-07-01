package g2301_2400.s2334_subarray_with_elements_greater_than_varying_threshold

// #Hard #Array #Stack #Union_Find #Monotonic_Stack
// #2023_07_01_Time_889_ms_(100.00%)_Space_60.1_MB_(100.00%)

import java.util.PriorityQueue
import java.util.TreeSet

class Solution {
    fun validSubarraySize(nums: IntArray, threshold: Int): Int {
        val n = nums.size
        val min = IntArray(n)
        // base case
        val dead = TreeSet(listOf(n, -1))
        val maxheap = PriorityQueue(compareBy { o: Int -> -min[o] })
        for (i in 0 until n) {
            min[i] = threshold / nums[i] + 1
            if (min[i] > nums.size) {
                // dead, this element should never appear in the answer
                dead.add(i)
            } else {
                maxheap.offer(i)
            }
        }
        while (!maxheap.isEmpty()) {
            val cur = maxheap.poll()
            if (dead.higher(cur)!! - dead.lower(cur)!! - 1 < min[cur]) {
                // widest open range < minimum required length, this index is also bad.
                dead.add(cur)
            } else {
                // otherwise we've found it!
                return min[cur]
            }
        }
        return -1
    }
}
