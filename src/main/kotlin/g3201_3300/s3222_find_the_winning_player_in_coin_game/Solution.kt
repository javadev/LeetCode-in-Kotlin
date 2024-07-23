package g3201_3300.s3222_find_the_winning_player_in_coin_game

// #Easy #Math #Simulation #Game_Theory #2024_07_23_Time_140_ms_(86.44%)_Space_34.3_MB_(77.97%)

class Solution {
    fun losingPlayer(x: Int, y: Int): String {
        var x = x
        var y = y
        var w = false
        while (x > 0 && y >= 4) {
            x--
            y -= 4
            w = !w
        }
        return if (w) "Alice" else "Bob"
    }
}
