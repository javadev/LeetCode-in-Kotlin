package g0201_0300.s0211_design_add_and_search_words_data_structure

// #Medium #String #Depth_First_Search #Design #Trie
// #2022_07_02_Time_445_ms_(96.00%)_Space_104.3_MB_(83.47%)
class WordDictionary {
    class Node internal constructor(var value: Char) {
        var isEnd = false
        var childs: Array<Node?>

        init {
            childs = arrayOfNulls(26)
        }

        fun getChild(ch: Char): Node? {
            return childs[ch.code - 'a'.code]
        }

        fun isChild(ch: Char): Boolean {
            return getChild(ch) != null
        }

        fun addChild(ch: Char) {
            childs[ch.code - 'a'.code] = Node(ch)
        }
    }

    // dummy value
    private val root = Node('a')
    fun addWord(word: String) {
        var node: Node? = root
        for (i in 0 until word.length) {
            val ch = word[i]
            if (!node!!.isChild(ch)) {
                node.addChild(ch)
            }
            node = node.getChild(ch)
        }
        node!!.isEnd = true
    }

    fun search(word: String): Boolean {
        return dfs(this.root, word, 0)
    }

    fun dfs(root: Node?, word: String, index: Int): Boolean {
        if (root == null) {
            return false
        }
        // if reached end of word
        if (index == word.length) {
            return root.isEnd
        }
        val ch = word[index]
        if (ch == '.') {
            for (child in root.childs) {
                val found = dfs(child, word, index + 1)
                if (found) {
                    return true
                }
            }
            return false
        }
        return if (!root.isChild(ch)) {
            false
        } else dfs(root.getChild(ch), word, index + 1)
    }
}
