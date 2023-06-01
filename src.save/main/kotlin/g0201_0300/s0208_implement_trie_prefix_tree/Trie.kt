package g0201_0300.s0208_implement_trie_prefix_tree

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Design #Trie
// #Level_2_Day_16_Design #Udemy_Trie_and_Heap
// #2022_09_10_Time_689_ms_(61.00%)_Space_87.9_MB_(36.00%)

class Trie {
    private val root: TrieNode
    private var startWith = false

    class TrieNode {
        // Initialize your data structure here.
        var children: Array<TrieNode?>
        var isWord = false

        init {
            children = arrayOfNulls(26)
        }
    }

    // Inserts a word into the trie.
    fun insert(word: String) {
        insert(word, root, 0)
    }

    private fun insert(word: String, root: TrieNode?, idx: Int) {
        if (idx == word.length) {
            root!!.isWord = true
            return
        }
        val index = word[idx] - 'a'
        if (root!!.children[index] == null) {
            root.children[index] = TrieNode()
        }
        insert(word, root.children[index], idx + 1)
    }

    // Returns if the word is in the trie.
    @JvmOverloads
    fun search(word: String, root: TrieNode? = this.root, idx: Int = 0): Boolean {
        if (idx == word.length) {
            startWith = true
            return root!!.isWord
        }
        val index = word[idx] - 'a'
        if (root!!.children[index] == null) {
            startWith = false
            return false
        }
        return search(word, root.children[index], idx + 1)
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    fun startsWith(prefix: String): Boolean {
        search(prefix)
        return startWith
    }

    init {
        root = TrieNode()
    }
}
