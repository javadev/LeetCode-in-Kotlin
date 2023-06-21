package g1901_2000.s1975_maximum_matrix_sum

// #Medium #Array #Greedy #Matrix #2023_06_21_Time_535_ms_(100.00%)_Space_55.5_MB_(100.00%)

class Solution {
    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        var numNegatives = 0
        var totalSum: Long = 0
        var minNeg = Int.MIN_VALUE
        var minPos = Int.MAX_VALUE
        for (ints in matrix) {
            for (e in matrix[0].indices) {
                val value = ints[e]
                if (value < 0) {
                    numNegatives++
                    totalSum = totalSum - value
                    minNeg = Math.max(value, minNeg)
                } else {
                    totalSum = totalSum + value
                    minPos = Math.min(value, minPos)
                }
            }
        }
        val min = Math.min(minPos, -minNeg)
        return totalSum - numNegatives % 2 * (min + min)
    }
}
