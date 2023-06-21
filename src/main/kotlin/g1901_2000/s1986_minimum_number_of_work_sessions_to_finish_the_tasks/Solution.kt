package g1901_2000.s1986_minimum_number_of_work_sessions_to_finish_the_tasks

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2023_06_21_Time_153_ms_(100.00%)_Space_35.6_MB_(100.00%)

class Solution {
    fun minSessions(tasks: IntArray, sessionTime: Int): Int {
        val len = tasks.size
        // minimum, all tasks can fit into 1 session
        var i = 1
        // maximum, each task take 1 session to finish
        var j = len
        while (i < j) {
            // try m sessions to see whether it can work
            val m = (i + j) / 2
            if (canFit(tasks, IntArray(m), sessionTime, len - 1)) {
                j = m
            } else {
                i = m + 1
            }
        }
        return i
    }

    private fun canFit(tasks: IntArray, sessions: IntArray, sessionTime: Int, idx: Int): Boolean {
        // all tasks have been taken care of
        if (idx == -1) {
            return true
        }
        val dup: MutableSet<Int> = HashSet()
        // now to take care of tasks[idx]
        // try each spot
        for (i in sessions.indices) {
            // current spot cannot fit
            if (sessions[i] + tasks[idx] > sessionTime || dup.contains(sessions[i] + tasks[idx])) {
                continue
            }
            dup.add(sessions[i] + tasks[idx])
            sessions[i] += tasks[idx]
            if (canFit(tasks, sessions, sessionTime, idx - 1)) {
                return true
            }
            sessions[i] -= tasks[idx]
        }
        return false
    }
}
