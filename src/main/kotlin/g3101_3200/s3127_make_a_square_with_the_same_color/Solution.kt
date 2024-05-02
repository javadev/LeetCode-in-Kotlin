package g3101_3200.s3127_make_a_square_with_the_same_color

// #Easy #Array #Matrix #Enumeration #2024_05_02_Time_0_ms_(100.00%)_Space_41.7_MB_(64.59%)

class Solution {
    fun canMakeSquare(grid: Array<CharArray>): Boolean {
        val n = grid.size
        val m = grid[0].size
        for (i in 0 until n - 1) {
            for (j in 0 until m - 1) {
                var countBlack = 0
                var countWhite = 0
                for (k in i..i + 1) {
                    for (l in j..j + 1) {
                        if (grid[k][l] == 'W') {
                            countWhite++
                        } else {
                            countBlack++
                        }
                    }
                }
                if (countBlack >= 3 || countWhite >= 3) {
                    return true
                }
            }
        }
        return false
    }
}
