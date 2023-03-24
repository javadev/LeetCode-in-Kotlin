package g0801_0900.s0820_short_encoding_of_words

// #Medium #Array #String #Hash_Table #Trie
// #2023_03_24_Time_231_ms_(100.00%)_Space_41.2_MB_(100.00%)

import java.util.Arrays

class Solution {
    private class Node {
        var nodes = arrayOfNulls<Node>(26)
    }

    private fun insert(node: Node, word: String): Boolean {
        var current: Node? = node
        val n = word.length
        var flag = false
        for (i in n - 1 downTo 0) {
            if (current!!.nodes[word[i].code - 'a'.code] == null) {
                current.nodes[word[i].code - 'a'.code] = Node()
                flag = true
            }
            current = current.nodes[word[i].code - 'a'.code]
        }
        return flag
    }

    fun minimumLengthEncoding(words: Array<String>): Int {
        var out = 0
        Arrays.sort(words) { a: String, b: String -> b.length - a.length }
        val node = Node()
        for (word in words) {
            if (insert(node, word)) {
                out += word.length + 1
            }
        }
        return out
    }
}
