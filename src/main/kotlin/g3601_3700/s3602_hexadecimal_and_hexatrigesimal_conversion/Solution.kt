package g3601_3700.s3602_hexadecimal_and_hexatrigesimal_conversion

// #Easy #String #Math #2025_07_07_Time_2_ms_(100.00%)_Space_41.91_MB_(100.00%)

class Solution {
    fun concatHex36(n: Int): String {
        var t = n * n
        var k: Int
        val st = StringBuilder()
        var tmp = StringBuilder()
        while (t > 0) {
            k = t % 16
            t = t / 16
            if (k <= 9) {
                tmp.append(('0'.code + k).toChar())
            } else {
                tmp.append(('A'.code + (k - 10)).toChar())
            }
        }
        for (i in tmp.length - 1 downTo 0) {
            st.append(tmp[i])
        }
        tmp = StringBuilder()
        t = n * n * n
        while (t > 0) {
            k = t % 36
            t = t / 36
            if (k <= 9) {
                tmp.append(('0'.code + k).toChar())
            } else {
                tmp.append(('A'.code + (k - 10)).toChar())
            }
        }
        for (i in tmp.length - 1 downTo 0) {
            st.append(tmp[i])
        }
        return st.toString()
    }
}
