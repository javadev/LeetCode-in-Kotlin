package g2601_2700.s2679_sum_in_a_matrix

// #Medium #Array #Sorting #Matrix #Heap_Priority_Queue #Simulation
// #2023_07_27_Time_581_ms_(100.00%)_Space_72.3_MB_(100.00%)

class Solution {
    fun matrixSum(nums: Array<IntArray>): Int {
        var result = 0
        nums.forEach { row ->
            row.sortDescending()
        }
        for (i in 0 until nums[0].size) {
            var max = 0
            for (j in 0 until nums.size) {
                max = maxOf(max, nums[j][i])
            }
            result += max
        }
        return result
    }
}
