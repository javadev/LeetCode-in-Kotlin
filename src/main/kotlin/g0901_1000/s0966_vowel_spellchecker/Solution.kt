package g0901_1000.s0966_vowel_spellchecker

// #Medium #Array #String #Hash_Table #2023_05_05_Time_371_ms_(100.00%)_Space_77.8_MB_(50.00%)

import java.util.Locale
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class Solution {
    private var matched: HashSet<String>? = null
    private var capitalizations: HashMap<String, String>? = null
    private var vowelErrors: HashMap<String, String>? = null
    private fun isVowel(w: Char): Boolean {
        return w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u'
    }

    private fun removeVowels(word: String): String {
        val s = StringBuilder()
        for (w in word.toCharArray()) {
            s.append(if (isVowel(w)) '*' else w)
        }
        return s.toString()
    }

    private fun solveQuery(query: String): String? {
        if (matched!!.contains(query)) {
            return query
        }
        var word = query.lowercase(Locale.getDefault())
        if (capitalizations!!.containsKey(word)) {
            return capitalizations!![word]
        }
        word = removeVowels(word)
        return if (vowelErrors!!.containsKey(word)) {
            vowelErrors!![word]
        } else ""
    }

    fun spellchecker(wordlist: Array<String>, queries: Array<String>): Array<String?> {
        val answer = arrayOfNulls<String>(queries.size)
        matched = HashSet()
        capitalizations = HashMap()
        vowelErrors = HashMap()
        for (word in wordlist) {
            matched!!.add(word)
            var s = word.lowercase(Locale.getDefault())
            capitalizations!!.putIfAbsent(s, word)
            s = removeVowels(s)
            vowelErrors!!.putIfAbsent(s, word)
        }
        for (i in queries.indices) {
            answer[i] = solveQuery(queries[i])
        }
        return answer
    }
}
