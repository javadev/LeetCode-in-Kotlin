package g1601_1700.s1649_create_sorted_array_through_instructions

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2023_06_18_Time_571_ms_(100.00%)_Space_49.7_MB_(100.00%)

class Solution {
    fun createSortedArray(instructions: IntArray): Int {
        var maxValue = 0
        for (num in instructions) {
            maxValue = Math.max(maxValue, num)
        }
        val bit = IntArray(maxValue + 1)
        var cost: Long = 0
        for (i in instructions.indices) {
            updateBIT(bit, maxValue, instructions[i])
            cost += Math.min(
                queryBIT(bit, instructions[i] - 1),
                1 + i - queryBIT(bit, instructions[i])
            ).toLong()
        }
        return (cost % MODULO).toInt()
    }

    private fun updateBIT(bit: IntArray, maxValue: Int, x: Int) {
        var x = x
        while (x <= maxValue) {
            bit[x] += 1
            x += x and -x
        }
    }

    private fun queryBIT(bit: IntArray, x: Int): Int {
        var x = x
        var sum = 0
        while (x > 0) {
            sum += bit[x]
            x -= x and -x
        }
        return sum
    }

    companion object {
        private const val MODULO = 1e9.toLong() + 7
    }
}
