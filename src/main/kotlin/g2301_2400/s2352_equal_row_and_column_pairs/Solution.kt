package g2301_2400.s2352_equal_row_and_column_pairs

// #Medium #Array #Hash_Table #Matrix #Simulation #LeetCode_75_Hash_Map/Set
// #2023_07_02_Time_339_ms_(100.00%)_Space_48.6_MB_(96.25%)

class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val rows: MutableMap<Int, Int> = HashMap()
        for (i in grid.indices) {
            val hash = getRowHash(grid[i])
            rows[hash] = rows.getOrDefault(hash, 0) + 1
        }
        var count = 0
        for (i in grid.indices) {
            val hash = getColHash(grid, i)
            count += rows.getOrDefault(hash, 0)
        }
        return count
    }

    private fun getRowHash(grid: IntArray): Int {
        var res = 11
        for (i in grid) res = res * 11 + i
        return res
    }

    private fun getColHash(grid: Array<IntArray>, index: Int): Int {
        var res = 11
        for (i in grid.indices) {
            res = res * 11 + grid[i][index]
        }
        return res
    }
}
