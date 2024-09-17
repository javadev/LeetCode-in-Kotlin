package g3201_3300.s3291_minimum_number_of_valid_strings_to_form_target_i

// #Medium #2024_09_17_Time_566_ms_(70.00%)_Space_50.2_MB_(80.00%)

import kotlin.math.min

class Solution {
    fun minValidStrings(words: Array<String>, target: String): Int {
        val root = TrieNode()
        for (word in words) {
            insert(root, word)
        }
        val n = target.length
        val dp = IntArray(n)
        for (i in n - 1 downTo 0) {
            dp[i] = Int.Companion.MAX_VALUE
            var node = root
            for (j in i until n) {
                val idx = target[j].code - 'a'.code
                if (node.children[idx] == null) {
                    break
                }
                if (j == n - 1) {
                    dp[i] = 1
                } else if (dp[j + 1] >= 0) {
                    dp[i] = min(dp[i], (1 + dp[j + 1]))
                }
                node = node.children[idx]!!
            }
            if (dp[i] == Int.Companion.MAX_VALUE) {
                dp[i] = -1
            }
        }
        return dp[0]
    }

    private fun insert(root: TrieNode, word: String) {
        var node = root
        for (c in word.toCharArray()) {
            if (node.children[c.code - 'a'.code] == null) {
                node.children[c.code - 'a'.code] = TrieNode()
            }
            node = node.children[c.code - 'a'.code]!!
        }
    }

    private class TrieNode {
        var children: Array<TrieNode?> = arrayOfNulls<TrieNode>(26)
    }
}
