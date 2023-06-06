package g1301_1400.s1353_maximum_number_of_events_that_can_be_attended

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2023_06_06_Time_728_ms_(100.00%)_Space_103.1_MB_(80.00%)

import java.util.Arrays
import java.util.PriorityQueue

class Solution {
    fun maxEvents(events: Array<IntArray>): Int {
        Arrays.sort(events) { a: IntArray, b: IntArray -> a[0] - b[0] }
        var ans = 0
        var i = 0
        val pq = PriorityQueue<Int>()
        for (day in 1..100000) {
            while (i < events.size && events[i][0] == day) {
                pq.add(events[i][1])
                i++
            }
            while (pq.isNotEmpty() && pq.peek() < day) {
                pq.poll()
            }
            if (pq.isNotEmpty() && pq.peek() >= day) {
                pq.poll()
                ans++
            }
        }
        return ans
    }
}
