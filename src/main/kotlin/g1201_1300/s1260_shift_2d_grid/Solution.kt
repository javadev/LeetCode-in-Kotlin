package g1201_1300.s1260_shift_2d_grid

// #Easy #Array #Matrix #Simulation #2023_06_08_Time_302_ms_(100.00%)_Space_38.7_MB_(100.00%)

class Solution {
    fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val flat = IntArray(grid.size * grid[0].size)
        var index = 0
        for (ints in grid) {
            for (j in grid[0].indices) {
                flat[index++] = ints[j]
            }
        }
        val mode = k % flat.size
        var readingIndex = flat.size - mode
        if (readingIndex == flat.size) {
            readingIndex = 0
        }
        val result: MutableList<List<Int>> = ArrayList()
        for (i in grid.indices) {
            val eachRow: MutableList<Int> = ArrayList()
            for (j in grid[0].indices) {
                eachRow.add(flat[readingIndex++])
                if (readingIndex == flat.size) {
                    readingIndex = 0
                }
            }
            result.add(eachRow)
        }
        return result
    }
}
