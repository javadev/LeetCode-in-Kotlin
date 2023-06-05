package g1301_1400.s1347_minimum_number_of_steps_to_make_two_strings_anagram

// #Medium #String #Hash_Table #Counting
class Solution {
    fun minSteps(s: String, t: String): Int {
        val counts = IntArray(26)
        for (c in s.toCharArray()) {
            counts[c.code - 'a'.code]++
        }
        for (c in t.toCharArray()) {
            if (counts[c.code - 'a'.code] > 0) {
                counts[c.code - 'a'.code]--
            }
        }
        return counts.sum()
    }
}
