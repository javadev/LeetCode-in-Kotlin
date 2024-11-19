package g2401_2500.s2435_paths_in_matrix_whose_sum_is_divisible_by_k

// #Hard #Array #Dynamic_Programming #Matrix
// #2023_07_05_Time_752_ms_(100.00%)_Space_76.1_MB_(100.00%)

class Solution {
    private val mod = (1e9 + 7).toInt()
    private var row = 0
    private var col = 0
    private lateinit var cache: Array<Array<IntArray>>

    fun numberOfPaths(grid: Array<IntArray>, k: Int): Int {
        row = grid.size
        col = grid[0].size
        cache = Array(row) { Array(col) { IntArray(k) { -1 } } }

        return numberOfPaths(grid, 0, 0, k, 0)
    }

    // return the number of path with <Sum([r][c] ~ [ROW][COL]) % k == remainder>
    private fun numberOfPaths(grid: Array<IntArray>, r: Int, c: Int, k: Int, remainder: Int): Int {
        if (r to c !in grid) return 0
        if (cache[r][c][remainder] != -1) return cache[r][c][remainder]
        if (r == row - 1 && c == col - 1) {
            return if (grid[r][c] % k == remainder) 1 else 0
        }

        return ((remainder - grid[r][c] + 100 * k) % k).let {
            (numberOfPaths(grid, r + 1, c, k, it) + numberOfPaths(grid, r, c + 1, k, it)) % mod
        }.also {
            cache[r][c][remainder] = it
        }
    }

    private operator fun Array<IntArray>.contains(pair: Pair<Int, Int>): Boolean {
        return (0 <= pair.first && pair.first < this.size) &&
            (0 <= pair.second && pair.second < this[0].size)
    }
}
