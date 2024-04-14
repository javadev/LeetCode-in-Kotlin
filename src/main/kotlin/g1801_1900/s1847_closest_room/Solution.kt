package g1801_1900.s1847_closest_room

// #Hard #Array #Sorting #Binary_Search #2023_06_22_Time_1179_ms_(100.00%)_Space_92.1_MB_(100.00%)

import java.util.TreeSet

class Solution {
    fun closestRoom(rooms: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val numRoom = rooms.size
        val numQuery = queries.size
        for (i in 0 until numQuery) {
            queries[i] = intArrayOf(queries[i][0], queries[i][1], i)
        }
        rooms.sortWith { a: IntArray, b: IntArray -> if (a[1] != b[1]) a[1] - b[1] else a[0] - b[0] }
        queries.sortWith { a: IntArray, b: IntArray -> if (a[1] != b[1]) a[1] - b[1] else a[0] - b[0] }
        val roomIds = TreeSet<Int>()
        val result = IntArray(numQuery)
        var j = numRoom - 1
        for (i in numQuery - 1 downTo 0) {
            val currRoomId = queries[i][0]
            val currRoomSize = queries[i][1]
            val currQueryIndex = queries[i][2]
            while (j >= 0 && rooms[j][1] >= currRoomSize) {
                roomIds.add(rooms[j--][0])
            }
            if (roomIds.contains(currRoomId)) {
                result[currQueryIndex] = currRoomId
                continue
            }
            val nextRoomId = roomIds.higher(currRoomId)
            val prevRoomId = roomIds.lower(currRoomId)
            if (nextRoomId == null && prevRoomId == null) {
                result[currQueryIndex] = -1
            } else if (nextRoomId == null) {
                result[currQueryIndex] = prevRoomId!!
            } else if (prevRoomId == null) {
                result[currQueryIndex] = nextRoomId
            } else {
                if (currRoomId - prevRoomId <= nextRoomId - currRoomId) {
                    result[currQueryIndex] = prevRoomId
                } else {
                    result[currQueryIndex] = nextRoomId
                }
            }
        }
        return result
    }
}
