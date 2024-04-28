package g2001_2100.s2054_two_best_non_overlapping_events

// #Medium #Array #Dynamic_Programming #Sorting #Binary_Search #Heap_Priority_Queue
// #2023_06_25_Time_851_ms_(100.00%)_Space_108.7_MB_(50.00%)

class Solution {
    fun maxTwoEvents(events: Array<IntArray>): Int {
        events.sortWith { a: IntArray, b: IntArray -> a[0] - b[0] }
        val max = IntArray(events.size)
        for (i in events.indices.reversed()) {
            if (i == events.size - 1) {
                max[i] = events[i][2]
            } else {
                max[i] = events[i][2].coerceAtLeast(max[i + 1])
            }
        }
        var ans = 0
        for (i in events.indices) {
            val end = events[i][1]
            var left = i + 1
            var right = events.size
            while (left < right) {
                val mid = left + (right - left) / 2
                if (events[mid][0] <= end) {
                    left = mid + 1
                } else {
                    right = mid
                }
            }
            var value = events[i][2]
            if (right < events.size) {
                value += max[right]
            }
            ans = ans.coerceAtLeast(value)
        }
        return ans
    }
}
