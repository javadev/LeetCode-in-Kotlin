package g3001_3100.s3076_shortest_uncommon_substring_in_an_array

// #Medium #Array #String #Hash_Table #Trie #2024_04_16_Time_256_ms_(100.00%)_Space_39_MB_(96.36%)

import kotlin.math.min

class Solution {
    private val root = Trie()

    fun shortestSubstrings(arr: Array<String>): Array<String?> {
        val n = arr.size
        for (k in 0 until n) {
            val s = arr[k]
            val cs = s.toCharArray()
            val m = cs.size
            for (i in 0 until m) {
                insert(cs, i, m, k)
            }
        }
        val ans = arrayOfNulls<String>(n)
        for (k in 0 until n) {
            val s = arr[k]
            val cs = s.toCharArray()
            val m = cs.size
            var result = ""
            var resultLen = m + 1
            for (i in 0 until m) {
                val curLen = search(
                    cs, i,
                    min(m.toDouble(), (i + resultLen).toDouble())
                        .toInt(),
                    k
                )
                if (curLen != -1) {
                    val sub = String(cs, i, curLen)
                    if (curLen < resultLen || result.compareTo(sub) > 0) {
                        result = sub
                        resultLen = curLen
                    }
                }
            }
            ans[k] = result
        }
        return ans
    }

    private fun insert(cs: CharArray, start: Int, end: Int, wordIndex: Int) {
        var curr: Trie? = root
        for (i in start until end) {
            val index = cs[i].code - 'a'.code
            if (curr!!.children[index] == null) {
                curr.children[index] = Trie()
            }
            curr = curr.children[index]
            if (curr!!.wordIndex == -1 || curr.wordIndex == wordIndex) {
                curr.wordIndex = wordIndex
            } else {
                curr.wordIndex = -2
            }
        }
    }

    private fun search(cs: CharArray, start: Int, end: Int, wordIndex: Int): Int {
        var cur: Trie? = root
        for (i in start until end) {
            val index = cs[i].code - 'a'.code
            cur = cur!!.children[index]
            if (cur!!.wordIndex == wordIndex) {
                return i - start + 1
            }
        }
        return -1
    }

    private class Trie {
        var children: Array<Trie?> = arrayOfNulls(26)
        var wordIndex: Int = -1
    }
}
