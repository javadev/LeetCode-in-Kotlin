package g3201_3300.s3283_maximum_number_of_moves_to_kill_all_pawns

// #Hard #Array #Math #Breadth_First_Search #Bit_Manipulation #Bitmask #Game_Theory
// #2024_09_11_Time_638_ms_(100.00%)_Space_62.2_MB_(87.50%)

import java.util.LinkedList
import java.util.Queue
import kotlin.math.max
import kotlin.math.min

class Solution {
    private lateinit var distances: Array<IntArray>
    private lateinit var memo: Array<Array<Int?>?>

    fun maxMoves(kx: Int, ky: Int, positions: Array<IntArray>): Int {
        val n = positions.size
        distances = Array<IntArray>(n + 1) { IntArray(n + 1) { 0 } }
        memo = Array<Array<Int?>?>(n + 1) { arrayOfNulls<Int>(1 shl n) }
        // Calculate distances between all pairs of positions (including knight's initial position)
        for (i in 0 until n) {
            distances[n][i] = calculateMoves(kx, ky, positions[i][0], positions[i][1])
            for (j in i + 1 until n) {
                val dist =
                    calculateMoves(
                        positions[i][0],
                        positions[i][1],
                        positions[j][0],
                        positions[j][1],
                    )
                distances[j][i] = dist
                distances[i][j] = distances[j][i]
            }
        }
        return minimax(n, (1 shl n) - 1, true)
    }

    private fun minimax(lastPos: Int, remainingPawns: Int, isAlice: Boolean): Int {
        if (remainingPawns == 0) {
            return 0
        }
        if (memo[lastPos]!![remainingPawns] != null) {
            return memo[lastPos]!![remainingPawns]!!
        }
        var result = if (isAlice) 0 else Int.Companion.MAX_VALUE
        for (i in 0 until distances.size - 1) {
            if ((remainingPawns and (1 shl i)) != 0) {
                val newRemainingPawns = remainingPawns and (1 shl i).inv()
                val moveValue = distances[lastPos][i] + minimax(i, newRemainingPawns, !isAlice)
                result = if (isAlice) {
                    max(result, moveValue)
                } else {
                    min(result, moveValue)
                }
            }
        }
        memo[lastPos]!![remainingPawns] = result
        return result
    }

    private fun calculateMoves(x1: Int, y1: Int, x2: Int, y2: Int): Int {
        if (x1 == x2 && y1 == y2) {
            return 0
        }
        val visited = Array<BooleanArray>(50) { BooleanArray(50) }
        val queue: Queue<IntArray> = LinkedList<IntArray>()
        queue.offer(intArrayOf(x1, y1, 0))
        visited[x1][y1] = true
        while (queue.isNotEmpty()) {
            val current = queue.poll()
            val x = current[0]
            val y = current[1]
            val moves = current[2]
            for (move in KNIGHT_MOVES) {
                val nx = x + move[0]
                val ny = y + move[1]
                if (nx == x2 && ny == y2) {
                    return moves + 1
                }
                if (nx >= 0 && nx < 50 && ny >= 0 && ny < 50 && !visited[nx][ny]) {
                    queue.offer(intArrayOf(nx, ny, moves + 1))
                    visited[nx][ny] = true
                }
            }
        }
        // Should never reach here if input is valid
        return -1
    }

    companion object {
        private val KNIGHT_MOVES = arrayOf<IntArray>(
            intArrayOf(-2, -1),
            intArrayOf(-2, 1),
            intArrayOf(-1, -2),
            intArrayOf(-1, 2),
            intArrayOf(1, -2),
            intArrayOf(1, 2),
            intArrayOf(2, -1),
            intArrayOf(2, 1),
        )
    }
}
