package g3501_3600.s3575_maximum_good_subtree_score

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree #Bit_Manipulation #Bitmask
// #2025_06_10_Time_86_ms_(100.00%)_Space_67.73_MB_(33.33%)

import kotlin.math.max

class Solution {
    private val digits = 10
    private val full = 1 shl digits
    private val neg = Long.Companion.MIN_VALUE / 4
    private val mod = 1e9.toLong() + 7
    private lateinit var tree: Array<ArrayList<Int>>
    private lateinit var `val`: IntArray
    private lateinit var mask: IntArray
    private lateinit var isOk: BooleanArray
    private var res: Long = 0

    fun goodSubtreeSum(vals: IntArray, par: IntArray): Int {
        val n = vals.size
        `val` = vals
        mask = IntArray(n)
        isOk = BooleanArray(n)
        for (i in 0..<n) {
            var m = 0
            var v = vals[i]
            var valid = true
            while (v > 0) {
                val d = v % 10
                if (((m shr d) and 1) == 1) {
                    valid = false
                    break
                }
                m = m or (1 shl d)
                v /= 10
            }
            mask[i] = m
            isOk[i] = valid
        }
        tree = Array(n) { initialCapacity: Int -> ArrayList(initialCapacity) }
        val root = 0
        for (i in 1..<n) {
            tree[par[i]].add(i)
        }
        dfs(root)
        return (res % mod).toInt()
    }

    private fun dfs(u: Int): LongArray {
        var dp = LongArray(full)
        dp.fill(neg)
        dp[0] = 0
        if (isOk[u]) {
            dp[mask[u]] = `val`[u].toLong()
        }
        for (v in tree[u]) {
            val child = dfs(v)
            val newDp = dp.copyOf(full)
            for (m1 in 0..<full) {
                if (dp[m1] < 0) {
                    continue
                }
                val remain = full - 1 - m1
                var m2 = remain
                while (m2 > 0) {
                    if (child[m2] < 0) {
                        m2 = (m2 - 1) and remain
                        continue
                    }
                    val newM = m1 or m2
                    newDp[newM] = max(newDp[newM], dp[m1] + child[m2])
                    m2 = (m2 - 1) and remain
                }
            }
            dp = newDp
        }
        var best: Long = 0
        for (v in dp) {
            best = max(best, v)
        }
        res = (res + best) % mod
        return dp
    }
}
