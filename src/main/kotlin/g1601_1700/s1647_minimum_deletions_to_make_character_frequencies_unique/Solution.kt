package g1601_1700.s1647_minimum_deletions_to_make_character_frequencies_unique

// #Medium #String #Sorting #Greedy #2023_06_18_Time_252_ms_(100.00%)_Space_38.2_MB_(100.00%)

class Solution {
    fun minDeletions(s: String): Int {
        var cnt = 0
        val freq = IntArray(26)
        val seen: MutableSet<Int> = HashSet()
        for (c in s.toCharArray()) {
            freq[c.code - 'a'.code]++
        }
        for (i in 0..25) {
            while (freq[i] > 0 && seen.contains(freq[i])) {
                freq[i]--
                cnt++
            }
            seen.add(freq[i])
        }
        return cnt
    }
}
