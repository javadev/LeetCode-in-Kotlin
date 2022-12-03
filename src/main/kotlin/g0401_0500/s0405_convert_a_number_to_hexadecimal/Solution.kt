package g0401_0500.s0405_convert_a_number_to_hexadecimal

// #Easy #Math #Bit_Manipulation #2022_12_03_Time_132_ms_(100.00%)_Space_33.6_MB_(90.32%)

class Solution {
    fun toHex(num: Int): String {
        var num = num
        if (num == 0) {
            return "0"
        }
        val sb = StringBuilder()
        var x: Int
        while (num != 0) {
            x = num and 0xf
            if (x < 10) {
                sb.append(x)
            } else {
                sb.append((x + 87).toChar())
            }
            num = num ushr 4
        }
        return sb.reverse().toString()
    }
}