package g0501_0600.s0552_student_attendance_record_ii

// #Hard #Dynamic_Programming #2023_01_17_Time_151_ms_(100.00%)_Space_33.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun checkRecord(n: Int): Int {
        if (n == 0 || n == 1 || n == 2) {
            return n * 3 + n * (n - 1)
        }
        val mod: Long = 1000000007
        val matrix = arrayOf(
            longArrayOf(1, 1, 0, 1, 0, 0),
            longArrayOf(1, 0, 1, 1, 0, 0),
            longArrayOf(1, 0, 0, 1, 0, 0),
            longArrayOf(0, 0, 0, 1, 1, 0),
            longArrayOf(0, 0, 0, 1, 0, 1),
            longArrayOf(0, 0, 0, 1, 0, 0),
        )
        val e = quickPower(matrix, n - 1)
        return (
            (e[0].sum() + e[1].sum() + e[3].sum()) %
                mod
            ).toInt()
    }

    private fun quickPower(a: Array<LongArray>, times: Int): Array<LongArray> {
        var a = a
        var times = times
        val n = a.size
        var e = Array(n) { LongArray(n) }
        for (i in 0 until n) {
            e[i][i] = 1
        }
        while (times != 0) {
            if (times % 2 == 1) {
                e = multiple(e, a, n)
            }
            times = times shr 1
            a = multiple(a, a, n)
        }
        return e
    }

    private fun multiple(a: Array<LongArray>, b: Array<LongArray>, n: Int): Array<LongArray> {
        val target = Array(n) { LongArray(n) }
        for (j in 0 until n) {
            for (k in 0 until n) {
                for (l in 0 until n) {
                    target[j][k] += a[j][l] * b[l][k]
                    target[j][k] = target[j][k] % 1000000007
                }
            }
        }
        return target
    }
}
