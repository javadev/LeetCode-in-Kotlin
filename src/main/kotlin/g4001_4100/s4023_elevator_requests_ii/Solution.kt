package g4001_4100.s4023_elevator_requests_ii

// #Hard #Array #Dynamic_Programming #Sorting #Senior_Staff #Biweekly_Contest_189
// #2026_11_25_Time_26_ms_(100.00%)_Space_69.24_MB_(79.07%)

import kotlin.math.min

class Solution {
    fun elevatorRequests(n: Int, start: Int, requests: IntArray): Long {
        val l: MutableList<Int> = ArrayList<Int>()
        val r: MutableList<Int> = ArrayList<Int>()
        for (x in requests) {
            if (x < start) {
                l.add(start - x)
            } else if (x > start) {
                r.add(x - start)
            }
        }
        l.sort()
        r.sort()
        val a = l.size
        val b = r.size
        val t = a + b
        if (t == 0) {
            return 0
        }
        val x = LongArray(a + 1)
        val y = LongArray(b + 1)
        for (i in 1..a) {
            x[i] = l.get(i - 1).toLong()
        }
        for (j in 1..b) {
            y[j] = r.get(j - 1).toLong()
        }
        val inf = Long.MAX_VALUE / 4
        val dl = Array<LongArray>(a + 1) { LongArray(b + 1) }
        val dr = Array<LongArray>(a + 1) { LongArray(b + 1) }
        for (i in 1..a) {
            dl[i][0] = dl[i - 1][0] + (x[i] - x[i - 1]) * (t - i + 1)
        }
        for (j in 1..b) {
            dr[0][j] = dr[0][j - 1] + (y[j] - y[j - 1]) * (t - j + 1)
        }
        for (i in 1..a) {
            for (j in 1..b) {
                val w = t - i - j + 1L
                var p = inf
                if (i >= 2) {
                    p = dl[i - 1][j] + (x[i] - x[i - 1]) * w
                }
                val q = dr[i - 1][j] + (y[j] + x[i]) * w
                dl[i][j] = min(p, q)
                var s = inf
                if (j >= 2) {
                    s = dr[i][j - 1] + (y[j] - y[j - 1]) * w
                }
                val z = dl[i][j - 1] + (x[i] + y[j]) * w
                dr[i][j] = min(s, z)
            }
        }
        if (a == 0) {
            return dr[0][b]
        }
        if (b == 0) {
            return dl[a][0]
        }
        return min(dl[a][b], dr[a][b])
    }
}
