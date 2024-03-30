package g2001_2100.s2038_remove_colored_pieces_if_both_neighbors_are_the_same_color

// #Medium #String #Math #Greedy #Game_Theory
// #2024_03_30_Time_216_ms_(74.36%)_Space_38.6_MB_(82.05%)

class Solution {
    fun winnerOfGame(colors: String): Boolean {
        var ans = 0
        for (i in 1 until colors.length - 1) {
            if (colors[i] == colors[i - 1] &&
                colors[i] == colors[i + 1]
            ) {
                if (colors[i] == 'A') {
                    ans++
                } else {
                    ans--
                }
            }
        }
        return ans > 0
    }
}
