package g1401_1500.s1408_string_matching_in_an_array

// #Easy #String #String_Matching #2023_06_07_Time_194_ms_(77.78%)_Space_36.8_MB_(77.78%)

class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val set: MutableSet<String> = HashSet()
        for (word in words) {
            for (s in words) {
                if (word != s && word.length < s.length && s.contains(word)) {
                    set.add(word)
                }
            }
        }
        return ArrayList(set)
    }
}
