package g2001_2100.s2062_count_vowel_substrings_of_a_string

// #Easy #String #Hash_Table #2023_06_25_Time_216_ms_(60.00%)_Space_37.2_MB_(80.00%)

class Solution {
    fun countVowelSubstrings(word: String): Int {
        var count = 0
        val vowels: Set<Char> = HashSet(listOf('a', 'e', 'i', 'o', 'u'))
        val window: MutableSet<Char> = HashSet()
        for (i in word.indices) {
            window.clear()
            if (vowels.contains(word[i])) {
                window.add(word[i])
                for (j in i + 1 until word.length) {
                    if (!vowels.contains(word[j])) {
                        break
                    } else {
                        window.add(word[j])
                        if (window.size == 5) {
                            count++
                        }
                    }
                }
            }
        }
        return count
    }
}
