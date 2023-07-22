package g1301_1400.s1329_sort_the_matrix_diagonally

// #Medium #Array #Sorting #Matrix #2023_06_06_Time_243_ms_(100.00%)_Space_40.1_MB_(80.00%)

class Solution {
    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size
        val sorted = Array(m) { IntArray(n) }
        for (i in m - 1 downTo 0) {
            var iCopy = i
            val list: MutableList<Int> = ArrayList()
            run {
                var j = 0
                while (j < n && iCopy < m) {
                    list.add(mat[iCopy][j])
                    j++
                    iCopy++
                }
            }
            list.sort()
            iCopy = i
            var j = 0
            while (j < n && iCopy < m) {
                sorted[iCopy][j] = list[j]
                j++
                iCopy++
            }
        }
        for (j in n - 1 downTo 1) {
            var jCopy = j
            val list: MutableList<Int> = ArrayList()
            run {
                var i = 0
                while (i < m && jCopy < n) {
                    list.add(mat[i][jCopy])
                    i++
                    jCopy++
                }
            }
            list.sort()
            jCopy = j
            var i = 0
            while (i < m && jCopy < n) {
                sorted[i][jCopy] = list[i]
                i++
                jCopy++
            }
        }
        return sorted
    }
}
