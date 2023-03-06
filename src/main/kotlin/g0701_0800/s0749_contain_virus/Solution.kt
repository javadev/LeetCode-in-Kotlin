package g0701_0800.s0749_contain_virus

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Simulation
// #2023_03_06_Time_201_ms_(100.00%)_Space_37.5_MB_(100.00%)

class Solution {
    private var m = 0
    private var n = 0
    private val dirs = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
    fun containVirus(grid: Array<IntArray>): Int {
        m = grid.size
        n = grid[0].size
        var res = 0
        while (true) {
            var id = 0
            val visited: MutableSet<Int> = HashSet()
            val islands: MutableMap<Int, MutableSet<Int>> = HashMap()
            val scores: MutableMap<Int, MutableSet<Int>> = HashMap()
            val walls: MutableMap<Int, Int> = HashMap()
            for (i in 0 until m) {
                for (j in 0 until n) {
                    if (grid[i][j] == 1 && !visited.contains(i * n + j)) {
                        dfs(i, j, visited, grid, islands, scores, walls, id++)
                    }
                }
            }
            if (islands.isEmpty()) {
                break
            }
            var maxVirus = 0
            for (i in 0 until id) {
                if (scores.getOrDefault(maxVirus, HashSet()).size
                    < scores.getOrDefault(i, HashSet()).size
                ) {
                    maxVirus = i
                }
            }
            res += walls.getOrDefault(maxVirus, 0)
            for (i in 0 until islands.size) {
                for (island in islands[i]!!) {
                    val x = island / n
                    val y = island % n
                    if (i == maxVirus) {
                        grid[x][y] = -1
                    } else {
                        for (dir in dirs) {
                            val nx = x + dir[0]
                            val ny = y + dir[1]
                            if (nx in 0 until m && ny >= 0 && ny < n && grid[nx][ny] == 0) {
                                grid[nx][ny] = 1
                            }
                        }
                    }
                }
            }
        }
        return res
    }

    private fun dfs(
        i: Int,
        j: Int,
        visited: MutableSet<Int>,
        grid: Array<IntArray>,
        islands: MutableMap<Int, MutableSet<Int>>,
        scores: MutableMap<Int, MutableSet<Int>>,
        walls: MutableMap<Int, Int>,
        id: Int
    ) {
        if (!visited.add(i * n + j)) {
            return
        }
        islands.computeIfAbsent(id) { HashSet() }.add(i * n + j)
        for (dir in dirs) {
            val x = i + dir[0]
            val y = j + dir[1]
            if (x < 0 || x >= m || y < 0 || y >= n) {
                continue
            }
            if (grid[x][y] == 1) {
                dfs(x, y, visited, grid, islands, scores, walls, id)
            }
            if (grid[x][y] == 0) {
                scores.computeIfAbsent(
                    id
                ) { HashSet() }.add(x * n + y)
                walls[id] = walls.getOrDefault(id, 0) + 1
            }
        }
    }
}
