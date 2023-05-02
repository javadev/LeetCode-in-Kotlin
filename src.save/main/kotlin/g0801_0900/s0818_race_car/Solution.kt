package g0801_0900.s0818_race_car

// #Hard #Dynamic_Programming #2023_03_24_Time_123_ms_(100.00%)_Space_34.3_MB_(93.94%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun racecar(target: Int): Int {
        val queue: Queue<IntArray> = LinkedList()
        queue.add(intArrayOf(0, 1, 0))
        while (!queue.isEmpty()) {
            val arr = queue.poll()
            if (arr[0] == target) {
                return arr[2]
            }
            queue.add(intArrayOf(arr[0] + arr[1], 2 * arr[1], 1 + arr[2]))
            if (arr[0] + arr[1] > target && arr[1] > 0) {
                queue.add(intArrayOf(arr[0], -1, 1 + arr[2]))
            }
            if (arr[0] + arr[1] < target && arr[1] < 0) {
                queue.add(intArrayOf(arr[0], 1, 1 + arr[2]))
            }
        }
        return -1
    }
}
