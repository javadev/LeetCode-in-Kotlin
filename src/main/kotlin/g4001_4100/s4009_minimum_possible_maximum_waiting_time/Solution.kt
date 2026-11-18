package g4001_4100.s4009_minimum_possible_maximum_waiting_time

// #Hard #Array #Dynamic_Programming #Memoization #Senior_Staff #Biweekly_Contest_188
// #2026_11_18_Time_39_ms_(97.73%)_Space_46.82_MB_(75.00%)

import kotlin.math.max

class Solution {
    fun minMaxWaitingTime(demand: IntArray, fuel: IntArray): Int {
        val result = solve(0, fuel[0], fuel[1], 0, 0, demand, HashMap<Int?, Int?>())
        return if ((result ushr 5) == 0) -1 else result and 31
    }

    private fun solve(
        index: Int,
        fuel0: Int,
        fuel1: Int,
        busy0: Int,
        busy1: Int,
        demand: IntArray,
        memo: HashMap<Int?, Int?>,
    ): Int {
        if (index == demand.size) {
            return 0
        }
        val key = (index shl 22) or (fuel0 shl 16) or (fuel1 shl 10) or (busy0 shl 5) or busy1
        val cached = memo.get(key)
        if (cached != null) {
            return cached
        }
        var best = 0
        val required = demand[index]
        if (fuel0 >= required) {
            val wait = busy0
            val child =
                solve(
                    index + 1,
                    fuel0 - required,
                    fuel1,
                    required,
                    max(0, busy1 - wait),
                    demand,
                    memo,
                )
            best = (1 + (child ushr 5)) * 32 + max(wait, child and 31)
        }
        if (fuel1 >= required) {
            val wait = busy1
            val child =
                solve(
                    index + 1,
                    fuel0,
                    fuel1 - required,
                    max(0, busy0 - wait),
                    required,
                    demand,
                    memo,
                )
            val candidate = (1 + (child ushr 5)) * 32 + max(wait, child and 31)
            if ((candidate ushr 5) > (best ushr 5) ||
                ((candidate ushr 5) == (best ushr 5) && (candidate and 31) < (best and 31))
            ) {
                best = candidate
            }
        }
        memo.put(key, best)
        return best
    }
}
