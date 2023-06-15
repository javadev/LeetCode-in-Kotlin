package g1701_1800.s1728_cat_and_mouse_ii

// #Hard #Array #Dynamic_Programming #Math #Matrix #Graph #Memoization #Topological_Sort
// #Game_Theory
@Suppress("NAME_SHADOWING")


class Solution {
    private val graphs: Array<Array<List<Int>>> = arrayOf(arrayOf(), arrayOf())
    private var foodPos = 0
    private lateinit var memo: Array<Array<IntArray>>
    fun canMouseWin(grid: Array<String>, catJump: Int, mouseJump: Int): Boolean {
        val m = grid.size
        val n = grid[0].length
        var mousePos = 0
        var catPos = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                val c = grid[i][j]
                if (c == 'F') {
                    foodPos = i * n + j
                } else if (c == 'C') {
                    catPos = i * n + j
                } else if (c == 'M') {
                    mousePos = i * n + j
                }
            }
        }
        graphs[0] = buildGraph(mouseJump, grid)
        graphs[1] = buildGraph(catJump, grid)
        memo = Array(m * n) { Array(m * n) { IntArray(2) } }
        for (i in 0 until m) {
            for (j in 0 until n) {
                val c = grid[i][j]
                if (c == '#' || c == 'F') {
                    continue
                }
                val catTurn = 1
                dfs(i * n + j, foodPos, catTurn)
            }
        }
        return memo[mousePos][catPos][MOUSE_TURN] < 0
    }

    private fun buildGraph(jump: Int, grid: Array<String>): Array<List<Int>> {
        val dirs = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
        val m = grid.size
        val n = grid[0].length
        val graph: Array<List<Int>> = Array(m * n) { mutableListOf() }
        for (i in 0 until m) {
            for (j in 0 until n) {
                val list: MutableList<Int> = ArrayList()
                graph[i * n + j] = list
                if (grid[i][j] == '#') {
                    continue
                }
                list.add(i * n + j)
                for (dir in dirs) {
                    for (step in 1..jump) {
                        val x = i + dir[0] * step
                        val y = j + dir[1] * step
                        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == '#') {
                            break
                        }
                        list.add(x * n + y)
                    }
                }
            }
        }
        return graph
    }

    private fun dfs(p1: Int, p2: Int, turn: Int) {
        var turn = turn
        if (p1 == p2) {
            return
        }
        if ((if (turn == 0) p2 else p1) == foodPos) {
            return
        }
        if (memo[p1][p2][turn] < 0) {
            return
        }
        memo[p1][p2][turn] = -1
        turn = turn xor 1
        for (w in graphs[turn][p2]) {
            if (turn == MOUSE_TURN || ++memo[w][p1][turn] == graphs[turn][w].size) {
                dfs(w, p1, turn)
            }
        }
    }

    companion object {
        private const val MOUSE_TURN = 0
    }
}

