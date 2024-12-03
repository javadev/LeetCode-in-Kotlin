package g3301_3400.s3362_zero_array_transformation_iii

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Prefix_Sum
// #2024_12_03_Time_195_ms_(81.82%)_Space_106.3_MB_(72.73%)

import java.util.PriorityQueue

class Solution {
    fun maxRemoval(nums: IntArray, queries: Array<IntArray>): Int {
        queries.sortWith { a: IntArray?, b: IntArray? -> a!![0] - b!![0] }
        val last = PriorityQueue<Int?>(Comparator { a: Int?, b: Int? -> b!! - a!! })
        val diffs = IntArray(nums.size + 1)
        var idx = 0
        var cur = 0
        for (i in nums.indices) {
            while (idx < queries.size && queries[idx][0] == i) {
                last.add(queries[idx][1])
                idx++
            }
            cur += diffs[i]
            while (cur < nums[i] && last.isNotEmpty() && last.peek()!! >= i) {
                cur++
                diffs[last.poll()!! + 1]--
            }
            if (cur < nums[i]) {
                return -1
            }
        }
        return last.size
    }
}
