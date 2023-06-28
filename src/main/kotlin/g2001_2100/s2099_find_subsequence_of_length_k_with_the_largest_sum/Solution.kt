package g2001_2100.s2099_find_subsequence_of_length_k_with_the_largest_sum

// #Easy #Array #Hash_Table #Sorting #Heap_Priority_Queue
// #2023_06_28_Time_203_ms_(100.00%)_Space_37.5_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        // Create proirity queue with min priority queue so that min element will be removed first,
        // with index
        // Add those unique index in a set
        // Loop from 0 to n-1 and add element in result if set contains those index
        // For ex. set has index 3,5,6 Just add those element. Order will be maintained
        // We are defining the min priority queue
        val q = PriorityQueue { a: IntArray, b: IntArray -> a[0] - b[0] }
        // Add element with index to priority queue
        for (i in nums.indices) {
            q.offer(intArrayOf(nums[i], i))
            if (q.size > k) {
                q.poll()
            }
        }
        // Set to keep index
        val index: MutableSet<Int> = HashSet()
        // At the index in the set since index are unique
        while (!q.isEmpty()) {
            val top = q.poll()
            index.add(top[1])
        }
        // Final result add here
        val result = IntArray(k)
        // Just add the element in the result for those index present in SET
        var p = 0
        for (i in nums.indices) {
            if (index.contains(i)) {
                result[p] = nums[i]
                ++p
            }
        }
        return result
    }
}
