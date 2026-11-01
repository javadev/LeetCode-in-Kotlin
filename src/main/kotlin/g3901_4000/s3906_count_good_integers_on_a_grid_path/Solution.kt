package g3901_4000.s3906_count_good_integers_on_a_grid_path

// #Hard #Dynamic_Programming #Senior_Staff #Weekly_Contest_498
// #2026_09_17_Time_7_ms_(93.94%)_Space_46.60_MB_(72.73%)

class Solution {
    private lateinit var a: StringBuilder
    private lateinit var b: StringBuilder
    private lateinit var arr: BooleanArray
    private val dp: Array<LongArray> = Array<LongArray>(16) { LongArray(11) }

    private fun rec(idx: Int, tl: Int, tu: Int, prev: Int): Long {
        val n = 16
        if (idx == n) {
            return 1
        }
        if (tl == 0 && tu == 0 && dp[idx][prev] != -1L) {
            return dp[idx][prev]
        }
        var res: Long = 0
        val lb = if (tl == 1) a[idx].code - '0'.code else 0
        val ub = if (tu == 1) b[idx].code - '0'.code else 9
        var digit = lb
        while (digit <= ub) {
            val ntl = if (tl == 1 && digit == lb) 1 else 0
            val ntu = if (tu == 1 && digit == ub) 1 else 0
            if (arr[idx] || prev == 10) {
                if (prev == 10 || digit >= prev) {
                    res += rec(idx + 1, ntl, ntu, digit)
                }
            } else {
                res += rec(idx + 1, ntl, ntu, prev)
            }
            digit += 1
        }
        if (tl == 0 && tu == 0) {
            dp[idx][prev] = res
        }
        return res
    }

    fun countGoodIntegersOnPath(l: Long, r: Long, s: String): Long {
        a = StringBuilder(l.toString())
        b = StringBuilder(r.toString())
        while (b.length < 16) {
            b.insert(0, '0')
        }
        while (a.length < 16) {
            a.insert(0, '0')
        }
        arr = BooleanArray(16)
        arr[0] = true
        var i = 0
        var j = 0
        for (k in 0..5) {
            val c = s[k]
            if (c == 'D') {
                i += 1
            } else {
                j += 1
            }
            arr[(i * 4) + j] = true
        }
        for (x in dp) {
            x.fill(-1)
        }
        return rec(0, 1, 1, 10)
    }
}
