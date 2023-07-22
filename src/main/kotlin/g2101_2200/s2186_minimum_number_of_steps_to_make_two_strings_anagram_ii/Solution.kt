package g2101_2200.s2186_minimum_number_of_steps_to_make_two_strings_anagram_ii

// #Medium #String #Hash_Table #Counting #2023_06_26_Time_304_ms_(100.00%)_Space_48.2_MB_(100.00%)

class Solution {
    fun minSteps(s: String, t: String): Int {
        val a = IntArray(26)
        for (i in 0 until s.length) {
            a[s[i].code - 'a'.code]++
        }
        for (i in 0 until t.length) {
            a[t[i].code - 'a'.code]--
        }
        var sum = 0
        for (j in a) {
            sum += Math.abs(j)
        }
        return sum
    }
}
