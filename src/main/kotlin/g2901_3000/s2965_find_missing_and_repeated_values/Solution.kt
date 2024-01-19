package g2901_3000.s2965_find_missing_and_repeated_values

// #Easy #Array #Hash_Table #Math #Matrix #2024_01_19_Time_235_ms_(91.67%)_Space_40.3_MB_(80.00%)

class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val nSquare = grid.size * grid.size
        var sum = nSquare * (nSquare + 1) / 2
        val found = BooleanArray(nSquare + 1)
        var repeated = 1
        for (row in grid) {
            for (n in row) {
                sum -= n
                if (found[n]) {
                    repeated = n
                }
                found[n] = true
            }
        }
        return intArrayOf(repeated, sum + repeated)
    }
}
