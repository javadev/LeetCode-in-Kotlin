package g1501_1600.s1536_minimum_swaps_to_arrange_a_binary_grid

// #Medium #Array #Greedy #Matrix #2023_06_12_Time_336_ms_(100.00%)_Space_54.8_MB_(100.00%)

class Solution {
    fun minSwaps(grid: Array<IntArray>): Int {
        val len = grid.size
        var swap = 0
        val preProcess = IntArray(len)
        for (i in 0 until len) {
            preProcess[i] = countRightZeros(grid[i])
        }
        for (i in 0 until len) {
            val minValueRequired = len - i - 1
            var j = i
            while (j < len && preProcess[j] < minValueRequired) {
                j++
            }
            if (j == len) {
                return -1
            }
            while (j != i) {
                swap++
                val temp = preProcess[j]
                preProcess[j] = preProcess[j - 1]
                preProcess[j - 1] = temp
                j--
            }
        }
        return swap
    }

    private fun countRightZeros(row: IntArray): Int {
        var cnt = 0
        for (i in row.indices.reversed()) {
            if (row[i] != 0) {
                break
            }
            cnt++
        }
        return cnt
    }
}
