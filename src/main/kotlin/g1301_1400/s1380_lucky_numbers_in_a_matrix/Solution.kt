package g1301_1400.s1380_lucky_numbers_in_a_matrix

// #Easy #Array #Matrix
class Solution {
    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val mini: MutableList<Int> = ArrayList()
        val maxi: MutableList<Int> = ArrayList()
        for (arr in matrix) {
            var min = Int.MAX_VALUE
            for (j in arr) {
                if (min > j) {
                    min = j
                }
            }
            mini.add(min)
        }
        val cols = matrix[0].size
        for (c in 0 until cols) {
            var max = Int.MIN_VALUE
            for (ints in matrix) {
                if (ints[c] > max) {
                    max = ints[c]
                }
            }
            maxi.add(max)
        }
        val res: MutableList<Int> = ArrayList()
        for (value in mini) {
            if (maxi.contains(value)) {
                res.add(value)
            }
        }
        return res
    }
}
