package g1901_2000.s1962_remove_stones_to_minimize_the_total

// #Medium #Array #Heap_Priority_Queue #2023_06_21_Time_888_ms_(68.42%)_Space_50.7_MB_(94.74%)

import java.util.Collections
import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun minStoneSum(piles: IntArray, k: Int): Int {
        var k = k
        val descendingQueue = PriorityQueue(Collections.reverseOrder<Int>())
        var sum = 0
        var newValue: Int
        var currentValue: Int
        var half: Int
        for (stones in piles) {
            sum += stones
            descendingQueue.offer(stones)
        }
        while (k > 0) {
            currentValue = descendingQueue.poll()
            half = currentValue / 2
            newValue = currentValue - half
            descendingQueue.offer(newValue)
            sum -= half
            k--
        }
        return sum
    }
}
