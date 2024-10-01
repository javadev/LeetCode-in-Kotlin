package g3301_3400.s3306_count_of_substrings_containing_every_vowel_and_k_consonants_ii

// #Medium #String #Hash_Table #Sliding_Window
// #2024_10_01_Time_651_ms_(100.00%)_Space_54.9_MB_(40.00%)

import java.util.HashMap
import java.util.HashSet

class Solution {
    fun countOfSubstrings(word: String, k: Int): Long {
        return (
            countOfSubstringHavingAtleastXConsonants(word, k) -
                countOfSubstringHavingAtleastXConsonants(word, k + 1)
            )
    }

    private fun countOfSubstringHavingAtleastXConsonants(word: String, k: Int): Long {
        var start = 0
        var end = 0
        val vowels: MutableSet<Char?> = HashSet<Char?>()
        vowels.add('a')
        vowels.add('e')
        vowels.add('i')
        vowels.add('o')
        vowels.add('u')
        var consonants = 0
        val map: MutableMap<Char?, Int?> = HashMap<Char?, Int?>()
        var res: Long = 0
        while (end < word.length) {
            val ch = word[end]
            // adding vowel or consonants;
            if (vowels.contains(ch)) {
                if (map.containsKey(ch)) {
                    map.put(ch, map[ch]!! + 1)
                } else {
                    map.put(ch, 1)
                }
            } else {
                consonants++
            }
            // checking any valid string ispresent or not
            while (map.size == 5 && consonants >= k) {
                res += (word.length - end).toLong()
                val ch1 = word[start]
                if (vowels.contains(ch1)) {
                    val temp = map[ch1]!! - 1
                    if (temp == 0) {
                        map.remove(ch1)
                    } else {
                        map.put(ch1, temp)
                    }
                } else {
                    consonants--
                }
                start++
            }
            end++
        }
        return res
    }
}
