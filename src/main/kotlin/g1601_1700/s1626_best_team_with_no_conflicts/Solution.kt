package g1601_1700.s1626_best_team_with_no_conflicts

// #Medium #Array #Dynamic_Programming #Sorting
// #2023_06_16_Time_370_ms_(100.00%)_Space_40.5_MB_(100.00%)

class Solution {
    private class Player(
        val age: Int,
        val score: Int,
    ) : Comparable<Player> {
        override fun compareTo(other: Player) =
            if (age == other.age) {
                other.score - score
            } else {
                other.age - age
            }
    }

    fun bestTeamScore(scores: IntArray, ages: IntArray): Int {
        val playerList = mutableListOf<Player>()
        repeat(scores.size) {
            playerList.add(
                Player(
                    age = ages[it],
                    score = scores[it],
                ),
            )
        }

        playerList.sort()
        val dp = IntArray(scores.size)
        var bestScore = 0
        for (i in scores.indices) {
            val currentPlayer = playerList[i]
            dp[i] = currentPlayer.score
            for (j in 0 until i) {
                if (playerList[j].score >= currentPlayer.score) {
                    dp[i] = maxOf(dp[i], dp[j] + currentPlayer.score)
                }
            }
            bestScore = maxOf(bestScore, dp[i])
        }

        return bestScore
    }
}
