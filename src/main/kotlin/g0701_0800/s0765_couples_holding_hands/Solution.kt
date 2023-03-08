package g0701_0800.s0765_couples_holding_hands

// #Hard #Depth_First_Search #Greedy #Breadth_First_Search #Graph #Union_Find
// #2023_03_08_Time_131_ms_(100.00%)_Space_33.6_MB_(50.00%)

class Solution {
    fun minSwapsCouples(row: IntArray): Int {
        var swaps = 0
        var i = 0
        while (i < row.size - 1) {
            val coupleValue = if (row[i] % 2 == 0) row[i] + 1 else row[i] - 1
            if (row[i + 1] != coupleValue) {
                swaps++
                val coupleIndex = findIndex(row, coupleValue)
                swap(row, coupleIndex, i + 1)
            }
            i += 2
        }
        return swaps
    }

    private fun swap(row: IntArray, i: Int, j: Int) {
        val tmp = row[i]
        row[i] = row[j]
        row[j] = tmp
    }

    private fun findIndex(row: IntArray, value: Int): Int {
        for (i in row.indices) {
            if (row[i] == value) {
                return i
            }
        }
        return -1
    }
}
