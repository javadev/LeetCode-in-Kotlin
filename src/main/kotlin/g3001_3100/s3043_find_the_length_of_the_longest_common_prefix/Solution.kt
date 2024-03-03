package g3001_3100.s3043_find_the_length_of_the_longest_common_prefix

// #Medium #Array #String #Hash_Table #Trie #2024_02_29_Time_27_ms_(99.94%)_Space_55.6_MB_(78.30%)

import kotlin.math.max

class Solution {
    fun longestCommonPrefix(arr1: IntArray, arr2: IntArray): Int {
        val trie = Trie()
        for (num in arr2) {
            trie.addWord(num.toString())
        }
        var longest = 0
        var `val`: String
        for (num in arr1) {
            `val` = num.toString()
            if (`val`.length > longest) {
                longest = max(longest, trie.findLongestPrefix(`val`))
            }
        }
        return longest
    }

    private class Trie {
        var root: TrieNode = TrieNode()

        fun addWord(word: String) {
            var first: TrieNode? = root
            var codePoint: Int
            for (i in 0 until word.length) {
                codePoint = word[i].code - '0'.code
                if (first!!.nodes[codePoint] == null) {
                    first.nodes[codePoint] = TrieNode()
                }
                first = first.nodes[codePoint]
            }
        }

        fun findLongestPrefix(word: String): Int {
            var first: TrieNode? = root
            var i = 0
            var codePoint: Int
            while (i < word.length) {
                codePoint = word[i].code - '0'.code
                if (first!!.nodes[codePoint] == null) {
                    return i
                }
                first = first.nodes[codePoint]
                i++
            }
            return i
        }
    }

    private class TrieNode {
        var nodes: Array<TrieNode?> =
            arrayOfNulls(10)
    }
}
