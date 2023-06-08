package g1201_1300.s1240_tiling_a_rectangle_with_the_fewest_squares

// #Hard #Dynamic_Programming #Backtracking
class Solution {
    private var n = 0
    private var m = 0
    private lateinit var covered: Array<BooleanArray>
    private var res = 0

    fun tilingRectangle(n: Int, m: Int): Int {
        this.n = n
        this.m = m
        covered = Array(n) { BooleanArray(m) }
        res = m * n
        backtrack(0)
        return res
    }

    private fun backtrack(count: Int) {
        if (count >= res) {
            return
        }
        var find = false
        for (r in 0 until n) {
            for (c in 0 until m) {
                if (!covered[r][c]) {
                    find = true
                    var len = findMaxWidth(r, c)
                    while (len > 0) {
                        cover(r, c, len, true)
                        backtrack(count + 1)
                        cover(r, c, len, false)
                        len--
                    }
                    break
                }
            }
            if (find) {
                break
            }
        }
        if (!find) {
            res = count
        }
    }

    private fun cover(r: Int, c: Int, len: Int, flag: Boolean) {
        for (i in r until r + len) {
            for (j in c until c + len) {
                covered[i][j] = flag
            }
        }
    }

    private fun findMaxWidth(r: Int, c: Int): Int {
        var len = Math.min(n - r, m - c)
        while (true) {
            var find = false
            for (i in r until r + len) {
                for (j in c until c + len) {
                    if (covered[i][j]) {
                        find = true
                        len = Math.min(i - r, j - c)
                        break
                    }
                }
                if (find) {
                    break
                }
            }
            if (!find) {
                break
            }
        }
        return len
    }
}
