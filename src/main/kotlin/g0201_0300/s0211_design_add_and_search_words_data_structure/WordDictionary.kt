package g0201_0300.s0211_design_add_and_search_words_data_structure

// #Medium #String #Depth_First_Search #Design #Trie #Top_Interview_150_Trie
// #2022_10_24_Time_2256_ms_(87.04%)_Space_237.4_MB_(83.33%)

class WordDictionary {
    class TrieNode() {
        val children = Array<TrieNode?>(26) { null }
        var isWord = false
    }

    val trieTree = TrieNode()

    fun addWord(word: String) {
        var p = trieTree
        for (w in word) {
            val i = w - 'a'
            if (p.children[i] == null) p.children[i] = TrieNode()
            p = p.children[i]!!
        }
        p.isWord = true
    }

    fun search(word: String): Boolean {
        fun dfs(p: TrieNode?, start: Int): Boolean {
            if (p == null) return false
            if (start == word.length) return p.isWord
            return if (word[start] == '.') {
                for (i in 0..25) {
                    if (dfs(p.children[i], start + 1)) {
                        return true
                    }
                }
                false
            } else {
                val i = word[start] - 'a'
                dfs(p.children[i], start + 1)
            }
        }
        return dfs(trieTree, 0)
    }
}

/*
 * Your WordDictionary object will be instantiated and called as such:
 * var obj = WordDictionary()
 * obj.addWord(word)
 * var param_2 = obj.search(word)
 */
