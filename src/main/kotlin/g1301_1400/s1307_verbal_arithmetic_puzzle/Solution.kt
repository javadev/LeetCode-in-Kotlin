package g1301_1400.s1307_verbal_arithmetic_puzzle

// #Hard #Array #String #Math #Backtracking
// #2023_06_05_Time_164_ms_(100.00%)_Space_37.8_MB_(100.00%)

class Solution {
    private lateinit var map: IntArray
    private lateinit var grid: Array<CharArray>
    private var solved = false
    private lateinit var usedDigit: BooleanArray
    private lateinit var mustNotBeZero: BooleanArray
    private var cols = 0
    private var resultRow = 0

    fun isSolvable(words: Array<String>, result: String): Boolean {
        solved = false
        val rows = words.size + 1
        cols = result.length
        grid = Array(rows) { CharArray(cols) }
        mustNotBeZero = BooleanArray(26)
        usedDigit = BooleanArray(10)
        resultRow = rows - 1
        map = IntArray(26)
        map.fill(-1)
        var maxLength = 0
        for (i in words.indices) {
            var j = words[i].length
            if (j > maxLength) {
                maxLength = j
            }
            if (j > 1) {
                mustNotBeZero[words[i][0].code - 'A'.code] = true
            }
            if (j > cols) {
                return false
            }
            for (c in words[i].toCharArray()) {
                grid[i][--j] = c
            }
        }
        if (maxLength + 1 < cols) {
            return false
        }
        var j = cols
        if (j > 1) {
            mustNotBeZero[result[0].code - 'A'.code] = true
        }
        for (c in result.toCharArray()) {
            grid[resultRow][--j] = c
        }
        backtrack(0, 0, 0)
        return solved
    }

    private fun canPlace(ci: Int, d: Int): Boolean {
        return !usedDigit[d] && map[ci] == -1 || map[ci] == d
    }

    private fun placeNum(ci: Int, d: Int) {
        usedDigit[d] = true
        map[ci] = d
    }

    private fun removeNum(ci: Int, d: Int) {
        usedDigit[d] = false
        map[ci] = -1
    }

    private fun placeNextNum(r: Int, c: Int, sum: Int) {
        if (r == resultRow && c == cols - 1) {
            solved = sum == 0
        } else {
            if (r == resultRow) {
                backtrack(0, c + 1, sum)
            } else {
                backtrack(r + 1, c, sum)
            }
        }
    }

    private fun backtrack(r: Int, c: Int, sum: Int) {
        val unused = '\u0000'
        if (grid[r][c] == unused) {
            placeNextNum(r, c, sum)
        } else {
            val ci = grid[r][c].code - 'A'.code
            if (r == resultRow) {
                val d = sum % 10
                if (map[ci] == -1) {
                    if (canPlace(ci, d)) {
                        placeNum(ci, d)
                        placeNextNum(r, c, sum / 10)
                        if (solved) {
                            return
                        }
                        removeNum(ci, d)
                    }
                } else {
                    if (map[ci] == d) {
                        placeNextNum(r, c, sum / 10)
                    }
                }
            } else {
                if (map[ci] == -1) {
                    val startIndex = if (mustNotBeZero[ci]) 1 else 0
                    for (d in startIndex..9) {
                        if (canPlace(ci, d)) {
                            placeNum(ci, d)
                            placeNextNum(r, c, sum + d)
                            if (solved) {
                                return
                            }
                            removeNum(ci, d)
                        }
                    }
                } else {
                    placeNextNum(r, c, sum + map[ci])
                }
            }
        }
    }
}
