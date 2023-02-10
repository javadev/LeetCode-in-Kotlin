package g0601_0700.s0632_smallest_range_covering_elements_from_k_lists

// #Hard #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Sliding_Window
// #2023_02_09_Time_399_ms_(83.33%)_Space_59.2_MB_(66.67%)

import java.util.Objects
import java.util.PriorityQueue

class Solution {
    internal class Triplet(var value: Int, var row: Int, var idx: Int) : Comparable<Triplet?> {
        override operator fun compareTo(other: Triplet?): Int {
            return value - other!!.value
        }
    }

    fun smallestRange(nums: List<List<Int>>): IntArray {
        val pq = PriorityQueue<Triplet>()
        var maxInPq = Int.MIN_VALUE
        for (i in nums.indices) {
            pq.add(Triplet(nums[i][0], i, 0))
            if (maxInPq < nums[i][0]) {
                maxInPq = nums[i][0]
            }
        }
        var rangeSize = maxInPq - Objects.requireNonNull(pq.peek()).value + 1
        var rangeLeft = Objects.requireNonNull(pq.peek()).value
        var rangeRight = maxInPq
        while (true) {
            val nextNumber = pq.remove()
            if (nextNumber.idx + 1 < nums[nextNumber.row].size) {
                val `val` = nums[nextNumber.row][nextNumber.idx + 1]
                if (`val` > maxInPq) {
                    maxInPq = `val`
                }
                pq.add(Triplet(`val`, nextNumber.row, nextNumber.idx + 1))
                if (maxInPq - Objects.requireNonNull(pq.peek()).value + 1 < rangeSize) {
                    rangeSize = maxInPq - pq.peek().value + 1
                    rangeLeft = maxInPq
                    rangeRight = pq.peek().value
                }
            } else {
                break
            }
        }
        val answer = IntArray(2)
        answer[0] = rangeLeft
        answer[1] = rangeRight
        return answer
    }
}
