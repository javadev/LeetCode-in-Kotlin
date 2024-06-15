package g3101_3200.s3175_find_the_first_player_to_win_k_games_in_a_row

// #Medium #Array #Simulation #2024_06_15_Time_536_ms_(100.00%)_Space_63.9_MB_(81.82%)

class Solution {
    fun findWinningPlayer(skills: IntArray, k: Int): Int {
        val n = skills.size
        var max = skills[0]
        var cnt = 0
        var res = 0
        for (i in 1 until n) {
            if (skills[i] > max) {
                max = skills[i]
                cnt = 0
                res = i
            }
            cnt += 1
            if (cnt == k) {
                break
            }
        }
        return res
    }
}
