package g0401_0500.s0488_zuma_game

// #Hard #String #Dynamic_Programming #Breadth_First_Search #Memoization
// #2023_01_03_Time_1727_ms_(100.00%)_Space_131.5_MB_(100.00%)

class Solution {
    fun findMinStep(board: String, hand: String): Int {
        return dfs(board, hand)
    }

    private fun dfs(board: String, hand: String): Int {
        return findMinStepDp(board, hand, HashMap())
    }

    private fun findMinStepDp(board: String, hand: String, dp: MutableMap<String, MutableMap<String, Int?>?>): Int {
        if (board.isEmpty()) {
            return 0
        }
        if (hand.isEmpty()) {
            return -1
        }
        if (dp[board] != null && dp[board]!![hand] != null) {
            return dp[board]!![hand]!!
        }
        var min = -1
        for (i in 0..board.length) {
            for (j in 0 until hand.length) {
                if ((j == 0 || hand[j] != hand[j - 1]) &&
                    (i == 0 || board[i - 1] != hand[j]) &&
                    (
                        i < board.length && board[i] == hand[j] || i > 0 &&
                            i < board.length && board[i - 1] == board[i] && board[i] != hand[j]
                        )
                ) {
                    val newS = StringBuilder(board)
                    newS.insert(i, hand[j])
                    val sR = findMinStepDp(
                        removeRepeated(newS.toString()),
                        hand.substring(0, j) + hand.substring(j + 1, hand.length),
                        dp,
                    )
                    if (sR != -1) {
                        min = if (min == -1) sR + 1 else Integer.min(min, sR + 1)
                    }
                }
            }
        }
        dp.putIfAbsent(board, HashMap())
        dp[board]!![hand] = min
        return min
    }

    private fun removeRepeated(original: String): String {
        var count = 1
        var i = 1
        while (i < original.length) {
            if (original[i] == original[i - 1]) {
                count++
                i++
            } else {
                if (count >= 3) {
                    return removeRepeated(
                        original.substring(0, i - count) +
                            original.substring(i, original.length),
                    )
                } else {
                    count = 1
                    i++
                }
            }
        }
        return if (count >= 3) {
            removeRepeated(original.substring(0, original.length - count))
        } else {
            original
        }
    }
}
