package g2401_2500.s2402_meeting_rooms_iii

// #Hard #Array #Sorting #Heap_Priority_Queue
// #2023_07_03_Time_976_ms_(100.00%)_Space_108.7_MB_(66.67%)

import java.util.Arrays

class Solution {
    fun mostBooked(n: Int, meetings: Array<IntArray>): Int {
        val counts = IntArray(n)
        val endTimes = LongArray(n)
        Arrays.sort(meetings) { a: IntArray, b: IntArray -> Integer.compare(a[0], b[0]) }
        for (meeting in meetings) {
            val id = findRoomId(endTimes, meeting[0])
            counts[id]++
            endTimes[id] = endTimes[id].coerceAtLeast(meeting[0].toLong()) + meeting[1] - meeting[0]
        }
        var res = 0
        var count: Long = 0
        for (i in 0 until n) {
            if (counts[i] > count) {
                count = counts[i].toLong()
                res = i
            }
        }
        return res
    }

    private fun findRoomId(endTimes: LongArray, start: Int): Int {
        val n = endTimes.size
        // Find the first one
        for (i in 0 until n) {
            if (endTimes[i] <= start) {
                return i
            }
        }
        // Only when non is not delayed, then we find the smallest one
        var id = 0
        var min = Long.MAX_VALUE
        for (i in 0 until n) {
            if (endTimes[i] < min) {
                min = endTimes[i]
                id = i
            }
        }
        return id
    }
}
