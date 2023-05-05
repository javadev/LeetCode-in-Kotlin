package g0901_1000.s0967_numbers_with_same_consecutive_differences

// #Medium #Breadth_First_Search #Backtracking
// #2023_05_05_Time_144_ms_(100.00%)_Space_36.9_MB_(8.33%)

import kotlin.math.abs

@Suppress("NAME_SHADOWING")
class Solution {
    fun numsSameConsecDiff(n: Int, k: Int): IntArray {
        var k = k
        k = abs(k)
        val list: MutableList<Int> = ArrayList()
        dfs(list, 100000, 0, n, k)
        val res = IntArray(list.size)
        for (i in res.indices) {
            res[i] = list[i]
        }
        return res
    }

    private fun dfs(list: MutableList<Int>, can: Int, len: Int, n: Int, k: Int) {
        if (len == n) {
            list.add(can)
            return
        }
        if (can == 0) {
            return
        }
        if (len == 0) {
            for (i in 0..9) {
                dfs(list, i, 1, n, k)
            }
        } else {
            val last = can % 10
            val a = last + k
            val b = last - k
            if (b >= 0) {
                dfs(list, can * 10 + b, len + 1, n, k)
            }
            if (k != 0 && a < 10) {
                dfs(list, can * 10 + a, len + 1, n, k)
            }
        }
    }
}
