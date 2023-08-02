package g2501_2600.s2573_find_the_string_with_lcp

// #Hard #String #Dynamic_Programming #Greedy #Union_Find
// #2023_07_10_Time_853_ms_(100.00%)_Space_147.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun findTheString(lcp: Array<IntArray>): String {
        val n = lcp.size
        val parent = IntArray(n)
        val rank = IntArray(n)
        val chars = IntArray(n)
        val str = IntArray(n)
        for (i in 0 until n) {
            parent[i] = i
            rank[i] = 1
        }
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (lcp[i][j] > 0) {
                    union(parent, rank, i, j)
                }
            }
        }
        var c = 0
        var par: Int
        for (i in 0 until n) {
            par = find(parent, i)
            if (chars[par] == 0) {
                chars[par] = ++c
            }
            if (c > 26) return ""
            str[i] = chars[par]
        }
        var `val`: Int
        val lcpNew = Array(n) { IntArray(n) }
        for (i in n - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                `val` = if (i + 1 < n && j + 1 < n) lcpNew[i + 1][j + 1] else 0
                `val` = if (str[i] == str[j]) 1 + `val` else 0
                lcpNew[i][j] = `val`
                if (lcpNew[i][j] != lcp[i][j]) return ""
            }
        }
        val sb = StringBuilder()
        for (e in str) {
            sb.append((e + 'a'.code - 1).toChar())
        }
        return sb.toString()
    }

    private fun find(parent: IntArray, x: Int): Int {
        return if (x == parent[x]) x else find(parent, parent[x]).also { parent[x] = it }
    }

    private fun union(parent: IntArray, rank: IntArray, u: Int, v: Int) {
        var u = u
        var v = v
        u = find(parent, u)
        v = find(parent, v)
        if (u == v) return
        if (rank[u] >= rank[v]) {
            parent[v] = u
            rank[u] += rank[v]
        } else {
            parent[u] = v
            rank[v] += rank[u]
        }
        return
    }
}
