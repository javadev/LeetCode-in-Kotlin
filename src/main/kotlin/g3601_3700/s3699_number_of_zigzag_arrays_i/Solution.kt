package g3601_3700.s3699_number_of_zigzag_arrays_i

// #Hard #Weekly_Contest_469 #2025_10_03_Time_227_ms_(78.57%)_Space_47.61_MB_(42.86%)

class Solution {
    fun zigZagArrays(n: Int, l: Int, r: Int): Int {
        var r = r
        val mod = (1e9 + 7).toInt()
        r -= l
        val prefix = LongArray(r)
        prefix.fill(1)
        for (i in 1..<prefix.size) {
            prefix[i] += prefix[i - 1]
        }
        var zig = true
        for (i in 1..<n - 1) {
            if (zig) {
                for (j in prefix.size - 2 downTo 0) {
                    prefix[j] += prefix[j + 1]
                    prefix[j] %= mod.toLong()
                }
            } else {
                for (j in 1..<prefix.size) {
                    prefix[j] += prefix[j - 1]
                    prefix[j] %= mod.toLong()
                }
            }
            zig = !zig
        }
        var result: Long = 0
        for (p in prefix) {
            result += p
            result %= mod.toLong()
        }
        result *= 2
        result %= mod.toLong()
        return result.toInt()
    }
}
