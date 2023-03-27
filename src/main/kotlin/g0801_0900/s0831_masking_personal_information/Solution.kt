package g0801_0900.s0831_masking_personal_information

// #Medium #String #2023_03_25_Time_149_ms_(100.00%)_Space_35.3_MB_(100.00%)

import java.util.Locale

class Solution {
    fun maskPII(s: String): String {
        val masked = StringBuilder()
        return if (Character.isAlphabetic(s[0].code)) {
            val locationOfAtSymbol = s.indexOf("@") - 1
            masked.append(s[0]).append("*****").append(s.substring(locationOfAtSymbol))
            masked.toString().lowercase(Locale.getDefault())
        } else {
            val allDigits = StringBuilder()
            var pointer = -1
            while (++pointer < s.length) {
                if (Character.isDigit(s[pointer])) {
                    allDigits.append(s[pointer])
                }
            }
            val numDigits = allDigits.length
            if (numDigits == 11) {
                masked.append("+*-")
            } else if (numDigits == 12) {
                masked.append("+**-")
            } else if (numDigits == 13) {
                masked.append("+***-")
            }
            masked.append("***-***-").append(allDigits.substring(numDigits - 4))
            masked.toString()
        }
    }
}
