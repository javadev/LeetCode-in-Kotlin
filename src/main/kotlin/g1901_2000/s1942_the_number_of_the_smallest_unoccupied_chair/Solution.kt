package g1901_2000.s1942_the_number_of_the_smallest_unoccupied_chair

// #Medium #Array #Heap_Priority_Queue #Ordered_Set
// #2023_06_20_Time_549_ms_(100.00%)_Space_63.6_MB_(100.00%)

import java.util.Arrays
import java.util.PriorityQueue

class Solution {
    fun smallestChair(times: Array<IntArray>, targetFriend: Int): Int {
        val minheap = PriorityQueue<Int>()
        minheap.offer(0)
        val all = arrayOfNulls<Person>(times.size * 2)
        for (i in times.indices) {
            all[2 * i] = Person(i, times[i][0], false, true)
            all[2 * i + 1] = Person(i, times[i][1], true, false)
        }
        Arrays.sort(
            all
        ) { a: Person?, b: Person? ->
            val i = if (a!!.leave) -1 else 1
            val j = if (b!!.leave) -1 else 1
            if (a.time == b.time) i - j else a.time - b.time
        }
        val seat = IntArray(times.size)
        var i = 0
        while (true) {
            if (all[i]!!.arrive) {
                if (targetFriend == all[i]!!.idx) {
                    return minheap.peek()
                }
                seat[all[i]!!.idx] = minheap.poll()
                if (minheap.isEmpty()) {
                    minheap.offer(seat[all[i]!!.idx] + 1)
                }
            } else {
                minheap.offer(seat[all[i]!!.idx])
            }
            i++
        }
    }

    private class Person internal constructor(var idx: Int, var time: Int, var leave: Boolean, var arrive: Boolean)
}
