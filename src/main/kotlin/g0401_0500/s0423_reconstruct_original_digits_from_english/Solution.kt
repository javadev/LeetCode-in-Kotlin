package g0401_0500.s0423_reconstruct_original_digits_from_english

// #Medium #String #Hash_Table #Math #2022_12_08_Time_349_ms_(100.00%)_Space_47.5_MB_(100.00%)

class Solution {
    fun originalDigits(s: String): String {
        val count = IntArray(26)
        val digits = IntArray(10)
        val str = StringBuilder()
        for (c in s.toCharArray()) {
            ++count[c.code - 'a'.code]
        }
        digits[0] = count[25]
        digits[2] = count[22]
        digits[4] = count[20]
        digits[6] = count[23]
        digits[8] = count[6]
        digits[1] = count[14] - digits[0] - digits[2] - digits[4]
        digits[3] = count[7] - digits[8]
        digits[5] = count[5] - digits[4]
        digits[7] = count[18] - digits[6]
        digits[9] = count[8] - digits[5] - digits[6] - digits[8]
        for (i in 0..9) {
            while (digits[i]-- != 0) {
                str.append((i + 48).toChar())
            }
        }
        return str.toString()
    }
}
