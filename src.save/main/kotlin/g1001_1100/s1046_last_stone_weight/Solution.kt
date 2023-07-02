package g1001_1100.s1046_last_stone_weight

// #Easy #Array #Heap_Priority_Queue #Level_1_Day_15_Heap
// #2023_05_28_Time_123_ms_(100.00%)_Space_35_MB_(39.50%)

import java.util.PriorityQueue

class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val heap = PriorityQueue { a: Int, b: Int -> b - a }
        for (stone in stones) {
            heap.offer(stone)
        }
        while (heap.isNotEmpty()) {
            if (heap.size >= 2) {
                val one = heap.poll()
                val two = heap.poll()
                val diff = one - two
                heap.offer(diff)
            } else {
                return heap.poll()
            }
        }
        return -1
    }
}
