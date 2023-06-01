package g1001_1100.s1074_number_of_submatrices_that_sum_to_target

// #Hard #Array #Hash_Table #Matrix #Prefix_Sum
// #2023_06_01_Time_770_ms_(100.00%)_Space_115.7_MB_(100.00%)

class Solution {
    fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int {
        val rows = matrix.size
        val columns = matrix[0].size
        for (i in 0 until rows) {
            for (j in 1 until columns) {
                matrix[i][j] += matrix[i][j - 1]
            }
        }
        val sumMap: HashMap<Int, Int> = HashMap()
        var cur: Int
        var res = 0
        for (i in 0 until columns) {
            for (j in i until columns) {
                sumMap.clear()
                sumMap[0] = 1
                cur = 0
                for (ints in matrix) {
                    cur += ints[j] - if (i > 0) ints[i - 1] else 0
                    res += sumMap.getOrDefault(cur - target, 0)
                    sumMap[cur] = sumMap.getOrDefault(cur, 0) + 1
                }
            }
        }
        return res
    }
}
