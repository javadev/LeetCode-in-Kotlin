package g2001_2100.s2008_maximum_earnings_from_taxi

// #Medium #Array #Dynamic_Programming #Sorting #Binary_Search
// #2023_06_23_Time_1008_ms_(100.00%)_Space_67.3_MB_(100.00%)

import java.util.Arrays
import java.util.PriorityQueue

class Solution {
    fun maxTaxiEarnings(n: Int, rides: Array<IntArray>): Long {
        // Sort based on start time
        Arrays.sort(rides) { a: IntArray, b: IntArray ->
            a[0] - b[0]
        }
        var max: Long = 0

        // Storing Long array instead of Int array, since max value is long.
        // Sort based on end time
        val myQueue = PriorityQueue { a: LongArray, b: LongArray ->
            java.lang.Long.compare(
                a[0],
                b[0]
            )
        }
        for (i in rides.indices) {
            val start = rides[i][0]
            val end = rides[i][1]
            val profit = end - start + java.lang.Long.valueOf(rides[i][2].toLong())
            while (myQueue.isNotEmpty() && start >= myQueue.peek()[0]) {
                max = max.coerceAtLeast(myQueue.peek()[1])
                myQueue.poll()
            }
            myQueue.offer(longArrayOf(end.toLong(), profit + max))
        }
        while (myQueue.isNotEmpty()) {
            max = max.coerceAtLeast(myQueue.poll()[1])
        }
        return max
    }
}
