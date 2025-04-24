package g1301_1400.s1309_decrypt_string_from_alphabet_to_integer_mapping

// #Easy #String #Programming_Skills_I_Day_9_String
// #2025_04_24_Time_0_ms_(100.00%)_Space_40.80_MB_(77.78%)

class Solution {
    fun freqAlphabets(s: String): String {
        val builder = StringBuilder()
        var i = s.length - 1
        while (i >= 0) {
            if (s[i] == '#') {
                decryptor(builder, i - 1, i - 2, s)
                i -= 3
            } else {
                val ch = (s[i].code - '0'.code + 96).toChar()
                builder.append(ch)
                i--
            }
        }
        return builder.reverse().toString()
    }

    private fun decryptor(builder: StringBuilder, a: Int, b: Int, s: String) {
        builder.append((((s[b].code - '0'.code) * 10 + s[a].code - '0'.code) + 96).toChar())
    }
}
