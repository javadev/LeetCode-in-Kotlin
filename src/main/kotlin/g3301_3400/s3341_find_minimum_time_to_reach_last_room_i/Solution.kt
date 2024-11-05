package g3301_3400.s3341_find_minimum_time_to_reach_last_room_i

// #Medium #Array #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2024_11_05_Time_257_ms_(42.10%)_Space_46.1_MB_(10.53%)

import java.util.Comparator
import java.util.PriorityQueue
import java.util.function.ToIntFunction
import kotlin.math.max

class Solution {
    fun minTimeToReach(moveTime: Array<IntArray>): Int {
        val rows = moveTime.size
        val cols = moveTime[0].size
        val minHeap =
            PriorityQueue<IntArray>(Comparator.comparingInt<IntArray>(ToIntFunction { a: IntArray -> a[0] }))
        val time: Array<IntArray> = Array<IntArray>(rows) { IntArray(cols) }
        for (row in time) {
            row.fill(Int.Companion.MAX_VALUE)
        }
        minHeap.offer(intArrayOf(0, 0, 0))
        time[0][0] = 0
        val directions = arrayOf<IntArray>(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
        while (minHeap.isNotEmpty()) {
            val current = minHeap.poll()
            val currentTime = current[0]
            val x = current[1]
            val y = current[2]
            if (x == rows - 1 && y == cols - 1) {
                return currentTime
            }
            for (dir in directions) {
                val newX = x + dir[0]
                val newY = y + dir[1]
                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                    val waitTime: Int = max((moveTime[newX][newY] - currentTime), 0)
                    val newTime = currentTime + 1 + waitTime
                    if (newTime < time[newX][newY]) {
                        time[newX][newY] = newTime
                        minHeap.offer(intArrayOf(newTime, newX, newY))
                    }
                }
            }
        }
        return -1
    }
}
