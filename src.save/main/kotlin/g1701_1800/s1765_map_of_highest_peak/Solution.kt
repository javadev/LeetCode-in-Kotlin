package g1701_1800.s1765_map_of_highest_peak

// #Medium #Array #Breadth_First_Search #Matrix
// #2023_06_18_Time_1087_ms_(100.00%)_Space_141.9_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private val dir = intArrayOf(0, 1, 0, -1, 0)

    fun highestPeak(isWater: Array<IntArray>): Array<IntArray> {
        var h = 1
        var q: Queue<IntArray> = LinkedList()
        for (i in isWater.indices) {
            for (j in isWater[0].indices) {
                isWater[i][j] = if (isWater[i][j] == 1) 0 else -1
                if (isWater[i][j] == 0) {
                    q.add(intArrayOf(i, j))
                }
            }
        }
        while (q.isNotEmpty()) {
            val q1: Queue<IntArray> = LinkedList()
            for (cur in q) {
                val x = cur[0]
                val y = cur[1]
                for (i in 0..3) {
                    val nx = x + dir[i]
                    val ny = y + dir[i + 1]
                    if (nx >= 0 && nx < isWater.size && ny >= 0 && ny < isWater[0].size && isWater[nx][ny] == -1) {
                        isWater[nx][ny] = h
                        q1.add(intArrayOf(nx, ny))
                    }
                }
            }
            h++
            q = q1
        }
        return isWater
    }
}
