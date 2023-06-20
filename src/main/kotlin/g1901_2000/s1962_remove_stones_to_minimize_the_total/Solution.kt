package g1901_2000.s1962_remove_stones_to_minimize_the_total

import java.util.Collections
import java.util.PriorityQueue

// #Medium #Array #Heap_Priority_Queue
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
