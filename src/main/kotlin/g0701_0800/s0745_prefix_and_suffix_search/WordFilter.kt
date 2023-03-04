package g0701_0800.s0745_prefix_and_suffix_search

// #Hard #String #Design #Trie #Udemy_Trie_and_Heap
// #2023_03_04_Time_1638_ms_(100.00%)_Space_130.8_MB_(100.00%)

class WordFilter(words: Array<String>) {
    private class TrieNode {
        var children: Array<TrieNode?> = arrayOfNulls(27)
        var weight: Int = 0
    }

    private val root = TrieNode()

    init {
        for (i in words.indices) {
            val s = words[i]
            for (j in s.indices) {
                insert(s.substring(j) + '{' + s, i)
            }
        }
    }

    private fun insert(wd: String, weight: Int) {
        var node: TrieNode? = root
        for (ch in wd.toCharArray()) {
            if (node!!.children[ch.toInt() - 'a'.toInt()] == null) {
                node.children[ch.toInt() - 'a'.toInt()] = TrieNode()
            }
            node = node.children[ch.toInt() - 'a'.toInt()]
            node!!.weight = weight
        }
    }

    fun f(prefix: String, suffix: String): Int {
        return startsWith("$suffix{$prefix")
    }

    private fun startsWith(pref: String): Int {
        var node: TrieNode? = root
        for (ch in pref.toCharArray()) {
            if (node!!.children[ch.toInt() - 'a'.toInt()] == null) {
                return -1
            }
            node = node.children[ch.toInt() - 'a'.toInt()]
        }
        return node!!.weight
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * var obj = WordFilter(words)
 * var param_1 = obj.f(pref,suff)
 */
