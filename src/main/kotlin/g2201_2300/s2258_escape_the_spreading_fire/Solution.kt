package g2201_2300.s2258_escape_the_spreading_fire

// #Hard #Array #Breadth_First_Search #Binary_Search #Matrix
// #2023_06_28_Time_304_ms_(100.00%)_Space_38.5_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun setFire(grid: Array<IntArray>, dir: Array<IntArray>): Array<IntArray> {
        val n = grid.size
        val m = grid[0].size
        val bfs = ArrayDeque<Int>()
        val fire = Array(n) { IntArray(m) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                fire[i][j] = Int.MAX_VALUE
                if (grid[i][j] == 1) {
                    fire[i][j] = 0
                    bfs.add(i * m + j)
                }
                if (grid[i][j] == 2) {
                    fire[i][j] = 0
                }
            }
        }
        while (!bfs.isEmpty()) {
            val rm = bfs.removeFirst()
            val x = rm / m
            val y = rm % m
            for (d in 0..3) {
                val nx = x + dir[d][0]
                val ny = y + dir[d][1]
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && fire[nx][ny] == Int.MAX_VALUE) {
                    fire[nx][ny] = fire[x][y] + 1
                    bfs.add(nx * m + ny)
                }
            }
        }
        return fire
    }

    private fun isPoss(fire: Array<IntArray>, dir: Array<IntArray>, time: Int): Boolean {
        var time = time
        if (time >= fire[0][0]) {
            return false
        }
        val n = fire.size
        val m = fire[0].size
        val bfs = ArrayDeque<Int>()
        bfs.add(0)
        val isVis = Array(n) { BooleanArray(m) }
        isVis[0][0] = true
        while (!bfs.isEmpty()) {
            var size = bfs.size
            while (size-- > 0) {
                val rm = bfs.removeFirst()
                val x = rm / m
                val y = rm % m
                if (x == n - 1 && y == m - 1) {
                    return true
                }
                for (d in 0..3) {
                    val nx = x + dir[d][0]
                    val ny = y + dir[d][1]
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && !isVis[nx][ny]) {
                        if (nx == n - 1 && ny == m - 1) {
                            if (time + 1 <= fire[nx][ny]) {
                                isVis[nx][ny] = true
                                bfs.add(nx * m + ny)
                            }
                        } else {
                            if (time + 1 < fire[nx][ny]) {
                                isVis[nx][ny] = true
                                bfs.add(nx * m + ny)
                            }
                        }
                    }
                }
            }
            time++
        }
        return false
    }

    fun maximumMinutes(grid: Array<IntArray>): Int {
        val dir = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, -1))
        val fire = setFire(grid, dir)
        var lo = 0
        var hi = 1e9.toInt()
        while (lo <= hi) {
            val mid = (hi - lo shr 1) + lo
            if (isPoss(fire, dir, mid)) {
                lo = mid + 1
            } else {
                hi = mid - 1
            }
        }
        return hi
    }
}
