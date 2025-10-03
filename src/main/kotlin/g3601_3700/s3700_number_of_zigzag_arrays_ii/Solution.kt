package g3601_3700.s3700_number_of_zigzag_arrays_ii

// #Hard #Weekly_Contest_469 #2025_10_03_Time_175_ms_(100.00%)_Space_49.83_MB_(50.00%)

class Solution {
    fun zigZagArrays(n: Int, l: Int, r: Int): Int {
        var n = n
        var a = Array(r - l) { LongArray(r - l) }
        var b = Array(r - l) { LongArray(r - l) }
        var result: Long = 0
        for (i in 0..<r - l) {
            a[i][i] = 1
            var j = r - l - 1
            while (i + j >= r - l - 1 && j >= 0) {
                b[i][j] = 1
                j--
            }
        }
        n--
        while (n > 0) {
            if (n % 2 == 1) {
                a = zigZagArrays(a, b)
            }
            b = zigZagArrays(b, b)
            n /= 2
        }
        for (i in 0..<r - l) {
            for (j in 0..<r - l) {
                result += a[i][j]
            }
        }
        return (result * 2 % 1000000007).toInt()
    }

    private fun zigZagArrays(a: Array<LongArray>, b: Array<LongArray>): Array<LongArray> {
        val c = Array(a.size) { LongArray(a.size) }
        for (i in a.indices) {
            for (j in a.indices) {
                for (k in a.indices) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % 1000000007
                }
            }
        }
        return c
    }
}
