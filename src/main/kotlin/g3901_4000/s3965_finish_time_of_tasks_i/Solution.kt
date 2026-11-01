package g3901_4000.s3965_finish_time_of_tasks_i

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Tree #Staff #Biweekly_Contest_185
// #2026_10_22_Time_9_ms_(99.36%)_Space_207.04_MB_(96.15%)

class Solution {
    fun finishTime(n: Int, edges: Array<IntArray>, baseTime: IntArray): Long {
        val torqavemi = edges
        val outDegree = IntArray(n)
        val parent = IntArray(n)
        for (i in 0..<n) {
            parent[i] = -1
        }
        for (edge in torqavemi) {
            val u = edge[0]
            val v = edge[1]
            parent[v] = u
            outDegree[u]++
        }
        val earliest = LongArray(n)
        val latest = LongArray(n)
        for (i in 0..<n) {
            earliest[i] = Long.MAX_VALUE
            latest[i] = Long.MIN_VALUE
        }
        val finish = LongArray(n)
        val queue = IntArray(n)
        var head = 0
        var tail = 0
        for (i in 0..<n) {
            if (outDegree[i] == 0) {
                queue[tail++] = i
            }
        }
        while (head < tail) {
            val u = queue[head++]
            if (earliest[u] == Long.MAX_VALUE) {
                finish[u] = baseTime[u].toLong()
            } else {
                finish[u] = 2 * latest[u] - earliest[u] + baseTime[u]
            }
            val p = parent[u]
            if (p != -1) {
                if (finish[u] < earliest[p]) {
                    earliest[p] = finish[u]
                }
                if (finish[u] > latest[p]) {
                    latest[p] = finish[u]
                }
                outDegree[p]--
                if (outDegree[p] == 0) {
                    queue[tail++] = p
                }
            }
        }
        return finish[0]
    }
}
