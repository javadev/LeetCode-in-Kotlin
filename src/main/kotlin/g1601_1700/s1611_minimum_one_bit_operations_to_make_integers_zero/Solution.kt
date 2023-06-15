package g1601_1700.s1611_minimum_one_bit_operations_to_make_integers_zero

// #Hard #Dynamic_Programming #Bit_Manipulation #Memoization
// #2023_06_15_Time_127_ms_(100.00%)_Space_32.8_MB_(100.00%)

import java.util.LinkedList

@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumOneBitOperations(n: Int): Int {
        return calc(calculateOneIndex(n))
    }

    private fun calc(indices: LinkedList<Int>): Int {
        if (indices.isEmpty()) {
            return 0
        }
        val index = indices.removeLast()
        return stepOfExp(index) - calc(indices)
    }

    private fun calculateOneIndex(n: Int): LinkedList<Int> {
        var n = n
        val result = LinkedList<Int>()
        var index = 1
        while (n > 0) {
            if (n % 2 == 1) {
                result.add(index)
            }
            n = n shr 1
            index++
        }
        return result
    }

    private fun stepOfExp(index: Int): Int {
        var index = index
        var result = 1
        while (index > 0) {
            result = result shl 1
            index--
        }
        return result - 1
    }
}
