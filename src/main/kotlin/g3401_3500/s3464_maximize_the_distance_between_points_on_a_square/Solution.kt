package g3401_3500.s3464_maximize_the_distance_between_points_on_a_square

// #Hard #Array #Greedy #Binary_Search #2025_02_25_Time_18_ms_(98.51%)_Space_49.78_MB_(46.27%)

class Solution {
    fun maxDistance(side: Int, points: Array<IntArray>, k: Int): Int {
        val n = points.size
        val p = LongArray(n)
        for (i in 0..<n) {
            val x = points[i][0]
            val y = points[i][1]
            val c: Long
            if (y == 0) {
                c = x.toLong()
            } else if (x == side) {
                c = side + y.toLong()
            } else if (y == side) {
                c = 2L * side + (side - x)
            } else {
                c = 3L * side + (side - y)
            }
            p[i] = c
        }
        p.sort()
        val c = 4L * side
        val tot = 2 * n
        val dArr = LongArray(tot)
        for (i in 0..<n) {
            dArr[i] = p[i]
            dArr[i + n] = p[i] + c
        }
        var lo = 0
        var hi = 2 * side
        var ans = 0
        while (lo <= hi) {
            val mid = (lo + hi) ushr 1
            if (check(mid, dArr, n, k, c)) {
                ans = mid
                lo = mid + 1
            } else {
                hi = mid - 1
            }
        }
        return ans
    }

    private fun check(d: Int, dArr: LongArray, n: Int, k: Int, c: Long): Boolean {
        val len = dArr.size
        val nxt = IntArray(len)
        var j = 0
        for (i in 0..<len) {
            if (j < i + 1) {
                j = i + 1
            }
            while (j < len && dArr[j] < dArr[i] + d) {
                j++
            }
            nxt[i] = if (j < len) j else -1
        }
        for (i in 0..<n) {
            var cnt = 1
            var cur = i
            while (cnt < k) {
                val nx = nxt[cur]
                if (nx == -1 || nx >= i + n) {
                    break
                }
                cur = nx
                cnt++
            }
            if (cnt == k && (dArr[i] + c - dArr[cur]) >= d) {
                return true
            }
        }
        return false
    }
}
