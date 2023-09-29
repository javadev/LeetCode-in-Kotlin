package g0001_0100.s0051_n_queens

// #Hard #Top_100_Liked_Questions #Array #Backtracking #Big_O_Time_O(N!)_Space_O(N)
// #2023_07_10_Time_192_ms_(90.74%)_Space_37.8_MB_(88.89%)

class Solution {
    fun solveNQueens(n: Int): List<List<String>> {
        val pos = BooleanArray(n + 2 * n - 1 + 2 * n - 1)
        val pos2 = IntArray(n)
        val ans: MutableList<List<String>> = ArrayList()
        helper(n, 0, pos, pos2, ans)
        return ans
    }

    private fun helper(n: Int, row: Int, pos: BooleanArray, pos2: IntArray, ans: MutableList<List<String>>) {
        if (row == n) {
            construct(n, pos2, ans)
            return
        }
        for (i in 0 until n) {
            val index = n + 2 * n - 1 + n - 1 + i - row
            if (pos[i] || pos[n + i + row] || pos[index]) {
                continue
            }
            pos[i] = true
            pos[n + i + row] = true
            pos[index] = true
            pos2[row] = i
            helper(n, row + 1, pos, pos2, ans)
            pos[i] = false
            pos[n + i + row] = false
            pos[index] = false
        }
    }

    private fun construct(n: Int, pos: IntArray, ans: MutableList<List<String>>) {
        val sol: MutableList<String> = ArrayList()
        for (r in 0 until n) {
            val queenRow = CharArray(n)
            queenRow.fill('.')
            queenRow[pos[r]] = 'Q'
            sol.add(String(queenRow))
        }
        ans.add(sol)
    }
}
