package g2501_2600.s2559_count_vowel_strings_in_ranges

// #Medium #Array #String #Prefix_Sum #2023_07_07_Time_638_ms_(100.00%)_Space_111.2_MB_(25.00%)

class Solution {
    fun vowelStrings(words: Array<String>, queries: Array<IntArray>): IntArray {
        val vowels = HashSet(listOf('a', 'e', 'i', 'o', 'u'))
        val n = words.size
        val validWords = IntArray(n)
        for (i in 0 until n) {
            val startChar = words[i][0]
            val endChar = words[i][words[i].length - 1]
            validWords[i] = if (vowels.contains(startChar) && vowels.contains(endChar)) 1 else 0
        }
        val prefix = IntArray(n)
        prefix[0] = validWords[0]
        for (i in 1 until n) {
            prefix[i] = prefix[i - 1] + validWords[i]
        }
        val output = IntArray(queries.size)
        for (i in queries.indices) {
            val start = queries[i][0]
            val end = queries[i][1]
            output[i] = if (start == 0) prefix[end] else prefix[end] - prefix[start - 1]
        }
        return output
    }
}
