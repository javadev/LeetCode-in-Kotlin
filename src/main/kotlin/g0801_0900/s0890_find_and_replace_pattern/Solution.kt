package g0801_0900.s0890_find_and_replace_pattern

// #Medium #Array #String #Hash_Table #2023_04_10_Time_150_ms_(100.00%)_Space_35.9_MB_(11.11%)

import java.util.Collections

class Solution {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        val finalans: MutableList<String> = ArrayList()
        if (pattern.length == 1) {
            Collections.addAll(finalans, *words)
            return finalans
        }
        for (word in words) {
            val check = CharArray(26)
            check.fill('1')
            val ans: HashMap<Char, Char> = HashMap()
            for (j in word.indices) {
                val pat = pattern[j]
                val wor = word[j]
                if (ans.containsKey(pat)) {
                    if (ans[pat] == wor) {
                        if (j == word.length - 1) {
                            finalans.add(word)
                        }
                    } else {
                        break
                    }
                } else {
                    if (j == word.length - 1 && check[wor.code - 'a'.code] == '1') {
                        finalans.add(word)
                    }
                    if (check[wor.code - 'a'.code] != '1' && check[wor.code - 'a'.code] != pat) {
                        break
                    }
                    if (check[wor.code - 'a'.code] == '1') {
                        ans[pat] = wor
                        check[wor.code - 'a'.code] = pat
                    }
                }
            }
        }
        return finalans
    }
}
