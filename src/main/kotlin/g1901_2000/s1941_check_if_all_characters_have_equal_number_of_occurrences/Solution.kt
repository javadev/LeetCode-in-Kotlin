package g1901_2000.s1941_check_if_all_characters_have_equal_number_of_occurrences

// #Easy #String #Hash_Table #Counting #2023_06_20_Time_167_ms_(78.57%)_Space_34.7_MB_(100.00%)

class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        val counter = IntArray(26)
        for (i in 0 until s.length) {
            counter[s[i].code - 'a'.code]++
        }
        var bench = 0
        for (i in 0..25) {
            if (bench == 0) {
                if (counter[i] != 0) {
                    bench = counter[i]
                }
            } else {
                if (counter[i] != 0 && counter[i] != bench) {
                    return false
                }
            }
        }
        return true
    }
}
