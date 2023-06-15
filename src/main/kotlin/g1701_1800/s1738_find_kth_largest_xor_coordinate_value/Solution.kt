package g1701_1800.s1738_find_kth_largest_xor_coordinate_value

// #Medium #Array #Matrix #Bit_Manipulation #Heap_Priority_Queue #Prefix_Sum #Divide_and_Conquer
// #Quickselect
class Solution {
    fun kthLargestValue(matrix: Array<IntArray>, k: Int): Int {
        var t: Int = 0
        val rows: Int = matrix.size
        val cols: Int = matrix.get(0).size
        val prefixXor: Array<IntArray> = Array(rows + 1, { IntArray(cols + 1) })
        val array: IntArray = IntArray(rows * cols)
        for (r in 1..rows) {
            for (c in 1..cols) {
                prefixXor.get(r)[c] = (matrix.get(r - 1).get(c - 1)
                        xor prefixXor.get(r - 1).get(c)
                        xor prefixXor.get(r).get(c - 1)
                        xor prefixXor.get(r - 1).get(c - 1))
                array[t++] = prefixXor.get(r).get(c)
            }
        }
        val target: Int = array.size - k
        quickSelect(array, 0, array.size - 1, target)
        return array.get(target)
    }

    private fun quickSelect(array: IntArray, left: Int, right: Int, target: Int): Int {
        if (left == right) {
            return left
        }
        val pivot: Int = array.get(right)
        var j: Int = left
        var k: Int = right - 1
        while (j <= k) {
            if (array.get(j) < pivot) {
                j++
            } else if (array.get(k) > pivot) {
                k--
            } else {
                swap(array, j++, k--)
            }
        }
        swap(array, j, right)
        if (j == target) {
            return j
        } else if (j > target) {
            return quickSelect(array, left, j - 1, target)
        } else {
            return quickSelect(array, j + 1, right, target)
        }
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val tmp: Int = array.get(i)
        array[i] = array.get(j)
        array[j] = tmp
    }
}
