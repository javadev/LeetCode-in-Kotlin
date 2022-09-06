package g0201_0300.s0212_word_search_ii

// #Hard #Top_Interview_Questions #Array #String #Matrix #Backtracking #Trie
// #2022_07_02_Time_21_ms_(99.42%)_Space_44.1_MB_(67.33%)
class Solution {
    private var root: Tree? = null
    fun findWords(board: Array<CharArray>, words: Array<String>): List<String?> {
        if (board.size < 1 || board[0].size < 1) {
            return emptyList<String>()
        }
        root = Tree()
        for (word in words) {
            Tree.Companion.addWord(root, word)
        }
        val collected: MutableList<String?> = ArrayList()
        for (i in board.indices) {
            for (j in board[0].indices) {
                dfs(board, i, j, root!!, collected)
            }
        }
        return collected
    }

    private fun dfs(board: Array<CharArray>, i: Int, j: Int, cur: Tree, collected: MutableList<String?>) {
        var cur: Tree? = cur
        val c = board[i][j]
        if (c == '-') {
            return
        }
        cur = cur!!.getChild(c)
        if (cur == null) {
            return
        }
        if (cur.end != null) {
            val s = cur.end
            collected.add(s)
            cur.end = null
            if (cur.len() == 0) {
                Tree.Companion.deleteWord(root, s)
            }
        }
        board[i][j] = '-'
        if (i > 0) {
            dfs(board, i - 1, j, cur, collected)
        }
        if (i + 1 < board.size) {
            dfs(board, i + 1, j, cur, collected)
        }
        if (j > 0) {
            dfs(board, i, j - 1, cur, collected)
        }
        if (j + 1 < board[0].size) {
            dfs(board, i, j + 1, cur, collected)
        }
        board[i][j] = c
    }
}
