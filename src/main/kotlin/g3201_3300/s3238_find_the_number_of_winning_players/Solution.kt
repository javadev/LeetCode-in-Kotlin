package g3201_3300.s3238_find_the_number_of_winning_players

// #Easy #Array #Hash_Table #Counting #2024_08_07_Time_207_ms_(90.38%)_Space_42_MB_(75.00%)

@Suppress("UNUSED_PARAMETER")
class Solution {
    fun winningPlayerCount(n: Int, pick: Array<IntArray>): Int {
        val dp = Array(11) { IntArray(11) }
        for (ints in pick) {
            val p = ints[0]
            val pi = ints[1]
            dp[p][pi] += 1
        }
        var count = 0
        for (i in 0..10) {
            var win = false
            for (j in 0..10) {
                if (dp[i][j] >= i + 1) {
                    win = true
                    break
                }
            }
            if (win) {
                count += 1
            }
        }
        return count
    }
}
