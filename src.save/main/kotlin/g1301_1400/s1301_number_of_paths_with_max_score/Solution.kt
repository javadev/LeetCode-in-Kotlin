package g1301_1400.s1301_number_of_paths_with_max_score

// #Hard #Array #Dynamic_Programming #Matrix
// #2023_06_05_Time_178_ms_(100.00%)_Space_37.8_MB_(100.00%)

class Solution {
    fun pathsWithMaxScore(board: List<String>): IntArray {
        val rows = board.size
        val columns = board[0].length
        val dp = Array(rows) { Array(columns) { IntArray(2) } }
        for (r in rows - 1 downTo 0) {
            for (c in columns - 1 downTo 0) {
                val current = board[r][c]
                if (current == 'S') {
                    dp[r][c][0] = 0
                    dp[r][c][1] = 1
                } else if (current != 'X') {
                    var maxScore = 0
                    var paths = 0
                    val currentScore = if (current == 'E') 0 else current.code - '0'.code
                    for (dir in DIRECTIONS) {
                        val nextR = r + dir[0]
                        val nextC = c + dir[1]
                        if (nextR < rows && nextC < columns && dp[nextR][nextC][1] > 0) {
                            if (dp[nextR][nextC][0] + currentScore > maxScore) {
                                maxScore = dp[nextR][nextC][0] + currentScore
                                paths = dp[nextR][nextC][1]
                            } else if (dp[nextR][nextC][0] + currentScore == maxScore) {
                                paths = (paths + dp[nextR][nextC][1]) % 1000000007
                            }
                        }
                    }
                    dp[r][c][0] = maxScore
                    dp[r][c][1] = paths
                }
            }
        }
        return intArrayOf(dp[0][0][0], dp[0][0][1])
    }

    companion object {
        private val DIRECTIONS = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(1, 1))
    }
}
