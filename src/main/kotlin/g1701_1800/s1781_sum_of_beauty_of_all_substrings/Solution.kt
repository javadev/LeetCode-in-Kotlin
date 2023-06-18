package g1701_1800.s1781_sum_of_beauty_of_all_substrings

// #Medium #String #Hash_Table #Counting #2023_06_18_Time_172_ms_(100.00%)_Space_36.7_MB_(100.00%)

class Solution {
    fun beautySum(s: String): Int {
        var beauty = 0
        for (i in s.indices) {
            val numCountOfFreq = IntArray(s.length + 1 - i)
            val charFreq = IntArray(26)
            charFreq[s[i].code - 'a'.code] = 1
            numCountOfFreq[1] = 1
            var min = 1
            var max = 1
            for (j in i + 1 until s.length) {
                val c = s[j]
                charFreq[c.code - 'a'.code]++
                val freq = charFreq[c.code - 'a'.code]
                numCountOfFreq[freq - 1]--
                numCountOfFreq[freq]++
                if (numCountOfFreq[min] == 0) {
                    min++
                }
                if (min > freq) {
                    min = freq
                }
                if (max < freq) {
                    max = freq
                }
                beauty += max - min
            }
        }
        return beauty
    }
}
