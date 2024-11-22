package g0201_0300.s0212_word_search_ii

// #Hard #Top_Interview_Questions #Array #String #Matrix #Backtracking #Trie
// #2022_10_24_Time_268_ms_(100.00%)_Space_37.5_MB_(95.08%)

@Suppress("NAME_SHADOWING")
class Solution {
    private var root: Tree? = null

    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        if (board.isEmpty() || board[0].isEmpty()) {
            return emptyList()
        }
        root = Tree()
        for (word in words) {
            Tree.addWord(root, word)
        }
        val collected: MutableList<String> = ArrayList()
        for (i in board.indices) {
            for (j in board[0].indices) {
                dfs(board, i, j, root, collected)
            }
        }
        return collected
    }

    private fun dfs(board: Array<CharArray>, i: Int, j: Int, cur: Tree?, collected: MutableList<String>) {
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
            val s: String = cur.end!!
            collected.add(s)
            cur.end = null
            if (cur.len() == 0) {
                Tree.deleteWord(root, s)
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
