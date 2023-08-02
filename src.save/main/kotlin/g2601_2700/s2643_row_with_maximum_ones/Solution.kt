package g2601_2700.s2643_row_with_maximum_ones

// #Easy #Array #Matrix #2023_07_18_Time_530_ms_(100.00%)_Space_61.8_MB_(16.67%)

class Solution {
    fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
        var row = -1
        var best = -1
        for ((i, arr) in mat.withIndex()) {
            val sum = arr.sum()
            if (sum > best) {
                best = sum
                row = i
            }
        }
        return intArrayOf(row, best)
    }
}
