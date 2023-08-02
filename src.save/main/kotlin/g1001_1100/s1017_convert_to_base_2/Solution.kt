package g1001_1100.s1017_convert_to_base_2

// #Medium #Math #2023_05_21_Time_138_ms_(100.00%)_Space_34.5_MB_(100.00%)

class Solution {
    fun baseNeg2(n: Int): String {
        val sb = StringBuilder(Integer.toBinaryString(n))
        sb.reverse()
        var carry = 0
        var sum: Int
        var pos = 0
        while (pos < sb.length) {
            sum = carry + sb[pos].code - '0'.code
            sb.setCharAt(pos, if (sum % 2 == 0) '0' else '1')
            carry = sum / 2
            if (pos % 2 == 1 && sb[pos] == '1') {
                carry += 1
            }
            pos++
            if (pos >= sb.length && carry > 0) {
                sb.append(Integer.toBinaryString(carry))
                carry = 0
            }
        }
        return sb.reverse().toString()
    }
}
