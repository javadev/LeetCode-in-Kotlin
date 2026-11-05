package g3901_4000.s3988_create_grid_with_exactly_k_paths_i

import java.util.*

// #Medium #Array #Math #Matrix #Combinatorics #Staff #Weekly_Contest_510
// #2026_11_03_Time_1_ms_(100.00%)_Space_43.92_MB_(68.14%)

class Solution {
    fun createGrid(m: Int, n: Int, k: Int): Array<String> {
        val dimensions = getDimensions(m, n, k)
        if (dimensions.isEmpty()) {
            return arrayOf<String>()
        }
        val dm = dimensions[0]
        val dn = dimensions[1]
        val grid = initializeGrid(m, n)
        createRequiredPaths(grid, dm, dn)
        addObstacles(grid, dm, dn, k)
        connectRemainingGrid(grid, m, n, dm, dn)
        return convertToStrings(grid, m)
    }

    private fun getDimensions(m: Int, n: Int, k: Int): IntArray {
        if (k == 1) {
            return intArrayOf(0, 0)
        }
        if (k == 2 && m >= 2 && n >= 2) {
            return intArrayOf(1, 1)
        }
        if (k == 3) {
            if (m >= 3 && n >= 2) {
                return intArrayOf(2, 1)
            }
            if (m >= 2 && n >= 3) {
                return intArrayOf(1, 2)
            }
        }
        if (k == 4) {
            return getFourPathDimensions(m, n)
        }
        return IntArray(0)
    }

    private fun getFourPathDimensions(m: Int, n: Int): IntArray {
        if (m >= 4 && n >= 2) {
            return intArrayOf(3, 1)
        }
        if (m >= 2 && n >= 4) {
            return intArrayOf(1, 3)
        }
        if (m >= 3 && n >= 3) {
            return intArrayOf(2, 2)
        }
        return IntArray(0)
    }

    private fun initializeGrid(m: Int, n: Int): Array<CharArray> {
        val grid: Array<CharArray> = Array<CharArray>(m) { CharArray(n) }
        for (row in grid) {
            Arrays.fill(row, '#')
        }
        return grid
    }

    private fun createRequiredPaths(grid: Array<CharArray>, dm: Int, dn: Int) {
        for (i in 0..dm) {
            for (j in 0..dn) {
                grid[i][j] = '.'
            }
        }
    }

    private fun addObstacles(grid: Array<CharArray>, dm: Int, dn: Int, k: Int) {
        if (dm == 2 && dn == 2 && k == 4) {
            grid[0][2] = '#'
            grid[2][0] = '#'
        }
    }

    private fun connectRemainingGrid(grid: Array<CharArray>, m: Int, n: Int, dm: Int, dn: Int) {
        connectVertically(grid, dm, dn, m)
        connectHorizontally(grid, m, dn, n)
    }

    private fun connectVertically(grid: Array<CharArray>, dm: Int, dn: Int, m: Int) {
        for (i in dm + 1..<m) {
            grid[i][dn] = '.'
        }
    }

    private fun connectHorizontally(grid: Array<CharArray>, m: Int, dn: Int, n: Int) {
        for (j in dn + 1..<n) {
            grid[m - 1][j] = '.'
        }
    }

    private fun convertToStrings(grid: Array<CharArray>, m: Int): Array<String> {
        val ans = Array<String>(m) { "" }
        for (i in 0..<m) {
            ans[i] = String(grid[i])
        }
        return ans
    }
}
