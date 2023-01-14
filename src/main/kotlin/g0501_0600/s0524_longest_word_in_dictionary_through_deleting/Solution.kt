package g0501_0600.s0524_longest_word_in_dictionary_through_deleting

// #Medium #Array #String #Sorting #Two_Pointers
// #2023_01_14_Time_307_ms_(100.00%)_Space_38.4_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque
import kotlin.collections.HashMap
import kotlin.collections.List
import kotlin.collections.MutableMap
import kotlin.collections.set

class Solution {
    private class Pair(var word: String, var index: Int)

    fun findLongestWord(s: String, dictionary: List<String>): String {
        val map: MutableMap<Char, Deque<Pair?>> = HashMap()
        var c = 'a'
        while (c <= 'z') {
            map[c] = ArrayDeque()
            c++
        }
        for (word in dictionary) {
            map[word[0]]!!.offerFirst(Pair(word, 0))
        }
        var maxLen = 0
        var res = ""
        for (i in 0 until s.length) {
            if (!map[s[i]]!!.isEmpty()) {
                val deque = map[s[i]]!!
                val size = deque.size
                for (j in 0 until size) {
                    val pair = deque.pollLast()!!
                    if (pair.index == pair.word.length - 1) {
                        if (maxLen < pair.word.length) {
                            maxLen = pair.word.length
                            res = pair.word
                        } else if (maxLen == pair.word.length && res.compareTo(pair.word) > 0) {
                            res = pair.word
                        }
                    } else {
                        pair.index++
                        map[pair.word[pair.index]]!!.offerFirst(pair)
                    }
                }
            }
        }
        return res
    }
}
