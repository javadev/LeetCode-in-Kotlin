package g1001_1100.s1023_camelcase_matching

// #Medium #String #Two_Pointers #Trie #String_Matching
// #2023_05_22_Time_149_ms_(60.00%)_Space_35.1_MB_(40.00%)

import java.util.LinkedList

class Solution {
    fun camelMatch(queries: Array<String>, pattern: String): List<Boolean> {
        val ret: MutableList<Boolean> = LinkedList()
        for (query in queries) {
            ret.add(check(query, pattern))
        }
        return ret
    }

    private fun check(query: String, pattern: String): Boolean {
        val patternLen = pattern.length
        var patternPos = 0
        var uppercaseCount = 0
        for (element in query) {
            val c = element
            if (Character.isUpperCase(c)) {
                if (patternPos < patternLen && c != pattern[patternPos]) {
                    return false
                }
                uppercaseCount++
                if (uppercaseCount > patternLen) {
                    return false
                }
                patternPos++
            } else {
                if (patternPos < patternLen && c == pattern[patternPos]) {
                    patternPos++
                }
            }
        }
        return patternPos == patternLen
    }
}
