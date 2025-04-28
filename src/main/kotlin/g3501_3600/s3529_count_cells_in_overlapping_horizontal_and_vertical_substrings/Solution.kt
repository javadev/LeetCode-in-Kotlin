package g3501_3600.s3529_count_cells_in_overlapping_horizontal_and_vertical_substrings

// #Medium #Array #String #Matrix #Hash_Function #String_Matching #Rolling_Hash
// #2025_04_27_Time_51_ms_(100.00%)_Space_85.31_MB_(100.00%)

class Solution {
    fun countCells(grid: Array<CharArray>, pattern: String): Int {
        val k = pattern.length
        val lps = makeLps(pattern)
        val m = grid.size
        val n = grid[0].size
        val horiPats = Array(m) { IntArray(n) }
        val vertPats = Array(m) { IntArray(n) }
        var i = 0
        var j = 0
        while (i < m * n) {
            if (grid[i / n][i % n] == pattern[j]) {
                i++
                if (++j == k) {
                    val d = i - j
                    horiPats[d / n][d % n] = horiPats[d / n][d % n] + 1
                    if (i < m * n) {
                        horiPats[i / n][i % n] = horiPats[i / n][i % n] - 1
                    }
                    j = lps[j - 1]
                }
            } else if (j != 0) {
                j = lps[j - 1]
            } else {
                i++
            }
        }
        i = 0
        j = 0
        // now do vert pattern, use i = 0 to m*n -1 but instead index as grid[i % m][i/m]
        while (i < m * n) {
            if (grid[i % m][i / m] == pattern[j]) {
                i++
                if (++j == k) {
                    val d = i - j
                    vertPats[d % m][d / m] = vertPats[d % m][d / m] + 1
                    if (i < m * n) {
                        vertPats[i % m][i / m] = vertPats[i % m][i / m] - 1
                    }
                    j = lps[j - 1]
                }
            } else if (j != 0) {
                j = lps[j - 1]
            } else {
                i++
            }
        }
        i = 1
        while (i < m * n) {
            vertPats[i % m][i / m] += vertPats[(i - 1) % m][(i - 1) / m]
            horiPats[i / n][i % n] += horiPats[(i - 1) / n][(i - 1) % n]
            i++
        }
        var res = 0
        i = 0
        while (i < m) {
            j = 0
            while (j < n) {
                if (horiPats[i][j] > 0 && vertPats[i][j] > 0) {
                    res++
                }
                j++
            }
            i++
        }
        return res
    }

    private fun makeLps(pattern: String): IntArray {
        val n = pattern.length
        val lps = IntArray(n)
        var len = 0
        var i = 1
        lps[0] = 0
        while (i < n) {
            if (pattern[i] == pattern[len]) {
                lps[i++] = ++len
            } else if (len != 0) {
                len = lps[len - 1]
            } else {
                lps[i++] = 0
            }
        }
        return lps
    }
}
