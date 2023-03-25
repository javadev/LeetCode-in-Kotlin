package g0801_0900.s0827_making_a_large_island

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #2023_03_25_Time_985_ms_(100.00%)_Space_92.1_MB_(33.33%)

class Solution {
    private lateinit var p: IntArray
    private lateinit var s: IntArray

    private fun makeSet(x: Int, y: Int, rl: Int) {
        val a = x * rl + y
        p[a] = a
        s[a] = 1
    }

    private fun comb(x1: Int, y1: Int, x2: Int, y2: Int, rl: Int) {
        var a = find(x1 * rl + y1)
        var b = find(x2 * rl + y2)
        if (a == b) {
            return
        }
        if (s[a] < s[b]) {
            val t = a
            a = b
            b = t
        }
        p[b] = a
        s[a] += s[b]
    }

    private fun find(a: Int): Int {
        if (p[a] == a) {
            return a
        }
        p[a] = find(p[a])
        return p[a]
    }

    fun largestIsland(grid: Array<IntArray>): Int {
        val rl = grid.size
        val cl = grid[0].size
        p = IntArray(rl * cl)
        s = IntArray(rl * cl)
        for (i in 0 until rl) {
            for (j in 0 until cl) {
                if (grid[i][j] == 0) {
                    continue
                }
                makeSet(i, j, rl)
                if (i > 0 && grid[i - 1][j] == 1) {
                    comb(i, j, i - 1, j, rl)
                }
                if (j > 0 && grid[i][j - 1] == 1) {
                    comb(i, j, i, j - 1, rl)
                }
            }
        }
        var m = 0
        var t: Int
        val sz: HashMap<Int, Int> = HashMap()
        for (i in 0 until rl) {
            for (j in 0 until cl) {
                if (grid[i][j] == 0) {
                    // find root, check if same and combine size
                    t = 1
                    if (i > 0 && grid[i - 1][j] == 1) {
                        sz[find((i - 1) * rl + j)] = s[find((i - 1) * rl + j)]
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        sz[find(i * rl + j - 1)] = s[find(i * rl + j - 1)]
                    }
                    if (i < rl - 1 && grid[i + 1][j] == 1) {
                        sz[find((i + 1) * rl + j)] = s[find((i + 1) * rl + j)]
                    }
                    if (j < cl - 1 && grid[i][j + 1] == 1) {
                        sz[find(i * rl + j + 1)] = s[find(i * rl + j + 1)]
                    }
                    for (`val` in sz.values) {
                        t += `val`
                    }
                    m = m.coerceAtLeast(t)
                    sz.clear()
                } else {
                    m = m.coerceAtLeast(s[i * rl + j])
                }
            }
        }
        return m
    }
}
