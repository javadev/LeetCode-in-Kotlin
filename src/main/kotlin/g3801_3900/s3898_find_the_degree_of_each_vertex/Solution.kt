package g3801_3900.s3898_find_the_degree_of_each_vertex

// #Easy #Array #Matrix #Graph_Theory #Mid_Level #Weekly_Contest_497
// #2026_08_13_Time_1_ms_(100.00%)_Space_48.48_MB_(42.57%)

class Solution {
    fun findDegrees(matrix: Array<IntArray>): IntArray {
        val res = IntArray(matrix.size)
        val n1 = matrix.size
        val n2 = matrix[0].size
        for (i in 0..<n1) {
            var sum = 0
            for (j in 0..<n2) {
                sum += matrix[i][j]
            }
            res[i] = sum
        }
        return res
    }
}
