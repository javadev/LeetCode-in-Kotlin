package g0101_0200.s0131_palindrome_partitioning

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Dynamic_Programming
// #Backtracking #2022_09_03_Time_820_ms_(87.27%)_Space_59.5_MB_(90.91%)

class Solution {
    fun partition(s: String): List<List<String>> {
        val res = ArrayList<List<String>>()
        val mem = Array(s.length) { IntArray(s.length) }

        fun isPalindrome(i: Int, j: Int): Boolean {
            if (i > j) {
                return true
            }

            return when (mem[i][j]) {
                1 -> true
                2 -> false
                else -> {
                    val res = s[i] == s[j] && isPalindrome(i + 1, j - 1)
                    mem[i][j] = if (res) 1 else 2
                    res
                }
            }
        }

        fun dfs(start: Int, path: ArrayList<String>) {
            if (start == s.length) {
                res.add(path.toList())
                return
            }

            for (i in start..s.length - 1) {
                if (!isPalindrome(start, i)) {
                    continue
                }
                path.add(s.substring(start..i))
                dfs(i + 1, path)
                path.removeAt(path.size - 1)
            }
        }

        dfs(0, ArrayList())

        return res
    }
}
