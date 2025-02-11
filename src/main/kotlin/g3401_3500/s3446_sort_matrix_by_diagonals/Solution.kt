package g3401_3500.s3446_sort_matrix_by_diagonals

// #Medium #Array #Sorting #Matrix #2025_02_11_Time_12_ms_(93.75%)_Space_49.17_MB_(12.50%)

class Solution {
    fun sortMatrix(grid: Array<IntArray>): Array<IntArray> {
        val top = 0
        var left = 0
        var right = grid[0].size - 1
        while (top < right) {
            var x = grid[0].size - 1 - left
            val arr = IntArray(left + 1)
            for (i in top..left) {
                arr[i] = grid[i][x++]
            }
            arr.sort()
            x = grid[0].size - 1 - left
            for (i in top..left) {
                grid[i][x++] = arr[i]
            }
            left++
            right--
        }
        var bottom = grid.size - 1
        var x = 0
        while (top <= bottom) {
            val arr = IntArray(bottom + 1)
            for (i in arr.indices) {
                arr[i] = grid[x + i][i]
            }
            arr.sort()
            for (i in arr.indices) {
                grid[x + i][i] = arr[arr.size - 1 - i]
            }
            bottom--
            x++
        }
        return grid
    }
}
