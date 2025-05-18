package g3501_3600.s3552_grid_teleportation_traversal

// #Medium #2025_05_18_Time_147_ms_(100.00%)_Space_87.53_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

@Suppress("kotlin:S107")
class Solution {
    private fun initializePortals(m: Int, n: Int, matrix: Array<String>): Array<MutableList<IntArray>> {
        val portalsToPositions: Array<MutableList<IntArray>> = Array(26) { ArrayList() }
        for (i in 0..25) {
            portalsToPositions[i] = ArrayList()
        }
        for (i in 0..<m) {
            for (j in 0..<n) {
                val curr = matrix[i][j]
                if (curr >= 'A' && curr <= 'Z') {
                    portalsToPositions[curr.code - 'A'.code].add(intArrayOf(i, j))
                }
            }
        }
        return portalsToPositions
    }

    private fun initializeQueue(
        queue: Queue<IntArray>,
        visited: Array<BooleanArray?>,
        matrix: Array<String>,
        portalsToPositions: Array<MutableList<IntArray>>,
    ) {
        if (matrix[0][0] != '.') {
            val idx = matrix[0][0].code - 'A'.code
            for (pos in portalsToPositions[idx]) {
                queue.offer(pos)
                visited[pos[0]]!![pos[1]] = true
            }
        } else {
            queue.offer(intArrayOf(0, 0))
        }
        visited[0]!![0] = true
    }

    private fun isValidMove(
        r: Int,
        c: Int,
        m: Int,
        n: Int,
        visited: Array<BooleanArray?>,
        matrix: Array<String>,
    ): Boolean {
        return !(r < 0 || r == m || c < 0 || c == n || visited[r]!![c] || matrix[r][c] == '#')
    }

    private fun processPortal(
        r: Int,
        c: Int,
        m: Int,
        n: Int,
        queue: Queue<IntArray>,
        visited: Array<BooleanArray?>,
        matrix: Array<String>,
        portalsToPositions: Array<MutableList<IntArray>>,
    ): Boolean {
        val idx = matrix[r][c].code - 'A'.code
        for (pos in portalsToPositions[idx]) {
            if (pos[0] == m - 1 && pos[1] == n - 1) {
                return true
            }
            queue.offer(pos)
            visited[pos[0]]!![pos[1]] = true
        }
        return false
    }

    fun minMoves(matrix: Array<String>): Int {
        val m = matrix.size
        val n = matrix[0].length
        if ((m == 1 && n == 1) ||
            (
                matrix[0][0] != '.' &&
                    matrix[m - 1][n - 1] == matrix[0][0]
                )
        ) {
            return 0
        }
        val portalsToPositions = initializePortals(m, n, matrix)
        val visited = Array<BooleanArray?>(m) { BooleanArray(n) }
        val queue: Queue<IntArray> = LinkedList()
        initializeQueue(queue, visited, matrix, portalsToPositions)
        var moves = 0
        while (queue.isNotEmpty()) {
            var sz = queue.size
            while (sz-- > 0) {
                val curr = queue.poll()
                for (adj in ADJACENT) {
                    val r = adj[0] + curr[0]
                    val c = adj[1] + curr[1]
                    if (!isValidMove(r, c, m, n, visited, matrix)) {
                        continue
                    }
                    if (matrix[r][c] != '.') {
                        if (processPortal(r, c, m, n, queue, visited, matrix, portalsToPositions)) {
                            return moves + 1
                        }
                    } else {
                        if (r == m - 1 && c == n - 1) {
                            return moves + 1
                        }
                        queue.offer(intArrayOf(r, c))
                        visited[r]!![c] = true
                    }
                }
            }
            moves++
        }
        return -1
    }

    companion object {
        private val ADJACENT: Array<IntArray> =
            arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, -1))
    }
}
