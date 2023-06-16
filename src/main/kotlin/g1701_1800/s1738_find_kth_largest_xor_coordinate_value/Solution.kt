package g1701_1800.s1738_find_kth_largest_xor_coordinate_value

// #Medium #Array #Matrix #Bit_Manipulation #Heap_Priority_Queue #Prefix_Sum #Divide_and_Conquer
// #Quickselect #2023_06_16_Time_936_ms_(100.00%)_Space_146.3_MB_(100.00%)

class Solution {
    fun kthLargestValue(matrix: Array<IntArray>, k: Int): Int {
        var t = 0
        val rows: Int = matrix.size
        val cols: Int = matrix[0].size
        val prefixXor: Array<IntArray> = Array(rows + 1) { IntArray(cols + 1) }
        val array = IntArray(rows * cols)
        for (r in 1..rows) {
            for (c in 1..cols) {
                prefixXor[r][c] = (
                    matrix[r - 1][c - 1]
                        xor prefixXor[r - 1][c]
                        xor prefixXor[r][c - 1]
                        xor prefixXor[r - 1][c - 1]
                    )
                array[t++] = prefixXor[r][c]
            }
        }
        val target: Int = array.size - k
        quickSelect(array, 0, array.size - 1, target)
        return array[target]
    }

    private fun quickSelect(array: IntArray, left: Int, right: Int, target: Int): Int {
        if (left == right) {
            return left
        }
        val pivot: Int = array[right]
        var j: Int = left
        var k: Int = right - 1
        while (j <= k) {
            if (array[j] < pivot) {
                j++
            } else if (array[k] > pivot) {
                k--
            } else {
                swap(array, j++, k--)
            }
        }
        swap(array, j, right)
        return if (j == target) {
            j
        } else if (j > target) {
            quickSelect(array, left, j - 1, target)
        } else {
            quickSelect(array, j + 1, right, target)
        }
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val tmp: Int = array[i]
        array[i] = array[j]
        array[j] = tmp
    }
}
