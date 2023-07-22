package g0901_1000.s0933_number_of_recent_calls

// #Easy #Design #Queue #Data_Stream #2023_04_27_Time_476_ms_(82.50%)_Space_107.1_MB_(5.00%)

import java.util.LinkedList
import java.util.Queue

class RecentCounter {
    private val q: Queue<Int>

    init {
        q = LinkedList()
    }

    fun ping(t: Int): Int {
        q.offer(t)
        val min = t - 3000
        while (min > q.peek()) {
            q.poll()
        }
        return q.size
    }
}

/*
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()
 * var param_1 = obj.ping(t)
 */
