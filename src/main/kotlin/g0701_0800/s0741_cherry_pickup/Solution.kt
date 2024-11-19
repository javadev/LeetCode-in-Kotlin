package g0701_0800.s0741_cherry_pickup

// #Hard #Array #Dynamic_Programming #Matrix
// #2023_03_03_Time_196_ms_(100.00%)_Space_37.3_MB_(100.00%)

class Solution {
    fun cherryPickup(grid: Array<IntArray>): Int {
        val dp = Array(grid.size) {
            Array(grid.size) {
                IntArray(
                    grid.size,
                )
            }
        }
        val ans = solve(0, 0, 0, grid, dp)
        return ans.coerceAtLeast(0)
    }

    private fun solve(r1: Int, c1: Int, r2: Int, arr: Array<IntArray>, dp: Array<Array<IntArray>>): Int {
        val c2 = r1 + c1 - r2
        if (r1 >= arr.size || r2 >= arr.size || c1 >= arr[0].size || c2 >= arr[0].size || arr[r1][c1] == -1 ||
            arr[r2][c2] == -1
        ) {
            return Int.MIN_VALUE
        }
        if (r1 == arr.size - 1 && c1 == arr[0].size - 1) {
            return arr[r1][c1]
        }
        if (dp[r1][c1][r2] != 0) {
            return dp[r1][c1][r2]
        }
        var cherries = 0
        cherries += if (r1 == r2 && c1 == c2) {
            arr[r1][c1]
        } else {
            arr[r1][c1] + arr[r2][c2]
        }
        val a = solve(r1, c1 + 1, r2, arr, dp)
        val b = solve(r1 + 1, c1, r2 + 1, arr, dp)
        val c = solve(r1, c1 + 1, r2 + 1, arr, dp)
        val d = solve(r1 + 1, c1, r2, arr, dp)
        cherries += a.coerceAtLeast(b).coerceAtLeast(c.coerceAtLeast(d))
        dp[r1][c1][r2] = cherries
        return cherries
    }
}
