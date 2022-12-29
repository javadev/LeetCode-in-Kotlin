package g0401_0500.s0472_concatenated_words

// #Hard #Array #String #Dynamic_Programming #Depth_First_Search #Trie
// #2022_12_29_Time_484_ms_(100.00%)_Space_48_MB_(100.00%)

import java.util.Arrays

class Solution {
    private val ans: MutableList<String> = ArrayList()
    private var root: Trie? = null
    fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> {
        root = Trie()
        Arrays.sort(
            words
        ) { a: String, b: String ->
            Integer.compare(
                a.length,
                b.length
            )
        }
        for (word in words) {
            var ptr = root
            if (search(word, 0, 0)) {
                ans.add(word)
            } else {
                for (j in 0 until word.length) {
                    if (ptr!!.nxt[word[j].code - 'a'.code] == null) {
                        ptr.nxt[word[j].code - 'a'.code] = Trie()
                    }
                    ptr = ptr.nxt[word[j].code - 'a'.code]
                }
                ptr!!.endHere = true
            }
        }
        return ans
    }

    private fun search(cur: String, idx: Int, wordCnt: Int): Boolean {
        if (idx == cur.length) {
            return wordCnt >= 2
        }
        var ptr = root
        for (i in idx until cur.length) {
            if (ptr!!.nxt[cur[i].code - 'a'.code] == null) {
                return false
            }
            if (ptr.nxt[cur[i].code - 'a'.code]!!.endHere) {
                val ret = search(cur, i + 1, wordCnt + 1)
                if (ret) {
                    return true
                }
            }
            ptr = ptr.nxt[cur[i].code - 'a'.code]
        }
        return ptr!!.endHere && wordCnt >= 2
    }

    private class Trie internal constructor() {
        var nxt: Array<Trie?>
        var endHere: Boolean

        init {
            nxt = arrayOfNulls(26)
            endHere = false
        }
    }
}
