package g1601_1700.s1642_furthest_building_you_can_reach

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2023_06_18_Time_457_ms_(71.43%)_Space_49.7_MB_(100.00%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
        var bricks = bricks
        val minHeap = PriorityQueue<Int>()
        var i = 0
        // we'll assume to use ladders for the first l jumps and adjust it afterwards
        while (i < heights.size - 1 && minHeap.size < ladders) {
            val diff = heights[i + 1] - heights[i]
            if (diff > 0) {
                minHeap.offer(diff)
            }
            i++
        }
        while (i < heights.size - 1) {
            val diff = heights[i + 1] - heights[i]
            if (diff > 0) {
                if (!minHeap.isEmpty() && minHeap.peek() < diff) {
                    bricks -= minHeap.poll()
                    minHeap.offer(diff)
                } else {
                    bricks -= diff
                }
                if (bricks < 0) {
                    return i
                }
            }
            i++
        }
        return i
    }
}
