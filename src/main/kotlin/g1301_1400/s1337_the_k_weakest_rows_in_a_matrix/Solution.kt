package g1301_1400.s1337_the_k_weakest_rows_in_a_matrix

// #Easy #Array #Sorting #Binary_Search #Matrix #Heap_Priority_Queue #Binary_Search_I_Day_9
// #2023_06_06_Time_216_ms_(77.59%)_Space_42.6_MB_(68.97%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val result = IntArray(mat.size)
        for (i in mat.indices) {
            val index = binarySearch(mat, i, mat[i].size - 1)
            result[i] = index
        }
        var minValue = 101
        val resultK = IntArray(k)
        var index = -1
        for (i in 0 until k) {
            for (j in result.indices) {
                if (result[j] < minValue) {
                    minValue = result[j]
                    index = j
                }
            }
            result[index] = 110
            resultK[i] = index
            index = -1
            minValue = 101
        }
        return resultK
    }

    private fun binarySearch(mat: Array<IntArray>, row: Int, end: Int): Int {
        var end = end
        var start = 0
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (mat[row][mid] == 1) {
                start = mid + 1
            } else if (mat[row][mid] == 0) {
                end = mid - 1
            }
        }
        return start
    }
}
