package g0701_0800.s0720_longest_word_in_dictionary

// #Medium #Array #String #Hash_Table #Sorting #Trie
// #2023_02_27_Time_209_ms_(100.00%)_Space_37_MB_(83.33%)

@Suppress("NAME_SHADOWING")
class Solution {
    private val root = Node()
    private var longestWord: String? = ""

    private class Node {
        var children: Array<Node?> = arrayOfNulls(26)
        var str: String? = null

        fun insert(curr: Node?, word: String) {
            var curr = curr
            for (element in word) {
                if (curr!!.children[element.code - 'a'.code] == null) {
                    curr.children[element.code - 'a'.code] = Node()
                }
                curr = curr.children[element.code - 'a'.code]
            }
            curr!!.str = word
        }
    }

    fun longestWord(words: Array<String>): String? {
        for (word in words) {
            root.insert(root, word)
        }
        dfs(root)
        return longestWord
    }

    private fun dfs(curr: Node?) {
        for (i in 0..25) {
            if (curr!!.children[i] != null && curr.children[i]!!.str != null) {
                if (curr.children[i]!!.str!!.length > longestWord!!.length) {
                    longestWord = curr.children[i]!!.str
                }
                dfs(curr.children[i])
            }
        }
    }
}
