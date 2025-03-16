package g3401_3500.s3485_longest_common_prefix_of_k_strings_after_removal

// #Hard #2025_03_16_Time_251_ms_(100.00%)_Space_86.10_MB_(100.00%)

import kotlin.math.max

class Solution {
    private class TrieNode {
        var children: Array<TrieNode?> = arrayOfNulls<TrieNode>(26)
        var count: Int = 0
        var bestPrefixLength: Int = -1
    }

    private var root: TrieNode? = null

    fun longestCommonPrefix(words: Array<String>, k: Int): IntArray {
        val totalWords = words.size
        val result = IntArray(totalWords)
        if (totalWords - 1 < k) {
            return result
        }
        root = TrieNode()
        for (word in words) {
            // insert the word with increasing the count by 1 (prefix count)
            updateTrie(word, 1, k)
        }
        for (i in 0..<totalWords) {
            // temp deletion of the word with count decreased by 1
            updateTrie(words[i], -1, k)
            result[i] = root!!.bestPrefixLength
            // re-insertion of the word
            updateTrie(words[i], 1, k)
        }
        return result
    }

    private fun updateTrie(word: String, count: Int, k: Int) {
        val wordLength = word.length
        // used to store the path used during trie travesal to update the count and use the count
        val nodePath: Array<TrieNode> = Array<TrieNode>(wordLength + 1) { TrieNode() }
        val depths = IntArray(wordLength + 1)
        nodePath[0] = root!!
        depths[0] = 0
        // trie insertion
        for (i in 0..<wordLength) {
            val letterIndex = word.get(i).code - 'a'.code
            if (nodePath[i].children[letterIndex] == null) {
                nodePath[i].children[letterIndex] = TrieNode()
            }
            nodePath[i + 1] = nodePath[i].children[letterIndex]!!
            depths[i + 1] = depths[i] + 1
        }
        // increase the count of each prefix
        for (node in nodePath) {
            node.count += count
        }
        // find the best prefix
        for (i in nodePath.indices.reversed()) {
            val currentNode = nodePath[i]
            var candidate = (if (currentNode.count >= k) depths[i] else -1)
            for (childNode in currentNode.children) {
                if (childNode != null) {
                    candidate = max(candidate, childNode.bestPrefixLength)
                }
            }
            currentNode.bestPrefixLength = candidate
        }
    }
}
