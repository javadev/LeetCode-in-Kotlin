package g2301_2400.s2352_equal_row_and_column_pairs

import java.util.Arrays

// #Medium #Array #Hash_Table #Matrix #Simulation
class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val tmpCol = IntArray(grid.size)
        val pairsMap: MutableMap<Int, Int> = HashMap()
        var pairsCounter = 0
        for (col in grid[0].indices) {
            for (row in grid.indices) {
                tmpCol[row] = grid[row][col]
            }
            val hashCode = Arrays.hashCode(tmpCol)
            pairsMap[hashCode] = pairsMap.getOrDefault(hashCode, 0) + 1
        }
        for (row in grid) {
            val hashCode = Arrays.hashCode(row)
            if (pairsMap.containsKey(hashCode)) {
                pairsCounter += pairsMap[hashCode]!!
            }
        }
        return pairsCounter
    }
}
