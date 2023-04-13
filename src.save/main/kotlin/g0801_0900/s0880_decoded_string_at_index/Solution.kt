package g0801_0900.s0880_decoded_string_at_index

// #Medium #String #Stack #2023_04_08_Time_134_ms_(100.00%)_Space_33.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun decodeAtIndex(s: String, k: Int): String {
        var k = k
        var i = 0
        var count: Long = 0
        while (i < s.length && count <= k) {
            val c = s[i]
            count = if (Character.isDigit(c)) count * (c.code - '0'.code) else count + 1
            i++
        }
        i--
        while (i < s.length) {
            val c = s[i]
            if (Character.isDigit(c)) {
                count /= (c.code - '0'.code).toLong()
                k %= count.toInt()
            } else {
                if (k % count == 0L) {
                    break
                }
                --count
            }
            i--
        }
        return s[i].toString()
    }
}
