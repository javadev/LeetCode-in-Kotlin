package g2501_2600.s2558_take_gifts_from_the_richest_pile

// #Easy #Array #Heap_Priority_Queue #Simulation
// #2023_07_07_Time_169_ms_(100.00%)_Space_37.2_MB_(50.00%)

import java.util.PriorityQueue
import kotlin.math.sqrt

class Solution {
    fun pickGifts(gifts: IntArray, k: Int): Long {
        // val queue = PriorityQueue<Int>(Collections.reverseOrder())
        // val queue = PriorityQueue<Int>(compareByDescending { it })
        // val queue = PriorityQueue<Int>(compareBy { -it })
        val queue = PriorityQueue<Int> { a, b -> b - a }
        for (gift in gifts) queue.add(gift)
        var result = 0L
        var seconds = k
        while (seconds-- > 0 && queue.isNotEmpty()) {
            queue.add(sqrt(queue.poll().toDouble()).toInt())
        }
        while (queue.isNotEmpty()) result += queue.poll()
        return result
    }
}
