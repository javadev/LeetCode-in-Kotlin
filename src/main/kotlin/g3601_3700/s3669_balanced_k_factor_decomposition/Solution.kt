package g3601_3700.s3669_balanced_k_factor_decomposition

// #Medium #Weekly_Contest_465 #2025_09_07_Time_30_ms_(85.71%)_Space_56.41_MB_(28.57%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private var kGlobal = 0
    private var bestDiff = Int.Companion.MAX_VALUE
    private var bestList: MutableList<Int> = ArrayList<Int>()
    private val current: MutableList<Int> = ArrayList<Int>()

    fun minDifference(n: Int, k: Int): IntArray {
        kGlobal = k
        dfs(n, 1, 0)
        val ans = IntArray(bestList.size)
        for (i in bestList.indices) {
            ans[i] = bestList[i]
        }
        return ans
    }

    private fun dfs(rem: Int, start: Int, depth: Int) {
        if (depth == kGlobal - 1) {
            if (rem >= start) {
                current.add(rem)
                evaluate()
                current.removeAt(current.size - 1)
            }
            return
        }
        val divs = getDivisors(rem)
        for (d in divs) {
            if (d < start) {
                continue
            }
            current.add(d)
            dfs(rem / d, d, depth + 1)
            current.removeAt(current.size - 1)
        }
    }

    private fun evaluate() {
        var mn = Int.Companion.MAX_VALUE
        var mx = Int.Companion.MIN_VALUE
        for (v in current) {
            mn = min(mn, v)
            mx = max(mx, v)
        }
        val diff = mx - mn
        if (diff < bestDiff) {
            bestDiff = diff
            bestList = ArrayList<Int>(current)
        }
    }

    private fun getDivisors(x: Int): MutableList<Int> {
        val small: MutableList<Int> = ArrayList<Int>()
        val large: MutableList<Int> = ArrayList<Int>()
        var i = 1
        while (i * i.toLong() <= x) {
            if (x % i == 0) {
                small.add(i)
                if (i != x / i) {
                    large.add(x / i)
                }
            }
            i++
        }
        large.reverse()
        small.addAll(large)
        return small
    }
}
