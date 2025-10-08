package g3601_3700.s3692_majority_frequency_characters

// #Easy #String #Hash_Table #Counting #Biweekly_Contest_166
// #2025_10_03_Time_2_ms_(100.00%)_Space_43.05_MB_(100.00%)

class Solution {
    fun majorityFrequencyGroup(s: String): String {
        val cntArray = IntArray(26)
        for (i in 0..<s.length) {
            cntArray[s[i].code - 'a'.code]++
        }
        val freq = IntArray(s.length + 1)
        for (i in 0..25) {
            if (cntArray[i] > 0) {
                freq[cntArray[i]]++
            }
        }
        var size = 0
        var bfreq = 0
        for (i in 0..s.length) {
            val si = freq[i]
            if (si > size || (si == size && i > bfreq)) {
                size = si
                bfreq = i
            }
        }
        val sb = StringBuilder()
        for (i in 0..25) {
            if (cntArray[i] == bfreq) {
                sb.append((i + 'a'.code).toChar())
            }
        }
        return sb.toString()
    }
}
