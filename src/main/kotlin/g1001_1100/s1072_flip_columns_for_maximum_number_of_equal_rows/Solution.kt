package g1001_1100.s1072_flip_columns_for_maximum_number_of_equal_rows

// #Medium #Array #Hash_Table #Matrix #2023_05_31_Time_536_ms_(100.00%)_Space_108.4_MB_(50.00%)

class Solution {
    fun maxEqualRowsAfterFlips(matrix: Array<IntArray>): Int {
        /*
        Idea:
        For a given row[i], 0<=i<m, row[j], 0<=j<m and j!=i, if either of them can have
        all values equal after some number of flips, then
         row[i]==row[j]  <1> or
         row[i]^row[j] == 111...111 <2> (xor result is a row full of '1')

        Go further, in case<2> row[j] can turn to row[i] by flipping each column of row[j]
        IF assume row[i][0] is 0, then question is convert into:
         1> flipping each column of each row if row[i][0] is not '0',
         2> count the frequency of each row.
         The biggest number of frequencies is the answer.
         */

        // O(M*N), int M = matrix.length, N = matrix[0].length;
        var answer = 0
        val frequency: MutableMap<String, Int> = HashMap()
        for (row in matrix) {
            val rowStr = StringBuilder()
            for (c in row) {
                if (row[0] == 1) {
                    rowStr.append(if (c == 1) 0 else 1)
                } else {
                    rowStr.append(c)
                }
            }
            val key = rowStr.toString()
            val value = frequency.getOrDefault(key, 0) + 1
            frequency[key] = value
            answer = answer.coerceAtLeast(value)
        }
        return answer
    }
}
