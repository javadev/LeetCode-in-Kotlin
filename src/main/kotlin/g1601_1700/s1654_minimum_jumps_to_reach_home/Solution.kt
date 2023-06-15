package g1601_1700.s1654_minimum_jumps_to_reach_home

// #Medium #Array #Dynamic_Programming #Breadth_First_Search
// #Graph_Theory_I_Day_11_Breadth_First_Search
// #2023_06_15_Time_192_ms_(100.00%)_Space_38.3_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private class Pair(var i: Int, var backward: Boolean)

    fun minimumJumps(forbidden: IntArray, a: Int, b: Int, x: Int): Int {
        val limit = 2000 + 2 * b + 1
        val v = BooleanArray(limit)
        for (num in forbidden) {
            v[num] = true
        }
        var step = 0
        val q: Queue<Pair> = LinkedList()
        q.add(Pair(0, false))
        v[0] = true
        while (q.isNotEmpty()) {
            val size = q.size
            for (i in 0 until size) {
                val c = q.poll()
                if (c.i == x) {
                    return step
                }
                if (!c.backward) {
                    val backward = c.i - b
                    if (backward == x) {
                        return step + 1
                    }
                    if (backward > 0 && !v[backward]) {
                        q.offer(Pair(backward, true))
                        v[backward] = true
                    }
                }
                val forward = c.i + a
                if (forward == x) {
                    return step + 1
                }
                if (forward < limit && !v[forward]) {
                    q.offer(Pair(forward, false))
                    v[forward] = true
                }
            }
            step++
        }
        return -1
    }
}
