package g0301_0400.s0378_kth_smallest_element_in_a_sorted_matrix

// #Medium #Array #Sorting #Binary_Search #Matrix #Heap_Priority_Queue
// #2022_09_11_Time_522_ms_(59.78%)_Space_56.6_MB_(79.61%)

class Solution {
    fun kthSmallest(matrix: Array<IntArray>?, k: Int): Int {
        if (matrix == null || matrix.size == 0) {
            return -1
        }
        var start = matrix[0][0]
        var end = matrix[matrix.size - 1][matrix[0].size - 1]
        // O(log(max-min)) time
        while (start + 1 < end) {
            val mid = start + (end - start) / 2
            if (countLessEqual(matrix, mid) < k) {
                // look towards end
                start = mid
            } else {
                // look towards start
                end = mid
            }
        }

        // leave only with start and end, one of them must be the answer
        // try to see if start fits the criteria first
        return if (countLessEqual(matrix, start) >= k) {
            start
        } else {
            end
        }
    }

    // countLessEqual
    // O(n) Time
    private fun countLessEqual(matrix: Array<IntArray>, target: Int): Int {
        // binary elimination from top right
        var row = 0
        var col: Int = matrix[0].size - 1
        var count = 0
        while (row < matrix.size && col >= 0) {
            if (matrix[row][col] <= target) {
                // get the count in current row
                count += col + 1
                row++
            } else if (matrix[row][col] > target) {
                // eliminate the current col
                col--
            }
        }
        return count
    }
}
