package g2001_2100.s2071_maximum_number_of_tasks_you_can_assign

// #Hard #Array #Sorting #Greedy #Binary_Search #Queue #Monotonic_Queue
// #2023_06_26_Time_747_ms_(100.00%)_Space_53_MB_(100.00%)

import java.util.Deque
import java.util.LinkedList

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxTaskAssign(tasks: IntArray, workers: IntArray, pills: Int, strength: Int): Int {
        var left = 0
        var right = tasks.size.coerceAtMost(workers.size)
        tasks.sort()
        workers.sort()
        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            if (canAssign(mid, tasks, workers, pills, strength)) {
                left = mid
            } else {
                right = mid
            }
        }
        return if (canAssign(right, tasks, workers, pills, strength)) {
            right
        } else {
            left
        }
    }

    private fun canAssign(count: Int, tasks: IntArray, workers: IntArray, pills: Int, strength: Int): Boolean {
        var pills = pills
        val dq: Deque<Int> = LinkedList()
        var ind = workers.size - 1
        for (i in count - 1 downTo 0) {
            while (ind >= workers.size - count && workers[ind] + strength >= tasks[i]) {
                dq.offerLast(workers[ind])
                ind--
            }
            if (dq.isEmpty()) {
                return false
            }
            if (dq.peekFirst() >= tasks[i]) {
                dq.pollFirst()
            } else {
                dq.pollLast()
                pills--
                if (pills < 0) {
                    return false
                }
            }
        }
        return true
    }
}
