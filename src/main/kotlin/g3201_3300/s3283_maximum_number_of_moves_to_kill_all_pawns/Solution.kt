package g3201_3300.s3283_maximum_number_of_moves_to_kill_all_pawns

// #Hard #Array #Math #Breadth_First_Search #Bit_Manipulation #Bitmask #Game_Theory
// #2025_03_22_Time_119_ms_(100.00%)_Space_66.82_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun initializePositions(positions: Array<IntArray>, pos: Array<IntArray>, kx: Int, ky: Int) {
        val n = positions.size
        for (i in 0..<n) {
            val x = positions[i][0]
            val y = positions[i][1]
            pos[x][y] = i
        }
        pos[kx][ky] = n
    }

    private fun calculateDistances(positions: Array<IntArray>, pos: Array<IntArray>, distances: Array<IntArray>) {
        val n = positions.size
        for (i in 0..<n) {
            var count = n - i
            val visited = Array<BooleanArray>(50) { BooleanArray(50) }
            visited[positions[i][0]][positions[i][1]] = true
            val que: java.util.Queue<IntArray> = java.util.ArrayDeque<IntArray>()
            que.offer(intArrayOf(positions[i][0], positions[i][1]))
            var steps = 1
            while (!que.isEmpty() && count > 0) {
                var size = que.size
                while (size-- > 0) {
                    val cur = que.poll()
                    val x = cur[0]
                    val y = cur[1]
                    for (d in DIRECTIONS) {
                        val nx = x + d[0]
                        val ny = y + d[1]
                        if (0 <= nx && nx < 50 && 0 <= ny && ny < 50 && !visited[nx][ny]) {
                            que.offer(intArrayOf(nx, ny))
                            visited[nx][ny] = true
                            val j = pos[nx][ny]
                            if (j > i) {
                                distances[j][i] = steps
                                distances[i][j] = distances[j][i]
                                if (--count == 0) {
                                    break
                                }
                            }
                        }
                    }
                    if (count == 0) {
                        break
                    }
                }
                steps++
            }
        }
    }

    private fun calculateDP(n: Int, distances: Array<IntArray>): Int {
        val m = (1 shl n) - 1
        val dp = Array<IntArray>(1 shl n) { IntArray(n + 1) }
        for (mask in 1..<(1 shl n)) {
            val isEven = (Integer.bitCount(m xor mask)) % 2 == 0
            for (i in 0..n) {
                var result = 0
                if (isEven) {
                    for (j in 0..<n) {
                        if ((mask and (1 shl j)) > 0) {
                            result = max(
                                result,
                                dp[mask xor (1 shl j)][j] + distances[i][j],
                            )
                        }
                    }
                } else {
                    result = Int.Companion.MAX_VALUE
                    for (j in 0..<n) {
                        if ((mask and (1 shl j)) > 0) {
                            result = min(
                                result,
                                dp[mask xor (1 shl j)][j] + distances[i][j],
                            )
                        }
                    }
                }
                dp[mask][i] = result
            }
        }
        return dp[m][n]
    }

    fun maxMoves(kx: Int, ky: Int, positions: Array<IntArray>): Int {
        val n = positions.size
        val pos = Array<IntArray>(50) { IntArray(50) }
        initializePositions(positions, pos, kx, ky)
        val distances = Array<IntArray>(n + 1) { IntArray(n + 1) }
        calculateDistances(positions, pos, distances)
        return calculateDP(n, distances)
    }

    companion object {
        private val DIRECTIONS = arrayOf<IntArray>(
            intArrayOf(2, 1),
            intArrayOf(1, 2),
            intArrayOf(-1, 2),
            intArrayOf(-2, 1),
            intArrayOf(-2, -1),
            intArrayOf(-1, -2),
            intArrayOf(1, -2),
            intArrayOf(2, -1),
        )
    }
}
