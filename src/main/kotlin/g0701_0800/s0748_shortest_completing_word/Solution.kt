package g0701_0800.s0748_shortest_completing_word

// #Easy #Array #String #Hash_Table #2023_03_06_Time_172_ms_(100.00%)_Space_36.3_MB_(70.00%)

import java.util.Locale

@Suppress("NAME_SHADOWING", "kotlin:S1874")
class Solution {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        var licensePlate = licensePlate
        licensePlate = licensePlate.toLowerCase(Locale.getDefault())
        val a = IntArray(26)
        for (i in licensePlate.indices) {
            if (Character.isLetter(licensePlate[i])) {
                a[licensePlate[i].code - 'a'.code]++
            }
        }
        var ans = ""
        for (str in words) {
            val a1 = IntArray(26)
            for (element in str) {
                a1[element.code - 'a'.code]++
            }
            var j = 0
            while (j < 26) {
                if (a[j] <= a1[j]) {
                    j++
                } else {
                    break
                }
            }
            if (j == 26 && (ans.isEmpty() || ans.length > str.length)) {
                ans = str
            }
        }
        return ans
    }
}
