package g3401_3500.s3453_separate_squares_i

// #Medium #Array #Binary_Search #2025_02_18_Time_134_ms_(30.30%)_Space_95.92_MB_(93.94%)

class Solution {
    private fun helper(line: Double, squares: Array<IntArray>): Double {
        var aAbove = 0.0
        var aBelow = 0.0
        for (square in squares) {
            val y = square[1]
            val l = square[2]
            val total = l.toDouble() * l
            if (line <= y) {
                aAbove += total
            } else if (line >= y + l) {
                aBelow += total
            } else {
                // The line intersects the square.
                val aboveHeight = (y + l) - line
                val belowHeight = line - y
                aAbove += l * aboveHeight
                aBelow += l * belowHeight
            }
        }
        return aAbove - aBelow
    }

    fun separateSquares(squares: Array<IntArray>): Double {
        var lo = 0.0
        var hi = 2 * 1e9
        for (i in 0..59) {
            val mid = (lo + hi) / 2.0
            val diff = helper(mid, squares)
            if (diff > 0) {
                lo = mid
            } else {
                hi = mid
            }
        }
        return hi
    }
}
